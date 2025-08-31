import static java.lang.Integer.parseInt;

public class SportsCar extends Car {
    public SportsCar(String typename, double speed, int maxGasTank, int gasolineLevel){
        super(typename, speed, maxGasTank, gasolineLevel);
    }
    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate();
            super.accelerate();
            super.accelerate();
        }
        else {
            super.decelerate((int)speed);
        }
    }
    @Override
    public void decelerate(int amount){
        if (getGasolineLevel() > 0){
            super.decelerate(amount*2);
        }
        else {
            super.decelerate((int)speed);
        }
    }
    protected void consumeGas() {
        if (gasolineLevel >= 15) {
            gasolineLevel = -15;
        }
        else {gasolineLevel = 0;
        }
    }
}
