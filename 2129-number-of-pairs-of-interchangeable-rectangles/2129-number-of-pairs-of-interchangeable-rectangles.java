class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long count =0;
        int m = rectangles.length;
        HashMap<Double,Long> map = new HashMap<>();
        for(int i=0;i<m;i++) {
            double ratio = (double) rectangles[i][0]/(double) rectangles[i][1];
            map.put(ratio,map.getOrDefault(ratio,(long)0)+1);
        }
        for(long i:map.values()) {
            count+=(i*(i-1))/2;
        }
        return count;
    }
}