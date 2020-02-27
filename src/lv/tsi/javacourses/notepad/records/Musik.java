package lv.tsi.javacourses.notepad.records;

public class Musik { //невозможно наследовать Рекорд. Без Рекорда неоткуда взять ИДшку((((
    private String album;
    private String artist;
    private String songname;
    private int songtime;

//    public void askInfo() { ПОЧЕМУ НЕ ВСТАВЛЯЕТСЯ АСКЕР?????
  //      album = new Asker.askString("Album");
    // }

    @Override
    public String toString() {
        return "Musik{" +
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
