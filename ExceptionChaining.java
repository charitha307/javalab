class ThrowableExceptionChaining {
    static void firstMethod() throws Exception {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new Exception("Exception from firstMethod", e);
        }
    }

    public static void main(String[] args) {

        try {
            firstMethod();
        } catch (Exception e) {

            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getSimpleName());
            System.out.println("Cause: " + e.getCause().getClass().getSimpleName());

            System.out.println("Cause message: " + e.getCause().getMessage());
        }
    }
}