public class Test10 {
    public static int triangle [][];
        public static void main(String[] args){
        triangle = new int[15][15];

            addTo(0,75);
            addTo(95,64);
            addTo(17,47,82);
            addTo(18,35,87,10);
            addTo(20,4,82,47,65);
            addTo(19,1,23,75,3,34);
            addTo(88,2,77,73,7,63,67);
            addTo(99,65,4,28,6,16,70,92);
            addTo(41,41,26,56,83,40,80,70,33);
            addTo(41,48,72,33,47,32,37,16,94,29);
            addTo(53,71,44,65,25,43,91,52,97,51,14);
            addTo(70,11,33,28,77,73,17,78,39,68,17,57);
            addTo(91,71,52,38,17,14,91,43,58,50,27,29,48);
            addTo(63,66,4,68,89,53,67,30,73,16,69,87,40,31);
            addTo(  4,62,98,27,23,9,70,98,73,93,38,53,60,4,23);

            for(int i = triangle.length - 2; i >= 0; i--) {
                for(int column = 0; column <= i; column++) {
                    final int LEFT = column;
                    final int RIGHT = column + 1;

                    triangle[i][column += Math.max(triangle[i+1][LEFT],
                    triangle[i+1][RIGHT];
                }
            }
            System.out.println(triangle[0][0]);
        }
        public static void addTo(int row, int...num)
        int index = 0;

        for(int j = 0; j < triangle[0].length; j++) {
            if(index<num.length) {
                triangle[i][j] = num(index);
            } else {
                triangle[i][j] = 0;
            }
            index++;
        }

    }
} 