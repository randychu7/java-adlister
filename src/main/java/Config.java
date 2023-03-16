public class Config {


    public static String getUrl(){
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public static String getUser(){
        return "newuser";
    }
    public static String getPass(){
        return "codeup";
    }
}
