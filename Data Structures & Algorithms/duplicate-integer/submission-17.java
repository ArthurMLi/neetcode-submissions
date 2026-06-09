class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Boolean> ht = new Hashtable<Integer,Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (ht.put(nums[i],true) != null){
                return true;
            }
        }
        return false;
    }
}