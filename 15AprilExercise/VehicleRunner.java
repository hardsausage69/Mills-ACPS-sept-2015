
/**
 * This runs the objects in the superclass Vehicles
 * chapter 9.3
 */
public class VehicleRunner
{
    public static void main(String[] args){
        Convertible marysCar = new Convertible ("yellow", 2015, "Mini", "ragtop");
        System.out.println(marysCar);
    

    }

    /**
     * Method to demonstrate polymorphism and object casting
     * Takes all types of objects in vehicle class
     */
    public static void paintShop(Vehicles v, String color){  

        // use instance of to set fee
        if (v instanceof Car) 
            System.out.println("\nThat will cost you $1,000 to repaint a car");
        else System.out.println("\nThat will cost you $500 to repaint a Motorcycle");
        /**
         * If it is a convertible we need to raise the top before painting
         * For that we will use casting of the object
         */
        if (v instanceof Convertible)
            ((Convertible) v).openRoof();
        // Now paint it
        v.setColor(color);
    }
    
    public static void changeLocks(Vehicles v){
        if( v instanceof Car)
}
