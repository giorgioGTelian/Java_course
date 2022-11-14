public class Main {
    
    String title;
    String artist;
   
    
    void play() {
        System.out.println("playin");
    }
    
    void PrintDetails() {
        System.out.println("this is"+ title + artist);
    }
    
    class StreamingSongTestDrive {
        public static void main(String[] args) {
            //System.out.println("Hello world!");
            Main song = new Main();
            song.artist = "the beatles ";
            song.title = "come together";
            song.play();
            song.duration();
            song.PrintDetails();
        }
    }

    private void duration() {
        int duration;
    }
}
