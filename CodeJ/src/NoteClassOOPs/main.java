package NoteClassOOPs;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        System.out.println("Main test Class me apka swagat Hai.. Noobde");
        test1 nclass=new test1(5);
        test1 name_num_class=new test1(7,"dj");
        test1 name_num_class2=new test1(2,"dk");

        System.out.println(nclass);
        System.out.println(name_num_class);
        System.out.println(name_num_class2);

        System.out.println("<--------------------------------------- Ojects on a Arraylist");
        ArrayList<test1> persons=new ArrayList<>();
        persons.add(nclass);
        persons.add(name_num_class2);
        System.out.println(persons.get(0));

        System.out.println("----------------");
        String x="Apple";
        String y=x;
        y="A";
        System.out.println(y);
        System.out.println(x);

        System.out.println("<--------------------------------------Object Reference !!! to same memory");
        test1 copy_name=name_num_class2;
        copy_name.changeName("DjAlok");
        System.out.println(copy_name);
        System.out.println(name_num_class2);
        name_num_class2.changeName("~~ DJ ALOK ~~");
        System.out.println(copy_name);

        name_num_class2=new test1(199,"Mr K");
        System.out.println(name_num_class2);
        System.out.println(copy_name);

        copy_name=null;
        System.out.println(copy_name);
        try {
            copy_name.changeName("No Alok");
        }catch (Exception E){
            System.out.println("Error: "+ E);
        }

        System.out.println("<------------------------------------- Object as a method parameter");
        /*public boolean allowedToRide(Person person) {
            if (person.getHeight() < this.lowestHeight) {
                return false;
            }*/

        System.out.println("<----------------------------- Multiple Classes / Constructor Overloading / Exception / Object as object variable ");
        clockHand myTime=new clockHand(2,59,55);

//        while (true) {
//            System.out.println(myTime);
//            myTime.advance();
//            myTime.clockSleep();
//        }
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
