package interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) {
        int n = a.size();
        
        for (int i = 1; i < n; i++) {
            if(a.get(n-i) > a.get(n-i-1))
            {
                Collections.swap(a,n-i-1 , greater(a,n-i-1));
                Collections.sort(a.subList(n-i, n));
                
                return a;
            }
        }
        Collections.sort(a);
        
        return a;
        
    }
    
    public static int greater(ArrayList<Integer> b,int i)
    {
        int max=0;
        
        for (int j = b.size()-1; j >i; j--) {
            if(b.get(j)>b.get(i))
            {
                max=j;
                break;
            }
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(nextPermutation(a));
	}

}
