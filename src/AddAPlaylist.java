import java.util.Scanner;

public class AddAPlaylist implements Command {
    private Spotify theApp;
    private Playlist thePlaylist;

    public AddAPlaylist(Spotify theApp) {
        this.theApp = theApp;
        thePlaylist = new Playlist();
    }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Numele playlistului :");
        thePlaylist.setNameOfThePlaylist(scan.nextLine());
        theApp.add(thePlaylist);
    }
}
