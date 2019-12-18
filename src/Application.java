import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    ArrayList<Device> ListOfDevices;
    ArrayList<User> ListOfUsers;
    Application(){
        ListOfDevices=new ArrayList<Device>();
        ListOfUsers=new ArrayList<User>();
    }
    void launch(){
        int menu;
        Scanner in = new Scanner(System.in);
        System.out.print("Wybierz opcje \n");
        System.out.print("1.Logowanie\n");
        System.out.print("2.Dodaj urzączenie\n");
        System.out.print("3.Zmien stan urządzenia");
        menu=in.nextInt();
        switch(menu){
            case 1: login();break;
            case 2: addDevice();break;
            case 3: turnDevice();
        }
    }
    void addDevice(){
        int menu;
        String man,mod,loc;
        int a;
        Camera camera=null;
        MotionDetector md=null;
        Scanner in=new Scanner(System.in);
        System.out.print("Wybierz typ urządzenia:\n");
        System.out.print("1.Kamera monitoringu\n");
        System.out.print("2.Czujnik ruchu\n");
        menu=in.nextInt();
        switch(menu){
            case 1:System.out.print("Podaj producenta: \n");
                    man=in.nextLine();
                    System.out.print("Podaj model: \n");
                    mod=in.nextLine();
                    System.out.print("Podaj monitorowany obszar: \n");
                    a=in.nextInt();
                    camera=new Camera(ListOfDevices.size(),man,mod,a);
                    ListOfDevices.add(camera);break;
            case 2: System.out.print("Podaj producenta: \n");
                man=in.nextLine();
                System.out.print("Podaj model: \n");
                mod=in.nextLine();
                System.out.print("Podaj lokalizację: \n");
                loc=in.nextLine();
                md=new MotionDetector(ListOfDevices.size(),man,mod,loc);
                ListOfDevices.add(md);break;

        }

    }
    void login(){
        String login,password;
        Scanner in =new Scanner(System.in);
        System.out.print("Podaj login:\n");
        login=in.nextLine();
        System.out.print("Podaj hasło: \n");
        password=in.nextLine();
        for(User u : ListOfUsers){
            if(u.getLogName()==login){
                if(u.getPassword()==password){
                    
                }
            }
            else{
                System.out.print("Błędne dane!");

            }
        }
    }
    void turnDevice(){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Podaj id urządzenia: \n");
        n=in.nextInt();
        for(Device i : ListOfDevices){
            if(i.getId()==n){
                if(i.isOn()){
                    i.setOn(false);
                }else{
                    i.setOn(true);
                }
                return;
            }
        }
        System.out.print("Brak takiego urządzenia w systemie!");

    }
}
