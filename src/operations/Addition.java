package operations;

import app.Application;

public class Addition extends Application implements Operation {
    @Override
    public void operation() {
       double summ = getA()+getB();
        System.out.println("Результат операции сложения составляет = "+summ);
    }
}
