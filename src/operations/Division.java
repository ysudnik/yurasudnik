package operations;

import app.Application;

public class Division extends Application implements Operation {

    @Override
    public void operation() {
        double div = getA()/getB();
        System.out.println("Результат операции деления составляет: "+div);
    }
}
