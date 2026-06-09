class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (ht.put(nums[i],1) != null){
                return true;
            }
        }
        return false;
    }
}