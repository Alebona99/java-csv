package opencsv;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Csv csv = new Csv();

        csv.setFile("/home/alessio/Downloads/biostats.css");
        csv.read().forEach(strings -> System.out.println(Arrays.toString(strings)));
        //System.out.println(csv.get(3));

        //csv.setFilename("/home/alessio/Downloads/sur.css");
        //csv.read().forEach(strings -> System.out.println(Arrays.toString(strings)));

    }
}
