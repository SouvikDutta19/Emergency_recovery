public class day116_rod_cutting_dynamic_programming {
    static int cutRod(int[] price, int n) {
        int[] val = new int[n + 1];
        val[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                maxVal = Math.max(maxVal, price[j] + val[i - j - 1]);
            val[i] = maxVal;
        }
        return val[n];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value = " + cutRod(arr, size));
    }
}
