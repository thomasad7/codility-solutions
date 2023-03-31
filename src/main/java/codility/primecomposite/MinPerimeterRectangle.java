package codility.primecomposite;

public class MinPerimeterRectangle {
    
	public int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                int A = i;
                int B = N / i;
                int perimeter = 2 * (A + B);
                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                }
            }
        }
        return minPerimeter;
    }
    
}
