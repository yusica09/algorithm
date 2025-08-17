class Solution {
    public String solution(String my_string, String alp) {
        char target = alp.charAt(0);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == target) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}