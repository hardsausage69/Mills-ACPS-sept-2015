public class Cow implements Animal{
    private String myType;
    private String mySound;
    
    //no-arg constructor for NamedCow
    Cow(){
    }
    
    //constructor for NamedCow super and other cow calls
    Cow(String type, String sound){
        myType = type;
        mySound = sound;
    }
    
    public String getSound(){
        return mySound;
    }
    
    public String getType(){
        return myType;
    }
}
        