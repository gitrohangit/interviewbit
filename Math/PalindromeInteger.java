public class Solution {
    public int isPalindrome(int A) {
        
        String number = String.valueOf(A);
        

        for (int i = 0; i < number.length() / 2; i++) {
            
            if (number.charAt(i) != number.charAt(number.length() - 1 -i)) {
                return 0;
            }
        }
        return 1;
    }
}
