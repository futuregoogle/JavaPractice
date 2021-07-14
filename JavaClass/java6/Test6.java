public class Test6 {
    public static void main (String[]args) {
		int max = 1;
		int ans = 1;
		for (int i = 2; i < 1000000; i++) {
			long n = i;
			int t = 0;
			do {
				++t;
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = 3 * n + 1;
				}
			} while (n != 1);
			if (t > max) {
				max = t;
				ans = i;
			}
		}
		System.out.println(max);
		System.out.println(ans);
	}
}
