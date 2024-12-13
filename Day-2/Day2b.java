public class Day2b {
    public static void main(String[] args) {
        int i=1;
        // while (true) {
        while (i<5) {
            System.out.println("hello-"+i);
            i++;
            System.out.println(i);
        }

        int j =5;
        do {
            System.out.println(j);
            j++;
        } while (j<15);

        for(int k=1;k<5;k++){
            System.out.println("in for loop-"+k);
        }

        for(int a=1;a<=6;a++){
            System.out.println("Day-"+a);
            for(int b=1;b<=9;b++){
                System.out.println("     "+(b+8)+"-"+(b+9));
            }
        }



    }
}
