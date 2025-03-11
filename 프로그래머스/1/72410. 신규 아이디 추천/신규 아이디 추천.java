class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
		
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < new_id.length(); i++) {
			char c = new_id.charAt(i);
			
			if(c == '-' || c == '_' || c == '.') {
				sb.append((char)c);
			}else if(c >= 'a' && c <= 'z') {
				sb.append((char)c);
			}else if(c >= '0' && c<= '9') {
				sb.append((char)c);
			}
		}
		
		new_id = sb.toString().replaceAll("\\.{2,}", ".");
			
		if(new_id.startsWith(".")) {
			new_id = new_id.substring(1);
		}
		if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		
		if(new_id.matches("")) {
			new_id = "a";
		}
		
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0,15);
			if(new_id.endsWith(".")) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}
		
		sb = new StringBuilder(new_id);	
		while(sb.length() < 3) {
			sb.append((char)sb.charAt(sb.length()-1));
		}
		
		return sb.toString();
    }
}