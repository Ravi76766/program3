package program3;

public class Employe {
    private String name;
    private int id;
    private double salary;
    private String address;
    private String department;

    // Constructor with all fields
    public Employe(String name, int id, double salary, String department, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.address = address;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Address: " + address);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Employe emp = new Employe("John Doe", 12345, 50000.0, "Engineering", "Hubbali");
        emp.display();
    }
}

