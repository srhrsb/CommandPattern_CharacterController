import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        CharacterController charController = new CharacterController();
        Invoker invoker = new Invoker();

        Command leftCmd = new LeftCommand(charController);
        Command forwardCmd = new ForwardCommand(charController);
        Command backCmd = new BackCommand(charController);
        Command rightCmd = new RightCommand(charController);

        System.out.println("Test Invoke und Replay Funktion via Invoker___________________\n");
        invoker.invoke(leftCmd);
        invoker.invoke(rightCmd);
        invoker.invoke(backCmd);
        invoker.invoke(forwardCmd);
        invoker.replay();

    }

}