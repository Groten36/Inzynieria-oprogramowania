public class MotionDetector extends Device {
    String location;
    MotionDetector(int id,String manufacturer,String model,String location){
        super(id,manufacturer,model);
        this.location=location;
    }
}
