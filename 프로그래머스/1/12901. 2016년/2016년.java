import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        
        String [] day = {"","MON","TUE","WED","THU","FRI","SAT","SUN"};
        
		LocalDate d = LocalDate.of(2016, a, b);
		
		return day[d.getDayOfWeek().getValue()];
    }
}