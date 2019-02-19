public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        BinarySubarraysWithSum obj = new BinarySubarraysWithSum();
        int[] A1 = {1, 0, 1, 0, 1};
        int S1 = 2;

        int[] A2 = {0, 0, 0, 0, 0};
        int S2 = 0;

        System.out.println(obj.numSubarraysWithSum(A1, S1));
    }

    private int numSubarraysWithSum(int[] A, int S) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = A[i];

            if (sum == S) {
                count++;
            }

            for (int j = i + 1; j < A.length; j++) {
                sum = sum + A[j];

                if (sum == S) {
                    count++;
                } else if (sum > S) {
                    break;
                }
            }
        }

        return count;
    }

    public int numSubarraysWithSum2(int[] A, int S) {
        int psum = 0, res = 0, count[] = new int[A.length + 1];
        count[0] = 1;

        for (int i : A) {
            psum += i;

            if (psum >= S)
                res += count[psum - S];
            count[psum]++;

        }

        return res;

    }
}
