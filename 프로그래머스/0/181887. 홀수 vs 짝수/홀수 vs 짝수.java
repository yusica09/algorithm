class Solution {
    public int solution(int[] num_list) {
        int evenTotal = 0, oddTotal = 0;
        
        for (int i = 0; i < num_list.length; i++) {
			if(i%2 == 0) evenTotal += num_list[i];
			else oddTotal += num_list[i];
		}
        
        return evenTotal >= oddTotal ? evenTotal : oddTotal;
    }
}