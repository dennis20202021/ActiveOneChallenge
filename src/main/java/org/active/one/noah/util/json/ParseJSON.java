package org.active.one.noah.util.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.active.one.noah.exception.ParsingError;
import org.active.one.noah.util.enums.GenericPaths;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class ParseJSON {

    private static String source;

    private static String jsonData;

    protected ParseJSON() {
        throw new IllegalStateException("Utility class");
    }

    protected static String getSource() {
        return source;
    }

    protected static void setSource(String source) {
        ParseJSON.source = source;
    }

    protected static String getJsonData() {
        return jsonData;
    }

    protected static void setJsonData(String jsonData) {
        ParseJSON.jsonData = jsonData;
    }

    protected static String getRootJSONData(String data) {
        try {

            setSource(GenericPaths.PATH_TO_JSON_FILE.getValue());

            Reader readJSON = Files.newBufferedReader(Paths.get(getSource()));

            ObjectMapper mapData = new ObjectMapper();

            JsonNode parser = mapData.readTree(readJSON);

            setJsonData(parser.path(data).asText());

            return getJsonData();

        } catch (IOException error) {
            throw ParsingError.getInstance("Element", "JSON Node", error);
        }

    }

}
