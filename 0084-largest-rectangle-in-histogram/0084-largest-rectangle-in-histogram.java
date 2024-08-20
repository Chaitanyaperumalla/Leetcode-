class Solution {
    public int largestRectangleArea(int[] heights) {
      int maxArea = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int nSR[] = new int[n]; // next smaller to right
        int nSL[] = new int[n]; // next smaller to left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nSL[i] = -1;
            } else {
                nSL[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nSR[i] = n;
            } else {
                nSR[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nSR[i] - nSL[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}