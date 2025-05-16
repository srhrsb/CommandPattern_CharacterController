public class BackCommand implements Command {
    public CharacterController character;

    public BackCommand( CharacterController character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.back();
    }
}
