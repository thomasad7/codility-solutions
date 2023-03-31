package codility.iterations;

public class BinaryGap {
	
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;
       
        while (N > 0) {
            if (N % 2 == 1) {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                }
                counting = true;
            } else {
                if (counting) {
                    currentGap++;
                }
            }
            N /= 2;
        }
       
        return maxGap;
    }
    
}
