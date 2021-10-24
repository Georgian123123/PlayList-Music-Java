import java.util.Scanner;

public class ShowThePlaylist implements Command {
    private Spotify theApp;

    public ShowThePlaylist(Spotify theApp) {
        this.theApp = theApp;
    }

    @Override
    public void execute() {
        theApp.showThePlaylists();
    }
}
