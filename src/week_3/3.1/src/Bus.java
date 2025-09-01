public class Bus extends Car{
    private int passengers;
    private int maxPassengers;
    public Bus(String typename, double speed, int maxGasTank, int gasolineLevel){
        super(typename, speed, maxGasTank, gasolineLevel);
        this.passengers = 0;
        this.maxPassengers = 30;
    }
    private void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers += 1;
        }
    }
    private void passengerExit() {
        if (passengers  >= 1) {
            passengers -=1;
        }
    }
    public int getPassengers(){
        return passengers;
    }

}
