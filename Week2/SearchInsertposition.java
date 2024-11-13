public class SearchInsertposition{
     public int searchInsert(int[] nums, int target) {
      int c=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
        if(target>nums[i]){
            c++;
        }
      }
      return c;
    }
    
}