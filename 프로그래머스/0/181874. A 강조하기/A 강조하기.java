class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = myString.toCharArray();
        for (char c : cArr) {
            if (c == 'a') {
                sb.append('A');  
            } else if (c == 'A') {
                sb.append('A');  
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c); 
            }
        }
        
        return sb.toString();
    }
}