public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    public String get_Passeger_name() {
        return this.name;
    }

    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    public void getOffCar(Car c) {
        c.removePassenger(this);     
    }
    

}
