package NoteClassOOPs;

public class Song_For_Playlist {
    private int duration;
    private String Lyrics;

    public Song_For_Playlist(String Lyrics){
        this.duration=0;
        this.Lyrics=Lyrics;
    }
    public Song_For_Playlist(String Lyrics,int duration){
        this.duration=duration;
        this.Lyrics=Lyrics;
    }
    public String getLyrics(){
        return this.Lyrics;
    }
    public int getduration(){
        return this.duration;
    }

    public String toString(){
        return this.Lyrics+":"+this.duration;
    }

}
