Given an array height representing the heights of buildings. You have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point).
////////////****************************************************************************////////////////////


// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count = 1;
        int firstHeight = height[0];
        int tallest = 0;
        for(int i = 1; i<= height.length-1;i++){
            if(height[i]>firstHeight && height[i]>tallest){
                count++;
                tallest = height[i];
            }
        }
        return count;
    }
}
