class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Integer> hts = new HashMap<Character,Integer>();
        HashMap<Character,Integer> htt = new HashMap<Character,Integer>();
        
        
        for(int i = 0 ;i<s.length();i++){
            if(hts.containsKey(s.charAt(i)) == true ){
                hts.put(s.charAt(i),hts.get(s.charAt(i))+1);    
            }else{
                hts.put(s.charAt(i),1);    
            }
        }

        for(int i = 0 ;i<t.length();i++){
            if(htt.containsKey(t.charAt(i)) == true ){
                htt.put(t.charAt(i),htt.get(t.charAt(i))+1);    
            }else{
                htt.put(t.charAt(i),1);    
            }
        }
        return hts.equals(htt);
    }
}
