public class solve {
    public static String even_odd(int num){
        if(num%2==0)return "Even";
        return "Odd";
    }
    public static int[] max_min(int [] nums){
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];
            if(nums[i]<min)min=nums[i];
        }
        int[] ans = new int[]{max,min};
        return ans;
    }
}
