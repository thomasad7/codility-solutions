package codility.primecomposite;

public class CountFactors {
    
	public int solution(int N) {
        int count = 0;
        int i = 1;
        while (i <= Math.sqrt(N)) {
            if (N % i == 0) {
                if (i * i == N) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
            i += 1;
        }
        return count;
    }
    
}
