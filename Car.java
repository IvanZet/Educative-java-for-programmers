// Practice single and hierarchical inheritance

class Vehicle {

    private String country;
    private String make;

    public Vehicle(String country, String make) {
        this.country = country;
        this.make = make;
    }
    
    public String getCountry() {
        return country;
    }

    public String getMake() {
        return make;
    }

}

class Car extends Vehicle {
    
    private String model;

    public Car(String country, String make, String model) {
        super(country, make);
        this.model = model;
    }

    public String getDetails() {
        String details = getMake() + ", " + model + ", " + getCountry();
        
        return details;
    }
    
}

class Prius extends Car {

    private String year;
    private String charge;

    public Prius(String country, String make, String year) {
        super(country, make, "Prius");
        this.year = year;
        this.charge = "50%";
    }

    public String getDetails() {
        String details = super.getDetails() + ", " + this.year;

        return details;
    }

    public String getCharge() {
        return this.charge;
    }
    
    public void chargeBattery() {
        this.charge = "100%";
    }

    public void useBattery() {
        this.charge = "33%";
    }

}

class Supra extends Car {

    private String year;
    private boolean turbo;

    public Supra(String year, boolean turbo) {
        super("Japan", "Toyota", "Supra");
        this.year = year;
        this.turbo = turbo;
    }

    public String getDetails() {
        String details = super.getDetails() + ", " + this.year;

        if (this.turbo) {
            details += " with";
        } else {
            details += " without";
        }
        details += " turbo installed";

        return details;
    }
    
}

class CarDemo {

    public static void main(String[] args) {
        // Play with Car class
        Car carObj = new Car("Japan", "Toyota", "Corolla");
        System.out.println("Car's details:");
        String carDetails = carObj.getDetails();
        System.out.println(carDetails);

        // Play with Prius class
        Prius priusObj = new Prius("Japan", "Toyota", "2022");
        String priusDetails = priusObj.getDetails();
        System.out.println("Prius' details:");
        System.out.println(priusDetails);
        System.out.println("Current charge: " + priusObj.getCharge());
        priusObj.chargeBattery();
        System.out.println("Updated charge: " + priusObj.getCharge());

        // Play with supra class
        // Supra, no turbo
        Supra supraAtmo = new Supra("1995", false);
        System.out.println("Atmo Supra's details:");
        System.out.println(supraAtmo.getDetails());
        
        // Supra, with turbo
        Supra supraTurbo = new Supra("2010", true);
        System.out.println("Turbo Supra's details:");
        System.out.println(supraTurbo.getDetails());
    }

}
