import com.coocaa.state.GumballMachine;
import org.junit.Test;

public class StateTest {

    @Test
    public void test(){
        GumballMachine gumballMachine = new GumballMachine(3);

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();

        for (int i = 0; i < 3; i++){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
        gumballMachine.refill(3);
        for (int i = 0; i < 3; i++){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }

}
