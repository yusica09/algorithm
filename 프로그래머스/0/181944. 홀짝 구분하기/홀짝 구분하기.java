import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.printf("%d is ",n);
        System.out.println(n%2==0? "even":"odd");
    }
}