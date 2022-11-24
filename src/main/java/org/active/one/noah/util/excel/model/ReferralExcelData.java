package org.active.one.noah.util.excel.model;

import org.active.one.noah.exception.FileNotFoundOrStreamingError;
import org.active.one.noah.util.excel.model.entity.Referral;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReader;
import org.xml.sax.SAXException;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReferralExcelData {

    private String mappingFile;

    private String excelFile;

    private static ReferralExcelData init;

    private ReferralExcelData() {}

    // Singleton principle, so I can create a new instance through this function
    public static ReferralExcelData getInstance() {
        if (getInit() == null) {
            setInit(new ReferralExcelData());
        }
        return getInit();
    }

    private static ReferralExcelData getInit() {
        return init;
    }

    private static void setInit(ReferralExcelData init) {
        ReferralExcelData.init = init;
    }

    // Initialize both files, Excel and XML to read data
    private void setExternalFileLocation(String mappingFile , String excelFile) {
        this.mappingFile = mappingFile;
        this.excelFile = excelFile;
    }

    public Referral input(String mappingFile , String excelFile, int row) {
        ReferralExcelData reference = ReferralExcelData.getInstance();
        reference.setExternalFileLocation(mappingFile, excelFile);
        return reference.doConfigTask().get(row);
    }

    // Read path Excel and XML file initialized in setExternalFileLocation(String mappingFile , String excelFile)
    // Save Excel data into a list of Referral POJO, then make return the list of items captured
    private List<Referral> doConfigTask() {
        try {
            final XLSReader xlsReader = ReaderBuilder.buildFromXML(new File(mappingFile));
            final List<Referral> result = new ArrayList<>();

            final Map<String, Object> beans = new HashMap<>();
            beans.put("referrals", result);
            InputStream inputStream = new BufferedInputStream(Files.newInputStream(Paths.get(excelFile)));
            xlsReader.read(inputStream, beans);
            return result;

        } catch (IOException | SAXException | InvalidFormatException error) {
            throw FileNotFoundOrStreamingError.getInstance("Exception thrown",
                    "IOException | SAXException | InvalidFormatException", error);
        }
    }

}
