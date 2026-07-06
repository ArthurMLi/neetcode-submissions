class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1; 
        for(int i = 0; i < j;){
            if(isValidChar(s.charAt(i))){
                if(isValidChar(s.charAt(j))){
                    if(Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(s.charAt(j))){
                        i++;
                        j--;
                    }
                    else{ return false;}
                }else{
                    j--;
                }
            }
            else
            {
                i++;
            }
        }
        return true;
    }

    private boolean isValidChar(char c){
        if(c >= 'A' && c <= 'Z')return true;
        if(c >= 'a' && c <= 'z')return true;
        if(c >= '0' && c <= '9')return true;
        return false;
    }
}
