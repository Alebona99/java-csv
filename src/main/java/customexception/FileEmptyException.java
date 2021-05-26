package customexception;

public class FileEmptyException extends Exception{

    public FileEmptyException(){
        super("File empty");
    }

    public FileEmptyException(String message){
        super(message);
    }
}
