import java.util.ArrayList;

public class Invoker {

    private ArrayList<Command> commandList;

    public Invoker(){
        commandList = new ArrayList<>();
    }
    public void invoke( Command cmd ){
        cmd.execute();
        commandList.add(cmd);
    }

    public void replay(){
        for( var cmd : commandList ){
            cmd.execute();
        }
    }
}
