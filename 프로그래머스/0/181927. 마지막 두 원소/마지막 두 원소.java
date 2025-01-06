public class Solution {
	public int[] solution(int[] num_list) {
        int[] s = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            s[i] = num_list[i];
        }

        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];

        
        if (last > secondLast) {
            s[s.length - 1] = last - secondLast;
        } else {
            s[s.length - 1] = last * 2;
        }
        
        return s;
	}
}
