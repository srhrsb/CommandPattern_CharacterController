public class ForwardCommand implements Command{

    public CharacterController character;

    public ForwardCommand(CharacterController character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.forward();
    }
}
