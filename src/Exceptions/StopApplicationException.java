package Exceptions;

public class StopApplicationException extends Exception {
public String stop(){
    return "Конец приложения.";
}
}
