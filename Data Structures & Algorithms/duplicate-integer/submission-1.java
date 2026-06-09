class Solution {
    public boolean hasDuplicate(int[] nums) {
        int atual;
        for (int i = 0; i < nums.length - 1; i++) {
            atual = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(atual == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}