import com.coocaa.factory.pizza.Pizza;
import com.coocaa.factory.pizza.PizzaFactory;
import com.coocaa.factory.pizza.PizzaStore;
import com.coocaa.factory.pizzaf.SubStore1;
import com.coocaa.factory.pizzaf.SubStore2;
import org.junit.Test;

public class PizzaTest {

    @Test
    public void test(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        Pizza sub1 = pizzaStore.order("sub1");

        System.out.println(sub1);

        Pizza sub2 = pizzaStore.order("sub2");
        System.out.println(sub2);
    }

    @Test
    public void testPizzaf(){
        com.coocaa.factory.pizzaf.PizzaStore subStore1 = new SubStore1();
        com.coocaa.factory.pizzaf.PizzaStore subStore2 = new SubStore2();

        com.coocaa.factory.pizzaf.Pizza sub1P1 = subStore1.order("sub1P1");

        com.coocaa.factory.pizzaf.Pizza sub2P1 = subStore2.order("sub2P1");
    }

    @Test
    public void testYuanLiao(){
        com.coocaa.factory.pizzaYuanLiao.PizzaStore pizzaStore1 = new com.coocaa.factory.pizzaYuanLiao.SubStore1();
        com.coocaa.factory.pizzaYuanLiao.PizzaStore pizzaStore2 = new com.coocaa.factory.pizzaYuanLiao.SubStore2();

        com.coocaa.factory.pizzaYuanLiao.Pizza sub1P1 = pizzaStore1.order("sub1P1");
        System.out.println(sub1P1);
        com.coocaa.factory.pizzaYuanLiao.Pizza sub1P2 = pizzaStore1.order("sub1P2");
        System.out.println(sub1P2);
        com.coocaa.factory.pizzaYuanLiao.Pizza sub2P1 = pizzaStore2.order("sub2P1");
        System.out.println(sub2P1);
        com.coocaa.factory.pizzaYuanLiao.Pizza sub2P2 = pizzaStore2.order("sub2P2");
        System.out.println(sub2P2);



    }

}
