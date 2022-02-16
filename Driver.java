// Practicing aggregation of two classes

class VehicleAlt {

    private String id;
    private String model;

    public VehicleAlt(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public String getDetails() {
        return getId() + ", " + getModel();
    }
}

class Driver {

    private String driverName;
    public VehicleAlt vehicle;
    
    public Driver(String driverName, VehicleAlt vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

    public String getDriverName() {
        return this.driverName;
    }

}

class DemoDriver {
    public static void main(String[] args) {
        
        VehicleAlt volvo = new VehicleAlt("4453", "Volvo S60");
        Driver john = new Driver("John", volvo);

        System.out.println(john.getDriverName());
        System.out.println(john.vehicle.getDetails());
    }
}