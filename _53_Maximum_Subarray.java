class Solution{
    public int maxSubArray(int[] nums){
        int res=nums[0];
        int total=0;
        for(int i:nums){
            if(total<0){
                total=0;
            }
            total=total+i;
            res=Math.max(res,total);
        }
        return res;
    }
}