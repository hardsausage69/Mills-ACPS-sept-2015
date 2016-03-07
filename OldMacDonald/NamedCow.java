public class NamedCow extends Cow{
    private String myName;

    //establish myname
    NamedCow(String type, String name, String sound){
        super(type, sound);
        myName = name;
    }
    
    public String getName(){
        return myName;
    }
}