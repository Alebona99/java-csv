package opencsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.util.*;

/**
 * Classe per lavorare sui file csv
 * Lettura di un file csv
 */
public class Csv {


    private File file;


    /**
     * Costruttore di Default
     */
    public Csv(){ }

    /**
     * Costruttore con parametro
     * @param filename Percorso dove si trova il file
     */
    public Csv(String filename){
        this.file = new File(filename);
    }

    /**
     * Metodo per la lettura di un file csv e della sua scrittura a video
     * @throws Exception
     * @return Ritorna l'array list con i valori del csv, Null se il file non è CSV
     */
    public List<String[]> read() throws Exception {
        if (!file.isFile()){
            throw new FileNotFoundException();
        }
        else {
            if (isCSV()) {
                if (!isEmpty()) {
                    List<String[]> list = new ArrayList<>();
                    CSVReader csvReader = new CSVReader(new FileReader(file));
                    String[] line;
                    while ((line = csvReader.readNext()) != null) {
                        list.add(line);
                    }
                    csvReader.close();
                    //list.forEach(strings -> System.out.println(Arrays.toString(strings)));
                    return list;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    /**
     * Metodo per leggere e stampare il valore nel file csv passato
     * @param i L'indice della riga cercata (contando anche l'header)
     * @return Ritorna la riga cercata, Null se il file non è CSV
     * @throws Exception
     */
    public List<String> get(int i) throws Exception {
        if (!file.isFile()){
            throw new FileNotFoundException();
        }
        else {
            if (isCSV()) {
                if (!isEmpty()) {
                    List<String[]> list = new ArrayList<>();
                    CSVReader csvReader = new CSVReader(new FileReader(file));
                    String[] line;
                    while (((line = csvReader.readNext()) != null)) {
                        list.add(line);
                        if (list.size() == i) {
                            break;
                        }
                    }
                    csvReader.close();

                    return Arrays.asList(list.get(i - 1));
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NullPointerException();
            }
        }
    }



    /**
     * Metodo per controllare se il file immesso è in formato CSV
     * @return True se il file è CSV
     */
    public boolean isCSV(){
        if(FilenameUtils.getExtension(file.getName()).equals("csv") && file.isFile()){
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Metodo che controlla se il file è vuoto
     * @return True se il file è vuoto
     */
    public boolean isEmpty(){
        return file.length() == 0 && file.isFile();
    }



    /**
     * Setter File
     * @param file Percorso del file
     */
    public void setFile(String file) {
        this.file = new File(file);
    }

    /**
     * Getter File
     * @return La directory del file
     */
    public File getFile() {
        return file;
    }

}
