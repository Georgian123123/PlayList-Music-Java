import java.util.Scanner;

public class ChooseAPlaylist implements Command {
    private Spotify myApp;
    private Playlist thePlaylist;
    public ChooseAPlaylist(final Spotify myApp) {
        this.myApp = myApp;
    }

    @Override
    public void execute() {
        ShowThePlaylist show = new ShowThePlaylist(myApp);
        show.execute();
        Scanner scan = new Scanner(System.in);
        thePlaylist.setNameOfThePlaylist(scan.nextLine());
        myApp.chooseAnotherPlaylist(thePlaylist);
    }
}
