public class Device {
    int id;
    String manufacturer;
    String model;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    boolean isOn;

    Device(){
        this.id=0;
        this.manufacturer=null;
        this.model=null;
        this.isOn=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Device(int id, String manufacturer, String model){
        this.id=id;
        this.manufacturer=manufacturer;
        this.model=model;
        this.isOn=false;
    }
}
