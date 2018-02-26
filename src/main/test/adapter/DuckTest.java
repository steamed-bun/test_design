package adapter;

import com.coocaa.adapter.duck.*;
import org.junit.Test;

public class DuckTest {

    @Test
    public void test(){
        RedDuck redDuck = new RedDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(redDuck);

        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }

    @Test
    public void test1(){
        RedDuck redDuck = new RedDuck();
        Turkey turkeyAdapter = new DuckAdapter(redDuck);
        turkeyAdapter.gobble();
        for (int i = 1; i < 5; i++){
            turkeyAdapter.fly();
        }

    }

}
