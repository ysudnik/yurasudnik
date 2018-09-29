package operations;

import Exceptions.InvalidInputExceptions;
import Exceptions.StopApplicationException;
import app.Application;

import java.util.Scanner;

public class BasicOperation extends Application {
    public void calculate() throws InvalidInputExceptions, StopApplicationException {
        System.out.println("Выберите действие:");
        System.out.println("1 - Для операции (+)");
        System.out.println("2 - Для операции (-)");
        System.out.println("3 - Для операции (*)");
        System.out.println("4 - Для операции (/)");
        System.out.println("0 - Для выхода.");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        int x = operation.compareTo("5");
        if (operation.equals("1")) {
            Addition add = new Addition();
            add.operation();
            return;
        }
        if (operation.equals("2")) {
            Subtraction subtraction = new Subtraction();
            subtraction.operation();
            return;
        }
        if (operation.equals("3")) {
            Multiplication multiplication = new Multiplication();
            multiplication.operation();
            return;
        }
        if (operation.equals("4")) {
            Division division = new Division();
            division.operation();
            return;
        }
        if (operation.equals("0")) {
            throw new StopApplicationException();
        }
        if (x <= 0) {
            System.out.println("Ошибка. Нет операции для цифры " + operation);
            System.out.println("Повторите ввод.");
            return;
        } else {
            throw new InvalidInputExceptions();
        }
    }
}


