import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
       int[] nums1 = new int[] {1,2,3,0,0,0};
       int[] nums2= new int[] {2,5,6};
       merge(nums1, 3, nums2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int[] res = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n)
        {
            if(nums1[i] < nums2[j])
            {
                res[k++]= nums1[i++];

            }
            else
            {
                res[k++] = nums2[j++];

            }
        }
        while(i<m)
        {
            res[k++]=nums1[i++];
        }
        while(j<n)
        {
            res[k++]=nums2[j++];
        }
        nums1 = new int[m+n];
        for(int x=0; x<res.length; x++)
        {
            nums1[x]=res[x];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
