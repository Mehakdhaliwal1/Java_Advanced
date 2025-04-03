package mar11;

public class LoginUser {
    private String userName;
    private String password;

    public LoginUser(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }


    /*public void setPassword(String password){
            this.password = password;
    }*/
public void isValidUser(String userName , String password){
        if(this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("This is a valid Username");
        }else {
            System.out.println("Invalid Username");
        }

}



}
