package com.csv;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import opencsv.Csv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import java.io.File;

public class CsvStep {

    Csv csv = new Csv();

    @Given("user have file")
    public void userHaveFile() {
    }

    @When("insert file CSV {string}")
    public void userInsertFileCSV(String arg0) throws Exception{
        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                csv.setFile(arg0);
            }
        });
    }

    @Then("convert the file and see content with first method")
    public void convertTheFileAndSeeContentWithFirstMethod() throws Exception {
        csv.toJson();
        File out = new File("output.json");
        Assertions.assertTrue(out.exists());
    }


    @Then("convert the file and see content with second method")
    public void convertTheFileAndSeeContentWithSecondMethod() throws Exception{
        csv.toJsonPojo();
        File out = new File("prova.json");
        Assertions.assertTrue(out.exists());
    }
}
