class StringMethods {
    public static void main(String[] args) {

        String s = "Hello Java";

        System.out.println("String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Character at 1: " + s.charAt(1));
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 5));
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Starts with Hello: " + s.startsWith("Hello"));
        System.out.println("Ends with Java: " + s.endsWith("Java"));
        System.out.println("Index of Java: " + s.indexOf("Java"));
        System.out.println("Replace: " + s.replace("Java", "World"));
        System.out.println("Trim: " + "  Hello  ".trim());
        System.out.println("Equals: " + s.equals("Hello Java"));
    }
}