import java.util.ArrayList;

public class Playlist {

    class Songs {
        private String nameOfTheSong;

        public Songs(String nameOfTheSong) {
            this.nameOfTheSong = nameOfTheSong;
        }

        public String getNameOfTheSong() {
            return nameOfTheSong;
        }

        public void setNameOfTheSong(String nameOfTheSong) {
            this.nameOfTheSong = nameOfTheSong;
        }
    }

    private ArrayList<Songs> mySongs = new ArrayList<Songs>();
    private String nameOfThePlaylist;
    private Integer numberOfSongs;


    public ArrayList<Songs> getMySongs() {
        return mySongs;
    }

    public void setMySongs(ArrayList<Songs> mySongs) {
        this.mySongs = mySongs;
    }

    public String getNameOfThePlaylist() {
        return nameOfThePlaylist;
    }

    public void setNameOfThePlaylist(String nameOfThePlaylist) {
        this.nameOfThePlaylist = nameOfThePlaylist;
    }

    public Integer getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(Integer numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

}
