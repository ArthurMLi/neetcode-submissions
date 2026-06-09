class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> ht = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (ht.put(nums[i],1) != null){
                return true;
            }
        }
        return false;
    }
}