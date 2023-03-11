package Class12;

import java.util.Scanner;

public class ClassHomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name ");
        String userName=scanner.next();
        System.out.println("enter password");
        String password=scanner.next();
        System.out.println("confirm password");
        String confirmPassword=scanner.next();
        System.out.println("password is too short");
        if (userName.isEmpty()||password.isEmpty()){
            System.out.println("user and password can not be empty");
        }else if (password.length()<8){
            System.out.println("password is too short");
        }else if (password.contains(userName)){
            System.out.println("password can not be user name");
        }else if (password.equals(confirmPassword)){
            System.out.println("password do not match");
        }else {
            System.out.println(" your password and password created ");
        }

    }
}
