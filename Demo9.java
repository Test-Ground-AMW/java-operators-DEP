public class Demo9 {
    public static void main(String[] args) {
        String myStr = "hello";
        String myStr2 = "Java";
        int myInt = 10;
        int myInt2 = 5;
        char myChar = '!';

        String myStr3 = myStr + myStr2 + myInt + myInt2 + myChar;
        System.out.println(myStr3);

        System.out.println(myInt + myInt2 + myChar + "");
        System.out.println("" + myInt + myInt2 + myChar);
        System.out.println(myInt + myInt2 + myChar + "" + 10 + 20);
        System.out.println(".................................");
        System.out.println("" + (myInt + myInt2 + myChar));
        System.out.println((myInt + myInt2 + myChar) + "" + (10 + 20));

        System.out.println("...................................");

        System.out.println(myStr.concat(" ")
                                .concat(myStr2)
                                .concat(" ")
                                .concat(myInt+"")
                                .concat(" ")
                                .concat(myInt+""));  // data type consider

    
    }
}
