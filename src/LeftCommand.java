public class LeftCommand implements Command{

    public CharacterController character;

    public LeftCommand( CharacterController character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.left();
    }
}
