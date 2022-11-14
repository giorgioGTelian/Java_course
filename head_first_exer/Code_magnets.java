class Drumkit {
  boolean topHat = true;
  boolean snare = true;
  
  void playSnare() {
    System.out.println("bang bang ba-bang");
  }
  void playTopHat() {
    System.out.println("ding ding da-ding");
  }
}

class DrumKitTestDrive {
  public static void Main(String [] args) {
    Drumkit d = new DrumKit();
    d.playSnare();
    d.playTopHat();
    d.snare = false;
    
    if (d.snare == true) {
      d.playsnare();
    }
  }
}
