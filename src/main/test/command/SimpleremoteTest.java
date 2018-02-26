package command;

import com.coocaa.command.simpleremotecontrol.*;
import org.junit.Test;

public class SimpleremoteTest {

    @Test
    public void test(){
        Light light = new Light();
        Command command = new LightOnCommand(light);
        SimpleRemoteContrl simpleRemoteContrl = new SimpleRemoteContrl();
        simpleRemoteContrl.setCommand(command);
        simpleRemoteContrl.buttonWasPressed();
    }

    @Test
    public void testDoorOpen(){
        Garage garage = new Garage();
        Command command = new GarageDoorOpenCommand(garage);
        SimpleRemoteContrl simpleRemoteContrl = new SimpleRemoteContrl();
        simpleRemoteContrl.setCommand(command);
        simpleRemoteContrl.buttonWasPressed();
    }

}
