abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void displayRole();
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void displayRole() {
        System.out.println(name + " is a Student");
    }
}

class Faculty extends Person {
    Faculty(String name) {
        super(name);
    }

    void displayRole() {
        System.out.println(name + " is a Faculty member");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Student s = new Student("Rahul");
        Faculty f = new Faculty("Anita");

        s.displayRole();
        f.displayRole();
    }
}