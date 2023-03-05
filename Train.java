public class Train {
    public static void main(String[] args) {

        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 15.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel (what is this line supposed to do after throwing the exception in engine.java?)
        }
        Car my_first_car = new Car(null, 10);
        Passenger bob = new Passenger("Billy Bob Sr."); 
        my_first_car.addPassenger(bob);
        my_first_car.printManifest();
        // System.out.println("Passenger added.");
        // System.out.println(my_first_car.passengers_onboard);
        // my_first_car.removePassenger(bob);
        // System.out.println("Passenger kicked out.");
        // System.out.println(my_first_car.passengers_onboard);
        
    }

    

}

