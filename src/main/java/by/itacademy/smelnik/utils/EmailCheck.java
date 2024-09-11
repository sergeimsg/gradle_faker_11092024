package by.itacademy.smelnik.utils;

public class EmailCheck {

    public static boolean isGmail(String email){
         return email.endsWith("@gmail.com");
    }

    public static boolean isEmailInDomain(String email, String domain){
        return email.endsWith(domain);
    }
}
