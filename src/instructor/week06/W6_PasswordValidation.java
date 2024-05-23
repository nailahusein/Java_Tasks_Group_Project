package instructor.week06;

import java.util.Scanner;

public class W6_PasswordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
  //  Solution 1
   public static void main(String[] args) {
       System.out.println(PassWordvalidation("Ab*1Ab"));
        System.out.println(PassWordvalidation("Ab*1A"));
       System.out.println("isPasswordValid() = " + isPasswordValid("Ac*1Ab"));
    //   System.out.println("isValid() = " + isValid("Ad*2Ad"));
       System.out.println("validPassword() = " + validPassword("Ag*3Bd"));


       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a password to see if it is valid");
       String str = sc.nextLine();
       System.out.println(isPasswordValid(str));



   }
    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }

   // Solution 2 - I.
        public static boolean isPasswordValid(String password) {
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else {
                    hasSpecialChar = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;

        }



    // Solution 3

  /*    public static void main(String[] args) {
            //Creates a scanner
            Scanner sc = new Scanner(System.in);

            //Asks user to enter password
            System.out.println("Please enter password and then hit enter:");
            boolean newDefaultValue=false;
            while (!newDefaultValue) {
                newDefaultValue = isValid(sc.nextLine());
                System.out.println(newDefaultValue);
                if (newDefaultValue == false) {
                    System.out.println("please re-enter valid password");
                }
            }

       boolean acceptedPassword= isValid(sc.nextLine());
       System.out.println(acceptedPassword);
          System.out.println("acceptedPassword = " + acceptedPassword);
      }



    // Solution 3 continue
        public static boolean isValid(String password) {
            boolean valid=false; /////#space removed
            int atleastOneUpper = 0;
            int atleastOneLower = 0;
            int atleastOneDigit = 0;
            int atLeastOneSpecialChar = 0;


            //Checks to see if password is at least 6 characters with no space
            if (password.length() < 6 && password.contains(" ")) {
                valid = false;//
                System.out.println("Password must have at least 6 characters and contains no space");
            }
            //Checks each character to see if it is acceptable.
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    atleastOneUpper++;
                } else if (Character.isLowerCase(c)) {
                    atleastOneLower++;
                } else if (Character.isDigit(c)) {
                    atleastOneDigit++;
                } else {
                    atLeastOneSpecialChar++;
                }
            }

            if(atleastOneUpper >=1 && atleastOneLower>=1 && atleastOneDigit>=1 && atLeastOneSpecialChar>=1){
                valid=true;
            }
            return valid;
        }


*/

  // Solution 4
 public static boolean validPassword(String password) {
     boolean hasUppercase = false;
     boolean hasLowercase = false;
     boolean hasDigit = false;
     boolean hasSpecialChar = false;
     boolean validPassword = false;

     if (password.length() < 6) {

         throw new StringIndexOutOfBoundsException("Size cannot be less than Six characters");
     }
     char[] chars = password.toCharArray();
     for (char each : chars) {
         if (Character.isUpperCase(each)) {
             hasUppercase = true;
         } else if (Character.isLowerCase(each)) {
             hasLowercase = true;
         } else if (Character.isDigit(each)) {
             hasDigit = true;
         } else {//special character
             hasSpecialChar = true;
         }


         if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar && !password.contains(" ")) {
             validPassword = true;
         }
     }
     return validPassword;
 }

/*Solution  - C.missing
    public static boolean validPassword(String password){
        boolean hasUppercase=false;
        boolean hasLowercase=false;
        boolean hasDigit=false;
        boolean hasSpecialChar=false;
        boolean validPassword=false;

        char[] chars=password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                hasUppercase=true;
            } else if (Character.isLowerCase(each)) {
                hasLowercase=true;
            } else if (Character.isDigit(each)) {
                hasDigit=true;
            } else {//special character
                hasSpecialChar=true;
            }


            if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar){
                validPassword=true;
            }
        }
        return validPassword;

*/



 }
