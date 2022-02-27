package arrays;
// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // [1,2]
        //[1,8,6,2,5,4,8,3,7]
        int  i = 0;
        int j= height.length-1;
        int area = 0;
        while (i<j){
            if (height[i]<height[j])
            {
                area = Math.max(area , (Math.abs( i-j )) *height[i]);

                i++;
            }
            else{
                area = Math.max(area , (Math.abs( j-i )) *height[j]);

                j--;
            }
        }
        return area;
    }

}
