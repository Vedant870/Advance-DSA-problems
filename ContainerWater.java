class Solution {
    public int maxArea(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int maximumArea = 0;

        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            int minHeight = Math.min(heights[leftIndex], heights[rightIndex]);
            int currentArea = width * minHeight;
            maximumArea = Math.max(maximumArea, currentArea);

            if (heights[leftIndex] < heights[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maximumArea;
    }
}
