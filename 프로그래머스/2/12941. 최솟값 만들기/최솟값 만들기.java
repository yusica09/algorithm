import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res += A[i] * B[i];
        }
        
        return res;
    }
}