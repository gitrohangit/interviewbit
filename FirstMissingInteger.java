public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {

        ArrayList<Integer> pos = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0) {
                pos.add(A.get(i));
            }
        }

        if (pos.size() < 1) {
            return 1;
        } else {
            Collections.sort(pos);
            for (int i = 0; i < pos.size(); i++) {
                if (pos.get(i) != i+1) {
                    return i+1;
                }
            }
        }
        
        return pos.size() + 1;

    }
}
