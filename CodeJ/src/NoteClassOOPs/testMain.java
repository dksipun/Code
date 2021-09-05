package NoteClassOOPs;

public class testMain {
    public static void main(String[] args){
        System.out.println("<------------------------------- ArrayList Object instance variable");
        Playlist YogaSongs=new Playlist();
        YogaSongs.addSong("Tal Se Tal Mila");
        YogaSongs.addSong("Baje Ghunguru !!!");
        YogaSongs.addSong("Dhoom machale !!! Noobde");

        YogaSongs.RLastAdded_Stack();
        YogaSongs.printPlaylist();
        //YogaSongs.clearPlylist();
        YogaSongs.printPlaylist();

        Song_For_Playlist rockMusic=new Song_For_Playlist("RockOn");
        rockMusic.getLyrics();

        YogaSongs.addSong(rockMusic.getLyrics());
        System.out.println("<----------------------------- Objects in an Parameter");
        YogaSongs.addSong(rockMusic);
        YogaSongs.printPlaylist();

        //YogaSongs.removeallSongs();
        System.out.println("<-------------------- Clearing an Object's List");
        YogaSongs.removSongsDetail();
        YogaSongs.printPlaylist();

        Song_For_Playlist rMusic=new Song_For_Playlist("RockOn",3);
        Song_For_Playlist popMusic=new Song_For_Playlist("RockOn",4);

        System.out.println("<--------------- Retrieving a Specific Object from a List");
        YogaSongs.addSong(rockMusic);
        YogaSongs.addSong(rMusic);
        YogaSongs.addSong(popMusic);
        System.out.println("Total Ply Time: "+YogaSongs.totalPlaylistTime());

        System.out.println("<---------------------- Retrieving a Specific Object from a List");
        System.out.println(YogaSongs.getLongestDurationSong());


    }
}
