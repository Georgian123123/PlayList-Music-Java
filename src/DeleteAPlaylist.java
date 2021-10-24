import java.util.Scanner;

public class DeleteAPlaylist implements Command {
    private Spotify theApp;
    private Playlist thePlaylist;

    public DeleteAPlaylist(Spotify theApp) {
        this.theApp = theApp;
    }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        thePlaylist.setNameOfThePlaylist(scan.nextLine());
        theApp.delete(thePlaylist);
    }
}
