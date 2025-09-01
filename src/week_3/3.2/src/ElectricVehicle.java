public interface ElectricVehicle {
    default void charge(){
        System.out.println("Vehicle is fully charged");
    }
     public String punctureBattery();
}
