public class Day2{
    
    //https://youtu.be/4XTsAAHW_Tc?si=W7MtVMwupgIn9PGz
    //start from : 1:30 min
    public static void main(String[] args) {
        System.out.println("hello world");

        // int x =8;
        double x =18;
        int y=9;

        int a = 95;
        int b = 55;

        
        // int result = x>y;
        boolean result = x>y;
        System.out.println(result);
        System.out.println(x);

        // boolean r = a>b && x>y;
        boolean r = a>b || x>y;
        System.err.println(r);

        // if(x>10){
        if(x>10 && x<55){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        System.out.println(x>y);

        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);

    }
}