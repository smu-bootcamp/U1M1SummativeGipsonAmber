public class SomeMath {
    public static void main(String[] args) {
        int total5;
        double average5;
        double largestNumber;
        System.out.println("The total is: " + total5(1, 2, 3, 4, 5));
        System.out.println("The average is: " + average5(1, 3, 5, 7, 9));
        System.out.println("The largest is: " + largestNumber(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    public static int total5(int a, int b, int c, int d, int e) {
        int total5 = (a + b + c + d + e);
        return total5;
    }

    public static double average5(int a, int b, int c, int d, int e) {
        double average5 = ((a + b + c + d + e) / 5);
        return average5;
    }

    public static double largestNumber(double a, double b, double c, double d, double e) {
        double largestNumber = Double.MAX_VALUE;
        if (a > b && a > c && a > d && a > e) {
            return a;
        } else if (b > a && b > c && b > d && b > e) {
            return b;
        } else if (c > a && c > b && c > d && c > e) {
            return c;
        } else if (d > a && d > b && d > c && d > e) {
            return d;
        } else if (e > a && e > b && e > c && e > d) {
            return d;
        }
    return largestNumber;
    }
}
