import java.util.*;

public class Chick implements Animal{
    private String myType;
    private String mySound;
    private String mySound1;
    
    //allow for randomization
    Random rn = new Random();
    
    //original constructor
    Chick(String type, String sound){
        myType = type;
        mySound = sound;
        mySound = sound;
    }
    
    //constructor for implementing the cheep sound
    Chick(String type, String sound, String sound1){
        myType = type;
        mySound = sound;
        mySound1 = sound1;
    }
    
    // usage of random to determine the cheep v. cluck sound
    public String getSound(){
        int randomNum = rn.nextInt(2);
        if (randomNum == 0){
            return mySound;
        } else {
            return mySound1;
        }
    }
    
    public String getType(){
        return myType;
    }
}
    
    