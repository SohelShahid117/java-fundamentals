//https://youtu.be/4XTsAAHW_Tc?si=IojavH3b6dQOKlj1
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(4 * 55);
        System.out.println(4 + 55);

        int num = 67;
        System.out.println(num);

        // integer
        // byte a = 376;
        // byte a = 176;
        byte a = 17;
        System.out.println(a);

        // short b = 99999;
        short b = 257;
        System.out.println(b);

        int c = 987;
        System.out.println(c);

        // long d = 785;
        long d = 78588888886l;
        System.out.println(d);

        // float
        float e = 67.898f;
        System.out.println(e);

        double f = 65789.897;
        System.out.println(f);

        // character
        // char g = "k";
        char g = 'k';
        System.out.println(g);

        // boolean
        // bool h = true;
        boolean h = true;
        System.out.println(h);

        // literals : https://www.geeksforgeeks.org/literals-in-java/

        // int num1 = 1000000;
        // int num1 = 10_00_00_000;
        double num1 = 123e14;
        System.out.println(num1);

        // boolean t = 1;
        boolean t = true;
        System.out.println(t);

        char p = 'd';
        // p--;
        p++;
        System.out.println(p);

        byte bb = 127;
        // int aa = 256;
        int aa = 25;
        // aa=bb;
        // bb=aa; //can't convet from int to byte
        // bb=byte(aa); //wrong
        bb = (byte) aa; // this is type casting--->from int to byte
        System.out.println(aa);
        System.out.println(bb);

        // byte b1=128;
        byte b1 = 127;
        // int a1 = b1;
        System.out.println(b1);

        // int a2 = 66;
        // int a2 = 255;
        // int a2 = 201;
        int a2 = 128;
        // byte b2 = a2;
        byte b2 = (byte) a2; // type casting (a2%256)
        System.out.println(b2);

        // type promosion
        byte a3 = 34;
        byte b3 = 56;
        int c3 = a3 * b3; // here byte to int;this is type promosion
        System.out.println(c3);

        int num2 = 7;
        int num3 = 4;
        // int result = num2+num3;
        // int result = num2/num3;
        // int result = num2%num3;
        int result = num2++; // post increment;7;next line num2=8;
        // int result = ++num2; //pre increment;8
        num2 = num2 + 1;
        System.out.println(result);
        System.out.println(num2);
        System.out.println(num3);

        byte b5 = 77;
        int a5 = b5;
        System.out.println(a5);

        int b6 = 99;
        // byte a6 = b6;
        byte a6 = (byte) b6;
        System.out.println(a6);

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Explicit casting: double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);

        // use of type casting in practical life

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
         * Calculate the percantage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to float to make sure that the division is accurate
         */
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the result
        System.out.println("User's percentage is " + percentage + "%");

    }
}

// for compile------->javac Hello.java
// for run----------->java Hello

// 1:30 min done