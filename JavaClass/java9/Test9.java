public class Test9 {
        public static String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        public static String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        public static String[] hundreds = {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred","sevenhundred","eighthundred","ninehundred"};

        public String word(int arg){
            String withAnd = "";

            if(arg == 1000){
                return "onethousand";
            }
            if(arg<20){
                return ones[arg];
            }
            if(arg<100){
                return tens[arg/10] + word(arg%10);
            }
            withAnd = word(arg%100);
            
            if(withAnd.length()>0)
            withAnd = "and" + withAnd;

            return hundreds[arg/100] + withAnd;
        }
        public int count(int arg){
            System.out.println(word(arg));
            System.out.println(word(arg).length());
            return word(arg).length();
        }
        public static void main(String[] args){
            int result = 0;
            
            for(int i = 1; i<= 1000; i++){
                System.out.println(i);
                result += new Test9().count(i);
            }
            System.out.println(result);
        }
	}
