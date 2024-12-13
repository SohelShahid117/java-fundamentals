public class Day2a {
    // https://youtu.be/4XTsAAHW_Tc?si=sOcZT5NeqJjD7WM2--2hr
    public static void main(String[] args) {
        System.out.println("Hello");

        int x = 5;
        int y = 6;
        int z = 7;
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        String result;
        // if(x%2==0){
        // result = "even";
        // }
        // else{
        // result="odd";
        // }
        result = x % 2 == 0 ? "even" : "odd";
        System.out.println("r is:" + result);

        // int day = 51;
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Enter a valid day number");
                break;
        }

    }

}
