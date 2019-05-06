package validatepassword;

import java.util.Scanner;


public class ValidatePassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int capLetter = 0;
        int digits = 0;
        String password;
        char temp;
        
        do{
            System.out.println("Input a password with at least 2 uppercase letters and at least 2 digits: ");
            password = input.nextLine();
            
            for(int i = 0; i < password.length(); i++){
                temp = password.charAt(i);

                if((int)temp >= 65 && (int)temp <= 90 ){
                    capLetter++;
                }
                if((int)temp >= 48 && (int)temp <= 57){
                    digits++;
                }
            }
        }while((capLetter >= 2 && digits >= 2) != true);
        
            System.out.println("Password was successful!");
    }
    
}
