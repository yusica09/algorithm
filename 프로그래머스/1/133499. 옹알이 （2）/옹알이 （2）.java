	class Solution {
						public int solution(String[] babbling) {
			String[] word = {"aya", "ye", "woo", "ma"};
			int count = 0;
			
			for (String talk : babbling) {
				int len = 0;
				boolean valid = true;
				String before = "";

				while (len < talk.length()) {
					boolean found = false;
					for (int i = 0; i < word.length; i++) {
						if (len + word[i].length() <= talk.length() 
								&& talk.startsWith(word[i], len) && !before.equals(word[i])) {
							len += word[i].length();
							before = word[i];
							found = true;
							break; 
						}
					}
	
					if (!found) {
						valid = false;
						break;
					}
				}
				if (valid) count++;
			}
			return count;
		}
	}