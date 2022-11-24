package org.active.one.noah.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"org.active.one.noah.stepdefinitions"},
        features = {"src/test/resources/features/noah"},
        tags = "@create_new_referral",
        publish = true
)
public class TestCaseRunner {}
