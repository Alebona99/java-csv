package opencsv;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CsvTest {

    private Csv csv = new Csv("/home/alessio/Downloads/biostats.csv");


    /**
     * Test Case READ 1
     * Immetto un file non esistente, mi aspetto un eccezione
     * @throws Exception FileNotFoundException
     */
    @org.junit.jupiter.api.Test
    void read_not_exist_file() throws Exception {

        assertThrows(FileNotFoundException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/uii.csv");
                csv.read();
            }
        });
    }

    /**
     * Test case READ 2
     * Immetto un file che non sia un .csv
     * Mi aspetto una NullPointerException
     * @throws Exception NullPointerException
     */
    @Test
    void read_not_csv()throws Exception{


        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/sur.css");
                csv.read();
            }
        });
    }


    /**
     * Test case READ 3
     * Immetto un file .csv vuoto
     * Mi aspetto una NoSuchElementException
     * @throws Exception NoSuchElementException
     */
    @Test
    void read_empty_file() throws Exception{
        assertThrows(NoSuchElementException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/empty.csv");
                csv.read();
            }
        });
    }


    /**
     * Test case GET 1
     * Se il get prende effettivamente 2 valori diversi
     * @throws Exception
     */
    @org.junit.jupiter.api.Test
    void get() throws Exception {
        csv.get(4);

        Assertions.assertFalse(csv.get(4).equals(csv.get(3)));
    }


    /**
     * Test case GET 2
     * Immetto un file non esistente
     * Mi aspetto un eccezione
     * @throws Exception FileNotFoundException
     */
    @Test
    void get_not_exist_file()throws Exception{
        assertThrows(FileNotFoundException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/bingo.cst");
                csv.get(2);
            }
        });
    }


    /**
     * Test case GET 3
     * Immetto un file con formato diverso da .csv
     * Mi aspetto un eccezione
     * @throws Exception NullPointerException
     */
    @Test
    void get_not_csv()throws Exception{
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/sur.css");
                csv.get(3);
            }
        });
    }


    /**
     * Test case Get 4
     * Immetto un file csv vuoto
     * Mi aspetto un eccezione
     * @throws Exception NoSuchElementException
     */
    @Test
    void get_empty_file()throws Exception{
        assertThrows(NoSuchElementException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv("/home/alessio/Downloads/empty.csv");
                csv.get(4);
            }
        });
    }


    /**
     * Test case isCsv 1
     * Inserisco un file csv
     * Mi aspetto che il risultato sia True
     */
    @Test
    void isCSV(){
        Csv csv = new Csv();
        csv.setFile("/home/alessio/Downloads/biostats.csv");
        assertTrue(csv.isCSV());
    }


    /**
     * Test case isCsv 2
     * Inserisco un file non csv
     * Mi aspetto che il risultato sia false
     */
    @Test
    void isCsv_not(){
        Csv csv = new Csv("/home/alessio/Downloads/sur.css");
        assertFalse(csv.isCSV());
    }


    /**
     * Test case isCsv 3
     * Inserisco un file inesistente con estensione csv
     * Mi aspetto un false
     */
    @Test
    void isCsv_not_exist_file(){
        Csv csv = new Csv("/home/alessio/Downloads/france.csv");
        assertFalse(csv.isCSV());
    }

    /**
     * Test case isCsv 4
     * Non inserisco nessun file
     * Mi aspetto un eccezione
     * @throws Exception NullPointerException
     */
    @Test
    void isCsv_nothing()throws Exception{
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv();
                csv.isCSV();
            }
        });

    }


    /**
     * Test case isCsv 5
     * Inserisco come valore null
     * Mi aspetto un eccezione
     * @throws Exception NullPointerException
     */
    @Test
    void isCsv_null()throws Exception{
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv(null);
                csv.isCSV();
            }
        });

    }

    /**
     * Test case isEmpty 1
     * Inserisco un file con degli elementi
     * Mi aspetto false
     */
    @Test
    void isEmpty_not(){
        Csv csv = new Csv("/home/alessio/Downloads/biostats.csv");
        assertFalse(csv.isEmpty());
    }


    /**
     * Test case isEmpty 2
     * Inserisco un file vuoto
     * Mi aspetto true
     */
    @Test
    void isEmpty(){
        Csv csv = new Csv("/home/alessio/Downloads/empty.csv");
        assertTrue(csv.isEmpty());
    }


    /**
     * Test case 3 isEmpty
     * Inserisco un file inesistente
     * Mi aspetto false
     */
    @Test
    void isEmpty_not_exist_file(){
        Csv csv = new Csv("/home/alessio/Downloads/bingo.yml");
        assertFalse(csv.isEmpty());
    }


    /**
     * Test case 4 isEmpty
     * Non inserisco niente
     * Mi aspetto un eccezione
     * @throws Exception NullPointerException
     */
    @Test
    void isEmpty_nothing() throws Exception{
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv();
                csv.isEmpty();
            }
        });
    }


    /**
     * Test case 5 isEmpty
     * @throws Exception
     */
    @Test
    void isEmpty_null() throws Exception{
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Csv csv = new Csv(null);
                csv.isEmpty();
            }
        });
    }

}