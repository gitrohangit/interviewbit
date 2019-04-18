public class Solution {
    
     Map<Character,Integer> alphabet = new HashMap<Character,Integer>();
    
    public int titleToNumber(String A) {
        
        int count = 1;
        for(char i = 'A' ; i <= 'Z' ; i++ ){
            alphabet.put(i,count);
            count++;
        }
        
        final char[] arg = A.toCharArray();
        
        return baseConversion(arg);
    }

    private int baseConversion(char[] arg) {
        // TODO Auto-generated method stub
        int result = 0; 
        
        for (int i = arg.length - 1; i >= 0 ; i--) {
            result = result + (int)((alphabet.get(arg[i])) * Math.pow(alphabet.size(),arg.length - 1 - i));
        }
        return result;
    }
}
