public class FastCarDriver {
    public static void main(String[] args){
        SportsCar mycar;
        mycar= new SportsCar("Mustand",120,100,0);
        System.out.println(mycar.getGasolineLevel());
        mycar.fillTank();
        System.out.println(mycar.getGasolineLevel());
        mycar.accelerate();
        System.out.println(mycar.getSpeed());
        System.out.println(mycar.getGasolineLevel());
        mycar.decelerate(50);
        System.out.println(mycar.getSpeed());
    }
}
