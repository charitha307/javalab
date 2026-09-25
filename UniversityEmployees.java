class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Professor extends Employee {
    String subject;

    Professor(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    void displayProfessor() {
        display();
        System.out.println("Subject: " + subject);
    }
}

class Clerk extends Employee {
    String department;

    Clerk(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayClerk() {
        display();
        System.out.println("Department: " + department);
    }
}

class UniversityEmployees {
    public static void main(String[] args) {
        Professor p = new Professor("Anita", 60000, "Java");
        Clerk c = new Clerk("Rahul", 30000, "Administration");

        System.out.println("Professor Details");
        p.displayProfessor();

        System.out.println("\nClerk Details");
        c.displayClerk();
    }
}