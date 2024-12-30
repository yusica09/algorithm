import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String res ="";
        for(int i = 0; i < a.length();i++){
            char c = a.charAt(i);
            if('A' <= c && c <= 'Z') {
            	c += 32;
            }else if('a' <= c && c <= 'z') {
            	c -= 32;
            }
            res += c;  
        }
        System.out.printf("%s",res);
    }
}