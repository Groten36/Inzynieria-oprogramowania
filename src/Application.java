import java.util.ArrayList;

public class Application {
    ArrayList<Device> ListOfDevices;
    ArrayList<User> ListOfUsers;
    Application(){
        ListOfDevices=new ArrayList<Device>();
        ListOfUsers=new ArrayList<User>();
    }
    void launch(){
        int menu;
        System.out.print("Wybierz opcje \n");
        System.out.print("1.Logowanie\n");
        System.out.print("2.Dodaj urzączenie\n");
        System.out.print("3.Zmien stan urządzenia");
        switch(menu){
            case 1: login();break;
            case 2: addDevice();break;
            case 3: turnDevice();
        }
    }
    void addDevice(){
        System.out.print("Wybierz typ urządzenia:\n");
        System.out.print("1.Kamera monitoringu\n");
        System.out.print("2.Czujnik ruchu\n");

    }
    void login(){}
    void turnDevice(){}
}
