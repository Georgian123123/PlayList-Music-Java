import java.util.ArrayList;

public class Spotify implements MusicApplication {

    private ArrayList<Playlist> theApp = new ArrayList<Playlist>();
    private Playlist actuallyPlaylist = null;
    @Override
    public void add(final Playlist thePlaylist) {
       if (!theApp.contains(thePlaylist)) {
           theApp.add(thePlaylist);
       }
    }

    @Override
    public void delete(final Playlist thePlayList) {
        if (theApp.size() == 0) {
            throw new IllegalArgumentException("Nu ai ce sterge ba bossule!");
        } else if (!theApp.contains(thePlayList)) {
            throw new IllegalArgumentException("Nu exista!");
        } else {
            theApp.remove(thePlayList);
        }
    }

    @Override
    public void showThePlaylists() {
        if (theApp.size() == 0) {
            System.out.println("Nu ai niciun playlist");
        } else {
            for (Playlist playlist : theApp) {
                System.out.println(playlist.getNameOfThePlaylist());
            }
        }
    }

    @Override
    public void chooseAnotherPlaylist(Playlist thePlaylist) {
        actuallyPlaylist = thePlaylist;
        System.out.println("Acum ai ales " + actuallyPlaylist.getNameOfThePlaylist());
    }

    public ArrayList<Playlist> getTheApp() {
        return theApp;
    }

}
