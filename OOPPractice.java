import java.util.*;

// ================= Level 2 & Advanced Problems =================

// ---------------- Library & Book (Aggregation) ----------------
class Book {
    String title, author;
    Book(String title, String author) { this.title = title; this.author = author; }
    void display() { System.out.println("Book: " + title + " | Author: " + author); }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    Library(String name) { this.name = name; }
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) b.display();
    }
}

// ---------------- Bank & Customer (Association) ----------------
class Customer {
    String name;
    double balance;
    Customer(String name, double balance) { this.name = name; this.balance = balance; }
    void viewBalance() { System.out.println(name + "'s Balance: ₹" + balance); }
}

class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();
    Bank(String name) { this.name = name; }
    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + name);
    }
    void showCustomers() {
        System.out.println("\nBank: " + name + " - Customers:");
        for (Customer c : customers) System.out.println(c.name);
    }
}

// ---------------- Company & Department & Employee (Composition) ----------------
class Employee {
    String name;
    Employee(String name) { this.name = name; }
    void display() { System.out.println("Employee: " + name); }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String deptName) { this.deptName = deptName; }
    void addEmployee(Employee e) { employees.add(e); }
    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.display();
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void showCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) d.showEmployees();
    }
}

// ---------------- School, Students & Courses (Aggregation + Association) ----------------
class Course {
    String name;
    ArrayList<Student> enrolledStudents = new ArrayList<>();
    Course(String name) { this.name = name; }
    void enroll(Student s) { enrolledStudents.add(s); }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }
    void enrollCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }
    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    School(String name) { this.name = name; }
    void admitStudent(Student s) { students.add(s); }
    void showStudents() {
        System.out.println("\nSchool: " + name);
        for (Student s : students) System.out.println("Student: " + s.name);
    }
}

// ---------------- University, Faculty & Departments ----------------
class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void showUniversity() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Departments:");
        for (Department d : departments) System.out.println(" - " + d.deptName);
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(" - " + f.name);
    }
}

// ---------------- Hospital, Doctor & Patient (Association + Communication) ----------------
class Doctor {
    String name;
    Doctor(String name) { this.name = name; }
    void consult(Patient p) { System.out.println("Doctor " + name + " consulting patient " + p.name); }
}

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    Hospital(String name) { this.name = name; }
    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

// ---------------- E-commerce: Orders, Customers & Products ----------------
class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    Customer customer;
    ArrayList<Product> products = new ArrayList<>();
    Order(Customer customer) { this.customer = customer; }
    void addProduct(Product p) { products.add(p); }
    double totalCost() {
        return products.stream().mapToDouble(p -> p.price).sum();
    }
    void showOrder() {
        System.out.println("Order for: " + customer.name);
        for (Product p : products) System.out.println(" - " + p.name + " (₹" + p.price + ")");
        System.out.println("Total: ₹" + totalCost());
    }
}

// ---------------- University Management System ----------------
class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class UniCourse {
    String name;
    Professor professor;
    ArrayList<Student> enrolledStudents = new ArrayList<>();
    UniCourse(String name) { this.name = name; }
    void assignProfessor(Professor p) { this.professor = p; }
    void enroll(Student s) { enrolledStudents.add(s); }
    void showDetails() {
        System.out.println("Course: " + name);
        if (professor != null) System.out.println("Professor: " + professor.name);
        System.out.println("Students:");
        for (Student s : enrolledStudents) System.out.println(" - " + s.name);
    }
}

// ---------------- MAIN DRIVER ----------------
public class OOPPractice {
    public static void main(String[] args) {
        // Library
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2 = new Book("OOP Concepts", "Jane Smith");
        Library lib = new Library("City Library");
        lib.addBook(b1); lib.addBook(b2); lib.showBooks();

        // Bank
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Harendra", 5000);
        Customer c2 = new Customer("Gun Saxena", 7000);
        bank.openAccount(c1); bank.openAccount(c2);
        bank.showCustomers();

        // Company
        Company comp = new Company("TechSoft Pvt Ltd");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        comp.addDepartment(dev);
        comp.showCompany();

        // School
        School school = new School("GLA School");
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Neha");
        Course math = new Course("Math");
        Course science = new Course("Science");
        s1.enrollCourse(math); s2.enrollCourse(science);
        school.admitStudent(s1); school.admitStudent(s2);
        school.showStudents();
        s1.showCourses();

        // University
        University uni = new University("GLA University");
        uni.addDepartment(new Department("CSE"));
        uni.addFaculty(new Faculty("Dr. Sharma"));
        uni.showUniversity();

        // Hospital
        Hospital hosp = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Mehta");
        Patient p1 = new Patient("Anil");
        hosp.addDoctor(d1); hosp.addPatient(p1);
        d1.consult(p1);

        // E-commerce
        Order order = new Order(c1);
        order.addProduct(new Product("Laptop", 45000));
        order.addProduct(new Product("Mouse", 700));
        order.showOrder();

        // University Management System
        UniCourse course = new UniCourse("Data Structures");
        Professor prof = new Professor("Prof. Verma");
        course.assignProfessor(prof);
        course.enroll(s1); course.enroll(s2);
        course.showDetails();
    }
}
