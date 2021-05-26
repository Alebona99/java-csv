package opencsv;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Csv csv = new Csv();

        csv.setFile("/home/alessio/Downloads/biostats.csv");

        csv.toJsonPojo();
        csv.toJson();

    }
}
