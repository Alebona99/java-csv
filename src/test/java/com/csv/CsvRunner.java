package com.csv;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:report/csv.html", "json:report/csv-report.json"},
        features ={"src/test/java/features/Csv.feature"})
public class CsvRunner {
}
