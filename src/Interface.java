import java.util.Scanner;

public class Interface {
    private Spotify theApp;
    private Command theCommand;

    Interface() {
        startTheApp();
    }
    public Command chooseTheCommand(final CommandsPlaylist command) {
        switch (command) {
            case AddCommand : return new AddAPlaylist(theApp);
            case DeleteCommand : return new DeleteAPlaylist(theApp);
            case ShowCommand : return new ShowThePlaylist(theApp);
            case ChooseComand: return new ChooseAPlaylist(theApp);
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
    public void showTheMenu() {
        Menu theMenu = new Menu();
        System.out.println(theMenu.getAdd());
        System.out.println(theMenu.getDelete());
        System.out.println(theMenu.getChoose());
        System.out.println(theMenu.getShow());
        System.out.println(theMenu.getExit());
    }
    public void startTheApp () {
        theApp = new Spotify();
        showTheMenu();

        while (true) {
            Scanner scan = new Scanner(System.in);
            if (scan.nextLine().equals("Add")) {
                theCommand = chooseTheCommand(CommandsPlaylist.AddCommand);
            } else if (scan.nextLine().equals("Delete")) {
                theCommand = chooseTheCommand(CommandsPlaylist.DeleteCommand);
            } else if (scan.nextLine().equals("Choose")) {
                theCommand = chooseTheCommand(CommandsPlaylist.ChooseComand);
            } else if (scan.nextLine().equals("Show")) {
                System.out.println("muie");
                theCommand = chooseTheCommand(CommandsPlaylist.ShowCommand);
            } else if(scan.nextLine().equals("Exit")) {
                return ;
            } else {
                System.out.println("N-ai ales corect");
            }

            theCommand.execute();
        }
    }
}
