import com.coocaa.duck.BlueDuck;
import com.coocaa.duck.Duck;
import com.coocaa.duck.FlyRocket;
import org.junit.Test;

public class DuckTest {

    @Test
    public void test() {
            Duck duck = new BlueDuck();
            duck.freshFly();
            duck.setFlyBehavior(new FlyRocket());
            duck.freshFly();
    }

}

        