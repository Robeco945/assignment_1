public class VehicleDemo {
    public static void main(String[] arg){
            Car mycar;
            mycar = new Car(4);
            Bus mybus;
            mybus = new Bus(6);
            Motorcycle mymotor;
            mymotor = new Motorcycle(2);
            mycar.start();
            mycar.stop();
            System.out.println(mycar.getInfo());
            mybus.start();
            mybus.stop();
            System.out.println(mybus.getInfo());
            mymotor.start();
            mymotor.stop();
            System.out.println(mymotor.getInfo());
    }
}
