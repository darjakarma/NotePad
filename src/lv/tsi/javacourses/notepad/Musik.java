package lv.tsi.javacourses.notepad;

public class Musik extends Record {
    private String album;
    private String artist;
    private String songname;
    private int songtime;

    @Override
    public void askInfo() {
        album = new Asker.askString("album");
        artist = new Asker.askString("Artist");
        songname = new Asker.askString("Song title");
        songtime = new Asker.askInt("Song time");
    }

    @Override
    public String toString() {
        return "Musik{" +
                "id=" + getId() +
                "album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", songname='" + songname + '\'' +
                ", songtime=" + songtime +
                '}';
    }
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public int getSongtime() {
        return songtime;
    }

    public void setSongtime(int songtime) {
        this.songtime = songtime;
    }
}
