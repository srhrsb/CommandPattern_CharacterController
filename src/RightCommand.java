public class RightCommand implements Command{
    public CharacterController character;

    public RightCommand( CharacterController character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.right();
    }
}
