package Exceptions;

public class InvalidInputExceptions extends Exception {
    public void invalid(){
        System.out.println("Ошибка!");
        System.out.println("Повторите ввод:");
    }
}
