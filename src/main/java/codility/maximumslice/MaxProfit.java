package codility.maximumslice;

public class MaxProfit {
    
	public int solution(int[] A) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
       
        for (int i = 0; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else {
                maxProfit = Math.max(maxProfit, A[i] - minPrice);
            }
        }
       
        return maxProfit;
    }
    
}
