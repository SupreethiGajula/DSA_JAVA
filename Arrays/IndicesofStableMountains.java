
//time complexity - o(n)

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        int n = height.length;
        for(int i=1;i<n;i++){
            if(height[i-1]>threshold){
                result.add(i);
            }
        }
        return result;
    }
}
