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

    /**
     * Wiederholt alle Kommandos in der Kommandoliste
     */
    public void replay( ){
        for( var cmd : commandList ){
            cmd.execute();
        }
    }

    /**
     * Wiederholt alle Kommandos von Startindex bis Zielindex
     * @param from Startindex(inklusive)
     * @param to Zielindex(inklusive)
     */
    public void replay( int from, int to ){
        if( from < 0 || from >= commandList.size()){
            throw new IllegalArgumentException("Argument from is out of range");
        }

        if( to < 0 || to >= commandList.size()){
            throw new IllegalArgumentException("Argument to is out of range");
        }

        for( int i = from; i <= to; i++ ){
            commandList.get(i).execute();
        }
    }
}
