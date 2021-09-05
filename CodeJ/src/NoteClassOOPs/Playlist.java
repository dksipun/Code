package NoteClassOOPs;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    private ArrayList<Song_For_Playlist> songDetail;

    public Playlist(){
        this.songs=new ArrayList<>();
        this.songDetail=new ArrayList<>();
    }

    public void addSong(String SongName){
        this.songs.add(SongName);

    }
    //Imp
    public void addSong(Song_For_Playlist SongName){
        this.songs.add(SongName.getLyrics());
        this.songDetail.add(SongName);
    }

    public void removeSong(String SongName) {
        this.songs.remove(SongName);
    }

    public void RLastAdded_Stack(){
        if(!this.songs.isEmpty()){
            this.songs.remove(this.songs.size()-1);
        }
    }
    public void RLastAdded_Stack(ArrayList<String> songs){
        if(!this.songs.isEmpty()){
            this.songs.remove(this.songs.size()-1);
        }
    }

    public void clearPlylist(){
        /*while(this.songs.size()>0){
            System.out.println("Removing: "+ this.songs.get(0));
            this.songs.remove(0);
        }*/
        while (!this.songs.isEmpty()){
            RLastAdded_Stack(this.songs);
        }
    }
    public void removeallSongs(){
        this.songs.clear();
    }
    public void removSongsDetail(){
        this.songDetail.clear();
    }
    public int totalPlaylistTime(){
        if(!songDetail.isEmpty()) {
            int t = 0;
            System.out.println("Test "+ songDetail);
            for (Song_For_Playlist s : songDetail) {
                t+= s.getduration();
            }
            return t;
        }
        return -1;
    }

    public void printPlaylist(){
        if(this.songs.size()==0){
            System.out.println("Nuvdooooo .. Playlist is Empty !!!");
            if(!this.songDetail.isEmpty()){
                for(Object j:this.songDetail){
                    System.out.println("Details Of Song: "+j);
                }
            }
            return;
        }

        for(String i:this.songs){
            System.out.println("Good One: "+i);
        }
        //ArrayList can be printed !!!Full ["A","BC","!!! Nuvdeeee"]
        System.out.println(this.songs);
        System.out.println("Print Song Details now");
        for(Object j:this.songDetail){
            System.out.println("Details Of Song: "+j);
        }
    }
    public Song_For_Playlist getLongestDurationSong(){
        if(!songDetail.isEmpty()){
            return null;
        }
        Song_For_Playlist  obj=songDetail.get(0);
        for (Song_For_Playlist sng:songDetail){
            if(obj.getduration()<sng.getduration()){
                obj=sng;
            }
        }
        return obj;
    }

}
