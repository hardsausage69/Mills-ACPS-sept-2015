/*
 * Allen Ng
 * 1st
 */
public class TestFarm{
    public static void main(String[] args){
        //create new cow
        Cow c = new Cow("cow", "moo");
        System.out.println(c.getType() + " goes " + c.getSound());
        
        //create new chick
        Chick ch = new Chick("chick", "cluck");
        System.out.println(ch.getType() + " goes " + ch.getSound());
        
        //create new pig
        Pig p = new Pig("pig", "oink");
        System.out.println(p.getType() + " goes " + p.getSound());
        
        //implement farm
        Farm f = new Farm();
        f.animalSounds();
    }
}
