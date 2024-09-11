package by.itacademy.smelnik;

import by.itacademy.smelnik.utils.EmailCheck;
import by.itacademy.smelnik.utils.Utils;

public class Main {
    public static void main(String[] args) {
        String email;
//        for (int i = 0; i < 10; i++) {
//            email = Utils.getEmail();
//            if (EmailCheck.isGmail(email)){
//                System.out.println(email);
//            }
//        }

        for (int i = 0; i < 10; i++) {
            email = Utils.getEmail();
            if (EmailCheck.isEmailInDomain(email, "@yahoo.com")){
                System.out.println(email);
            }

        }


        
    }
}