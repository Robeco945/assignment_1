public class Television {
    private boolean isOn;
    private int channel;


    public Television(){
        this.isOn = false;
        this.channel = 1;
    }
    public int getChannel(){
        return channel;
    }
    public boolean isOn(){
        return isOn;
    }
    public void pressOnOff() {
        if (!isOn) {isOn = true;
        }
        else {isOn = false;
        }
    }
    public void setChannel(int newChannel) {
        channel = newChannel;
    }
    
        }

