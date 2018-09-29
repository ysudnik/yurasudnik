package operations;

import app.Application;

public class Subtraction extends Application implements Operation {
    @Override
    public void operation() {
        double minus = getA()-getB();
        System.out.println("Результат операции вычитания составляет: "+minus);
    }
}
