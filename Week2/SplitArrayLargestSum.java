public class SplitArrayLargestSum{
    public int splitArray(int[] nums, int k) {
        int left=Arrays.stream(nums).max().getAsInt();
        int right=Arrays.stream(nums).sum();
        while(left<=right){
            int mid=left+(right-left)/2;
            if(countsub(nums,mid)>k){
                left=mid+1;
            }
            else right=mid-1;
        }
        return left;
    }
    public int countsub(int []arr,int mid){
        int count=1;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum+arr[i]>mid){
                count++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return count;
    }
}