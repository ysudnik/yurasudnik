package operations;

import app.Application;

public class Multiplication extends Application implements Operation {
    @Override
    public void operation() {
        double res = getA()*getB();
        System.out.println("Результат операции умножения составляет: "+res);
    }
}
