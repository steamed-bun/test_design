import com.coocaa.combining.*;
import org.junit.Test;

public class CombiningTest {

    @Test
    public void test(){
//        simulate();
//        simulate1();
//        simulate2();
//        simulate3();
        simulate4();
    }

    void simulate(){
        //adapter
        RedDuck redDuck = new RedDuck();
        GreenDuck greenDuck = new GreenDuck();
        DuckCall duckCall = new DuckCall();

        simulate(redDuck);
        simulate(greenDuck);
        simulate(duckCall);

        Goose goose = new Goose();
        GooseAdapter gooseDuck = new GooseAdapter(goose);
        simulate(gooseDuck);

    }

    public void simulate1(){
        //装饰者
        QuackCounter redDuck = new QuackCounter(new RedDuck());
        QuackCounter greenDuck = new QuackCounter(new GreenDuck());
        QuackCounter duckCall = new QuackCounter(new DuckCall());

        simulate(redDuck);
        simulate(greenDuck);
        simulate(duckCall);

        System.out.println(QuackCounter.getCount());

    }

    public void simulate2(){
        //工厂
        AbstractDuckFactory factory = new DuckCounterFactory();
        Quackable redDuck = factory.createRedDuck();
        Quackable greenDuck = factory.createGreenDuak();
        Quackable duckCall = factory.createDuckCall();

        AbstractGooseFactory gooseFactory = new GooseFactory();

        Quackable gooseDuck = gooseFactory.createGooseDuck();

        simulate(redDuck);
        simulate(greenDuck);
        simulate(duckCall);
        simulate(gooseDuck);

        System.out.println(QuackCounter.getCount());


    }

    void simulate3(){
        //组合 + 迭代器
        AbstractDuckFactory factory = new DuckCounterFactory();
        Quackable redDuck = factory.createRedDuck();
        Quackable greenDuck = factory.createGreenDuak();
        Flock flock = new Flock();
        flock.add(redDuck);
        flock.add(greenDuck);

        Flock flock1 = new Flock();
        Quackable duckCall = factory.createDuckCall();
        Quackable duckCall1 = factory.createDuckCall();
        Quackable duckCall2 = factory.createDuckCall();
        flock1.add(duckCall);           //将一个群加入另一个群里面
        flock1.add(duckCall1);
        flock1.add(duckCall2);
        flock.add(flock1);

        simulate(flock);
    }

    void simulate4(){
        //observer
        QuackObserver quackObserver = new QuackObserver();
        QuackObserver quackObserver2 = new QuackObserver();

        AbstractDuckFactory factory = new DuckCounterFactory();
        Quackable redDuck = factory.createRedDuck();
        Quackable greenDuck = factory.createGreenDuak();
        /*
        redDuck.addObserver(quackObserver);
        redDuck.addObserver(quackObserver2);
        greenDuck.addObserver(quackObserver);
        System.out.println("+++++++++++++++");
        redDuck.quack();
        System.out.println("+++++++++++++++");
        */
        Flock flock = new Flock();
        flock.add(redDuck);
        flock.add(greenDuck);
        flock.addObserver(quackObserver);
        flock.addObserver(quackObserver2);

        simulate(flock);


    }

    void simulate(Quackable duck){
        duck.quack();
    }

}
