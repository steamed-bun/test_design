package command;

import com.coocaa.command.remote.*;
import org.junit.Test;

public class RemoteTest {

    @Test
    public void test(){
        RemoteContrl remoteContrl = new RemoteContrl();

        Light light = new Light();
        Garage garage = new Garage();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand closeCommand = new GarageDoorCloseCommand(garage);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteContrl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteContrl.setCommand(1, openCommand, closeCommand);
        remoteContrl.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteContrl);

        for (int i = 0; i < 3; i++){
            remoteContrl.OnbuttonWasPressed(i);
            remoteContrl.OffbuttonWasPressed(i);
        }

        remoteContrl.undoButtonWasPressed();

    }

    @Test
    public void test1(){

        RemoteContrl remoteContrl = new RemoteContrl();

        Stereo stereo = new Stereo();

        StereoHighCommand stereoHighCommand = new StereoHighCommand(stereo);
        StereoLowCommand stereoLowCommand = new StereoLowCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteContrl.setCommand(0, stereoHighCommand, stereoOffCommand);
        remoteContrl.setCommand(1, stereoLowCommand, stereoOffCommand);

        System.out.println(remoteContrl);

        remoteContrl.OnbuttonWasPressed(0);
        remoteContrl.OffbuttonWasPressed(0);
        remoteContrl.undoButtonWasPressed();
        remoteContrl.OnbuttonWasPressed(1);
        remoteContrl.undoButtonWasPressed();

    }

}
