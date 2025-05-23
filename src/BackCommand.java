public class BackCommand implements Command {
    private CharacterController character;

    public BackCommand( CharacterController character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.back();
    }
}
