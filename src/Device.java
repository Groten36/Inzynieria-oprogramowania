public class Device {
    int id;
    String manufacturer;
    String model;
    boolean isOn;

    Device(){
        this.id=0;
        this.manufacturer=null;
        this.model=null;
        this.isOn=false;
    }

    Device(int id, String manufacturer,String model){
        this.id=id;
        this.manufacturer=manufacturer;
        this.model=model;
        this.isOn=false;
    }
}
