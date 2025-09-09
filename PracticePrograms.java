
// Level 1 Practice Programs in Java

// 1. Book Class with Default and Parameterized Constructors
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price);
    }
}

// 2. Circle Class with Constructor Chaining
class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}

// 3. Person Class with Copy Constructor
class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}

// 4. Hotel Booking System
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Hotel Booking: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

// 5. Library Book System
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Library Book: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}

// 6. Car Rental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // Example cost

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Car Rental: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
}

// Main class to test all programs
public class PracticePrograms {
    public static void main(String[] args) {
        // 1. Book
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "John Doe", 499.99);
        b1.display();
        b2.display();

        // 2. Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        c1.display();
        c2.display();

        // 3. Person
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();

        // 4. Hotel Booking
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);
        h1.display();
        h2.display();
        h3.display();

        // 5. Library Book
        LibraryBook lb = new LibraryBook("Data Structures", "Mark Smith", 350.0, true);
        lb.display();
        lb.borrowBook();
        lb.display();

        // 6. Car Rental
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Charlie", "SUV", 5);
        cr1.display();
        cr2.display();
    }
}
