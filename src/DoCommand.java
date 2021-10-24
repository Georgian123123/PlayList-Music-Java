public class DoCommand {

    private Command theCommand;

    public DoCommand(Command theCommand) {
        this.theCommand = theCommand;
    }
    public void doCommand() {
        theCommand.execute();
    }
}
