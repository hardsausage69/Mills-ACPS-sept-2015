public class DrumKit{
    Drumkit d = new DrumKit();

    private class DrumKitTestDrive{
        public static void main(String[] args){
            boolean topHat = true;
            boolean snare = true;
            d.snare = false;
            if (d.snare == true){
                d.playSnare();
            }
            d.playSnare();
            d.playTopHat();
        }

        public static void playSnare(){
            System.out.println("bang bang ba-bang");
        }

        public static void playTopHat(){
            System.out.println("ding ding da-ding");
        }
    }
}