public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public void setCoffeeType(String newCoffeeType){
        coffeeType = newCoffeeType;
    }
    public void setCoffeeAmount(int newCoffeeAmount){
        coffeeAmount = newCoffeeAmount;
    }
    public void onOff(){
        isOn = !isOn;
    }
    public String getOnOff(){
        if (isOn) {return "on";
        }
        else {return "off";
        }
    }
    public String getCoffeeType(){
        return coffeeType;
    }
    public int getCoffeeAmount(){
        return coffeeAmount;
    }
}
