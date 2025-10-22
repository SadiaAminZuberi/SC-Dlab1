public class lab1task {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 10;
        int b = 20;
        int sum = add(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
