class Solution {
    public boolean solution(String s) {
        String regx = "^\\d{4}$|^\\d{6}$";

        return s.matches(regx);
    }
}