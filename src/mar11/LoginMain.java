package mar11;

public class LoginMain {
    public static void main(String[] args) {
        LoginUser loginUser = new LoginUser("Mehak" , "12345");
        loginUser.isValidUser("mehak" , "12345");
        loginUser.isValidUser("njdfn" , "12345");


        loginUser.isValidUser("mehak" , "3939");
        System.out.println(loginUser.toString());
    }
}
