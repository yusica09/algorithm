	class Solution {
		public int solution(String[] babbling) {
			String[] word = {"aya", "ye", "woo", "ma"};

			int count = 0;
			for (String talk : babbling) {
				boolean[] check = new boolean[4]; 
				int len = 0;
				boolean valid = true;

				while (len < talk.length()) {
					boolean found = false;
					for (int i = 0; i < word.length; i++) {
						if (!check[i] && len + word[i].length() <= talk.length() 
								&& talk.startsWith(word[i], len)) {
							len += word[i].length();
							check[i] = true; 
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