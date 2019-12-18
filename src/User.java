public class User {
    int id;
    String firstName;
    String lastName;
    String password;

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

    String logName;
    boolean isLogIn;

    User(int id,String firstName,String lastName, String logName,String password){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.logName=logName;
        this.password=password;
        this.isLogIn=false;

    }

}
