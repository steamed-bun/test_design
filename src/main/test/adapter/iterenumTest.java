package adapter;

import com.coocaa.adapter.duck.RedDuck;
import com.coocaa.adapter.iterenum.InterAdapter;
import org.junit.Test;

import java.util.*;

public class iterenumTest {

    @Test
    public void test(){
        List<Integer> list = Arrays.asList(1,2,3,4);

        Iterator iterator = list.iterator();

        Enumeration interAdapter = new InterAdapter(iterator);

        Integer temp;
        while (interAdapter.hasMoreElements()){
            temp = (Integer) interAdapter.nextElement();
            System.out.println(temp);
        }

        RedDuck[] redDucks = new RedDuck[2];
        redDucks[0] = new RedDuck();
        redDucks[1] = new RedDuck();
//        redDucks[2] = new RedDuck();

        Arrays.sort(redDucks);

        System.out.println(redDucks.length);

    }

}
