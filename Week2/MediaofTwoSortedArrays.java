public class MediaofTwoSortedArrays{
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []merge=new int[n+m];
        int c=0;
        for(int i=0;i<n;i++){
            merge[c++]=nums1[i];
        }
        for(int j=0;j<m;j++){
            merge[c++]=nums2[j];
        }
        Arrays.sort(merge);
        int size=merge.length;
        //even
        if(size%2==0){
            int result1=merge[size/2-1];
            int result2=merge[size/2];
            return ((double)result1 +(double)result2)/2.0;
        }
        else
        return (double)merge[size/2];
    }
}