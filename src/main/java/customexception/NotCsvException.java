package customexception;

public class NotCsvException extends Exception {

    public NotCsvException(){
        super("File not Csv");
    }

    public NotCsvException(String message){
        super(message);
    }
}
