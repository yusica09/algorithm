import java.util.*;

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostArr = new ArrayList<>();
        List<Integer> reserveArr = new ArrayList<>();

        for (int num : lost) lostArr.add(num);
        for (int num : reserve) reserveArr.add(num);

        // 안전한 중복 제거 방식
        List<Integer> dup = new ArrayList<>();
        for (int i : lostArr) {
            if (reserveArr.contains(i)) {
                dup.add(i);
            }
        }
        for (int i : dup) {
            lostArr.remove(Integer.valueOf(i));
            reserveArr.remove(Integer.valueOf(i));
        }

        Collections.sort(lostArr); // 정방향 순회
        List<Integer> tempLost = new ArrayList<>(lostArr);

        for (int k : tempLost) {
            if (reserveArr.contains(k - 1)) {
                lostArr.remove(Integer.valueOf(k));
                reserveArr.remove(Integer.valueOf(k - 1));
            } else if (reserveArr.contains(k + 1)) {
                lostArr.remove(Integer.valueOf(k));
                reserveArr.remove(Integer.valueOf(k + 1));
            }
        }

        return n - lostArr.size();
    }

}