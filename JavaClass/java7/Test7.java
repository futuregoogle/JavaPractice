public class Test7 {
    public static void main (String[]args) {
        long paths[][] = new long [21][21];
        int p = 0;
        for (int i = 0; i < 21; ++i) {
            paths[0][i]=1;
            paths[i][0]=1;
        }
        for(int i = 1; i < 21; ++i) {
            for (int j = 1; j < 21; ++j) {
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        System.out.println(paths[20][20]);
	}
}
