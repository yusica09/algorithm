class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = true;
        for(int i=0;i<code.length();i++) {
        	if(code.charAt(i)=='1') {
             	mode = !mode;
             }else if(mode) {
        		ret = i%2==0? ret+code.charAt(i): ret;
             }else{
            	 ret = i%2==1? ret+code.charAt(i): ret; 	
            }
        }
        
        if(ret.equals("")) ret = "EMPTY";
        
        return ret;
    }
}