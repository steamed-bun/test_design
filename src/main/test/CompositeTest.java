import com.coocaa.composite.Menu;
import com.coocaa.composite.MenuComponent;
import com.coocaa.composite.MenuItem;
import com.coocaa.composite.Waitress;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void test(){
        MenuComponent pancakeHouseMenu = new Menu("pancakeHouseMenu");
        MenuComponent dinnerMenu = new Menu("dinnerMenu");
        MenuComponent cafeMenu = new Menu("cafeMenu");

        MenuComponent allMenus = new Menu("allMenu");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("pancake_01"));
        pancakeHouseMenu.add(new MenuItem("pancake_02"));
        dinnerMenu.add(new MenuItem("dinner_01"));
        dinnerMenu.add(new MenuItem("dinner_02"));
        cafeMenu.add(new MenuItem("cafe_01"));
        cafeMenu.add(new MenuItem("cafe_02"));

        Waitress waitress = new Waitress(allMenus);
//        waitress.print();
        waitress.printVegetMenu();
    }

}
