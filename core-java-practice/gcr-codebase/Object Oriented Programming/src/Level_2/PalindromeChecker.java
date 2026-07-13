package Level_2;

public class PalindromeChecker {
    String string ;

    PalindromeChecker(String string){
        this.string = string;
    }

    public boolean isPalindrome(String s){
        if(s.length() % 3 != 0){
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left != right){

        }
    }
}
