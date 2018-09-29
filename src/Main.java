import Exceptions.InvalidInputExceptions;
import Exceptions.StopApplicationException;
import operations.BasicOperation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Старт программы.");
        while (true) {
            try {
                BasicOperation basicOperation = new BasicOperation();
                basicOperation.calculate();
            } catch (StopApplicationException e) {
                System.out.println(e.stop());
                return;
            } catch (InvalidInputExceptions invalidInputExceptions) {
                invalidInputExceptions.invalid();
            }
        }


    }
}
