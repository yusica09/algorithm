class Solution {
    public int solution(String my_string, String is_suffix) {
        int sub_len = is_suffix.length();
        int len = my_string.length();
        
        if(sub_len > len) return 0;
        if(is_suffix.equals(my_string.substring(len-sub_len))) return 1;
        return 0;
    }
}