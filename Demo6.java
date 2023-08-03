public class Demo6 {
    public static void main(String[] args) {
        float myFloat = 2.25f;
        myFloat = myFloat++;  // myFloat = 2.23 (assign -> the current value)
        myFloat++;            // myFloat = 3.23

        
        float myFloat2 = 20.25f;
        // myFloat2 = (float) ~myFloat2;  // floats, doubles doesn't contributes to complements

        int x = 10;
        
        // ~x;    // can't stand alone    
        // -x;    // can't stand alone    
        // +x;    // can't stand alone  
        ++x;
        --x;

        // but
        System.out.println(~x);
    }
}
