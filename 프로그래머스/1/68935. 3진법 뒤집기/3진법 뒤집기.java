import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n >= 3) {
        	arr.add(n%3);
        	n /= 3;
        }
        arr.add(n);
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            answer += arr.get(i) * Math.pow(3, len - 1 - i);
        }
        return answer;
    }
}