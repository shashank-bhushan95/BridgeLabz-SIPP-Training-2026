public class PasswordStrengthChecker {
    public static boolean checkPassword(String password) {
        try {
            if (password == null) throw new NullPointerException("Password is null");
            if (password.isEmpty()) {
                System.out.println("Password cannot be empty");
                return false;
            }
            if (password.length() < 8) {
                System.out.println("Password too short: minimum 8 characters");
                return false;
            }
            char first = password.charAt(0);
            if (!Character.isUpperCase(first)) {
                System.out.println("First character must be uppercase");
                return false;
            }
            char last = password.charAt(password.length() - 1);
            if (!Character.isDigit(last)) {
                System.out.println("Last character must be a digit");
                return false;
            }
            String specials = "@#$%&*";
            boolean hasSpecial = false;
            for (char c : password.toCharArray()) if (specials.indexOf(c) >= 0) hasSpecial = true;
            if (!hasSpecial) {
                System.out.println("Password must contain at least one special character (@,#,$,%,&,*)");
                return false;
            }
            System.out.println("Password is strong");
            return true;
        } catch (NullPointerException e) {
            System.out.println("Invalid input: password is null");
            return false;
        }
    }

    public static void main(String[] args) {
        checkPassword(null);
        checkPassword("");
        checkPassword("Abcdef1");
        checkPassword("abcdefg1$");
        checkPassword("Abcdefgh$");
        checkPassword("Abcdefg9$");
    }
}
