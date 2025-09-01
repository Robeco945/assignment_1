public class VehicleDemo {
    public static void main(String[] arg){
            Car mycar;
            mycar = new Car(4,"blue");
            Bus mybus;
            mybus = new Bus(6,"red");
            Motorcycle mymotor;
            mymotor = new Motorcycle(2, "black");
            ElectricCar byd;
            byd = new ElectricCar(4,100,"gray");
            byd.start();
            byd.punctureBattery();
            byd.charge();
        System.out.println(byd.getInfo());
            mycar.start();
            mycar.stop();
            mycar.charge();

            System.out.println(mycar.getInfo());
        mycar.moreWheels();
        System.out.println(mycar.getInfo());
            mybus.start();
            mybus.stop();
            System.out.println(mybus.getInfo());
            mymotor.start();
            mymotor.stop();
            System.out.println(mymotor.getInfo());
    }
}
