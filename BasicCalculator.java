class BasicCalculator {
    public static void main(String args[]) {
        System.out.println("Calculator Program");
        int c = addition(3, 6);
        int s = subtraction(6, 3);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

}
