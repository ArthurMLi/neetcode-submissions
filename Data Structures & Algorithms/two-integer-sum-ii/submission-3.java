class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0,b = numbers.length-1;
        int sum = numbers[a] + numbers[b];
        while(sum != target){
            if(sum > target) {b--;}else{a++;}
            sum = numbers[a] + numbers[b];
        }
        return new int[]{++a,++b};
    }
}
