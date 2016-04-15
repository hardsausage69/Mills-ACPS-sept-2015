public class Hatchback extends Car{
    
    private String make;
    private int year;
    private int numDoors;
    
    public Hatchback(String make, int year, int numDoors){
        this.make = make;
        this.year = year;
        this.numDoors = numDoors;
    }
    
    public String toString(){
        String output = super.toString() + " Doors: " + this.numDoors;
        return output;
    }
}