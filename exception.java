class ExceptionDemo {

    static void firstMethod() throws Exception {

        try {

            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            throw new Exception("Error occurred in firstMethod", e);
        }
    }

    public static void main(String[] args) {

        try {

            firstMethod();

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());

            System.out.println("Cause: " +
                    e.getCause().getMessage());
        }
    }
}
