package narmin.week06;

public class task01 {
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false

    public static class PasswordValidator {
        public static boolean isValidPassword(String password) {

            //1. Password MUST be at least have 6 characters and should not contain space
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            //2. Check if password contains at least one uppercase letter
            boolean hasUpperCase = false;
            //3. Check if password contains at least one lowercase letter
            boolean hasLowerCase = false;
            //4. Check if password contains at least one special character
            boolean hasSpecialChar = false;
            // 5.Check if password contains at least one digit
            boolean hasDigit = false;


            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
        }

        public static void main(String[] args) {
            String password = "P@ssw0rd";
            boolean isValid = isValidPassword(password);
            System.out.println("Is the password valid? " + isValid);
        }
    }

}
