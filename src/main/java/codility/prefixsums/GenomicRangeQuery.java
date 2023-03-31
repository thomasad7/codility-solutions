package codility.prefixsums;

public class GenomicRangeQuery {

	public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;
        int[][] prefixSums = new int[4][N + 1];
        for (int i = 0; i < N; i++) {
            int a = 0, c = 0, g = 0, t = 0;
            switch (S.charAt(i)) {
                case 'A': a = 1; break;
                case 'C': c = 1; break;
                case 'G': g = 1; break;
                case 'T': t = 1; break;
            }
            prefixSums[0][i + 1] = prefixSums[0][i] + a;
            prefixSums[1][i + 1] = prefixSums[1][i] + c;
            prefixSums[2][i + 1] = prefixSums[2][i] + g;
            prefixSums[3][i + 1] = prefixSums[3][i] + t;
        }
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            int start = P[i], end = Q[i];
            for (int j = 0; j < 4; j++) {
                if (prefixSums[j][end + 1] - prefixSums[j][start] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
    
}
