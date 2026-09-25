class TypeCasting {
    public static void main(String[] args) {

        // Widening casting
        int a = 10;
        double b = a;

        System.out.println("Integer value: " + a);
        System.out.println("After widening to double: " + b);

        // Narrowing casting
        double x = 25.75;
        int y = (int) x;

        System.out.println("Double value: " + x);
        System.out.println("After narrowing to int: " + y);
    }
}