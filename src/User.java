import java.util.Scanner;

public class User {
    int id;
    String type;
    String firstName;
    String lastName;
    String password;
    String logName;
    boolean isLogIn;

    public boolean isLogIn() {
        return isLogIn;
    }

    public void setLogIn(boolean logIn) {
        isLogIn = logIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    void changePassword(){
        String old,pass1,pass2;
        Scanner in=new Scanner(System.in);
        System.out.print("POdaj hasło");
        old=in.nextLine();
        System.out.print("Podaj nowe haslo: \n");
        pass1=in.nextLine();
        System.out.print("Powtórz nowe hasło: \n");
        pass2=in.nextLine();
        if(pass1.equals(pass2)&& old.equals(this.getPassword())){
            this.setPassword(pass1);
            System.out.print("Hasło zostało zmienione");
        }else{
            System.out.print("Różne hasła!");
        }

    }

    void updateUser(){
        int menu;
        String name;
        Scanner in = new Scanner(System.in);
        if(this.isLogIn()){
            System.out.print("Zmiana danych użytkownka:\n");
            System.out.print("1.Imię\n");
            System.out.print("2.Nazwisko");
            menu=in.nextInt();
            switch(menu){
                case 1:System.out.print("Nowe imię: ");
                    name=in.nextLine();
                    this.setFirstName(name);
                    System.out.print("\nImię zmienione");
                case 2: System.out.print("\nNowe nazwisko: ");
                    name=in.nextLine();
                    this.setLastName(name);
                    System.out.print("\nNazwisko zostało zmienione");

            }


        }
    }

    User(int id,String type,String firstName,String lastName, String logName,String password){
        this.id=id;
        this.type=type;
        this.firstName=firstName;
        this.lastName=lastName;
        this.logName=logName;
        this.password=password;
        this.isLogIn=false;

    }


}
