import com.coocaa.coffee.*;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CoffeeTest {

    @Test
    public void test(){
        Beverage blankCoffee = new BlankCoffee();
        System.out.println(blankCoffee.getDescription() + ":" + blankCoffee.cost());

        blankCoffee = new Mocha(blankCoffee);
        blankCoffee = new Whip(blankCoffee);
        System.out.println(blankCoffee.getDescription() + ":" + blankCoffee.cost());
    }

    @Test
    public void testIO(){
        int c;
        try {
            InputStream in = new FileInputStream("D:\\test.txt");
            in = new BufferedInputStream(in);
            in = new LowCaseInputStream(in);
            while ((c = in.read()) > 0){
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class TestThread implements Runnable{

        public void run() {
            System.out.println("thread in...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread exit...");
        }
    }

    @Test
    public void testThread(){
        Thread thread1 = new Thread(new TestThread());
        thread1.start();
        System.out.println("main...");
    }

}
