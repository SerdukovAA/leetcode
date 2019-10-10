public class ReverseIntegers {


    public int reverse(int x) {
        int y=0;
        for(;x!=0;x/=10){
            if (y>Integer.MAX_VALUE/10 || y<Integer.MIN_VALUE/10) return 0;
            y= 10*y + x%10;
        }
        return y;
    }

    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

}
