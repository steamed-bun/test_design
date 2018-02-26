import com.coocaa.iterator.*;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void test(){
        Menu dinnerMenu = new DinnerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu cofaMenu = new CafeMenu();

        Waitress waitress = new Waitress(dinnerMenu,pancakeHouseMenu, cofaMenu);

        waitress.print();
    }

}
