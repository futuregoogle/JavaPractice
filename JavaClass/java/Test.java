public class Test {
    public static void main(String[] args) {
        int i = 20;
        while(true)
        {
        
        if (    
            (i % 1 == 0)
            &&(i % 2 == 0) 
            &&(i % 3 == 0) 
            && (i % 5 == 0) 
            && (i % 7 == 0)
            && (i % 9 == 0)
            &&(i % 11 == 0)
            && (i % 13 == 0)
            && (i % 16 == 0)
            && (i % 17 == 0) 
            && (i % 19 == 0) )
        {
            break;
        }
        i += 20;
        }
        System.out.println(i);
    }
}
    