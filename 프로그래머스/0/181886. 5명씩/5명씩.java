class Solution {
    public String[] solution(String[] names) {
        int count = names.length%5 == 0? names.length/5 : names.length/5 + 1;
        String[] answer = new String[count];
        for (int i = 0; i < names.length; i++) {
			if(i % 5 == 0) {
				answer[i/5] = names[i];
			}
		}
        return answer;
    }
}