# Java Lab Programs – Sets 4 to 9

This repository contains Java practical programs covering **Inheritance, Interfaces, Packages, Exception Handling, Threads, I/O Streams, Applets, AWT, and Swing**.

---

## SET 4 – Inheritance, Interfaces, Packages & Exception Handling

### Programs

1. **Method Overriding**
   - Create a superclass `Animal` with `sound()`.
   - Create `Dog` and `Cat` subclasses and override `sound()`.

2. **Dynamic Method Dispatch**
   - Use `Shape` as the superclass.
   - Create `Circle` and `Rectangle` subclasses.
   - Override `draw()` and invoke it using a superclass reference.

3. **Abstract Class**
   - Create abstract class `Vehicle`.
   - Include abstract method `start()` and concrete method `display()`.
   - Implement `start()` in `Car` and `Bike`.

4. **Defining and Implementing an Interface**
   - Create `Printable` interface with `print()`.
   - Implement it using `Student` and `Teacher`.

5. **Multiple Interfaces**
   - Create `Sports` and `Academics` interfaces.
   - Implement both interfaces in `Student`.

6. **Packages – Declaring and Importing**
   - Create `college` package.
   - Define `Student` class and access it from another Java program.

7. **Sub-packages**
   - Create `college.department` package.
   - Define and use the `ITStudent` class.

8. **try-catch Exception Handling**
   - Accept two integers and perform division.
   - Handle division by zero using `try-catch`.

9. **throw and throws**
   - Create `checkAge(int age)`.
   - Use `throw` when age is below 18 and declare the exception using `throws`.

10. **Multiple Exceptions and finally**
    - Perform an array operation.
    - Handle `ArrayIndexOutOfBoundsException` and another appropriate exception.
    - Use `finally` to indicate completion.

---

## SET 5 – Java Threads

### Programs

1. **Thread Life Cycle**
   - Create and start a thread.
   - Use `sleep()` and allow the thread to complete.
   - Demonstrate New, Runnable, Running, Waiting/Timed Waiting, and Terminated states.

2. **Creating Threads using Thread Class**
   - Create three threads by extending `Thread`.
   - Print numbers, characters, and a message concurrently.

3. **Creating Threads using Runnable Interface**
   - Create multiple threads using `Runnable`.
   - Perform separate tasks in each thread.

4. **Synchronization**
   - Use multiple threads to access a shared bank account.
   - Use `synchronized` to prevent incorrect balance updates.

5. **Multithreading with Synchronization**
   - Create a ticket booking system.
   - Multiple customer threads access a limited ticket pool.
   - Synchronize booking and display remaining tickets.

---

## SET 6 – I/O Streams and File Streams

### Programs

1. **FileInputStream – Reading a File**
   - Read `input.txt` using `FileInputStream`.
   - Display its contents.
   - Handle exceptions and close the stream.

2. **FileOutputStream – Writing to a File**
   - Accept a string from the user.
   - Write it to `output.txt`.
   - Append new content without deleting existing data.

3. **DataInputStream and DataOutputStream**
   - Store student roll number, name, and marks.
   - Read the stored data and display it.

4. **BufferedInputStream and BufferedOutputStream**
   - Copy the contents of one file into another using buffered streams.

5. **Combined File and Data Stream Application**
   - Create an employee record system.
   - Store employee ID, name, and salary using `DataOutputStream`.
   - Read and display employee records using `DataInputStream`.

---

## SET 7 – Java Applets

### Programs

1. **Applet Life Cycle**
   - Demonstrate `init()`, `start()`, `paint()`, `stop()`, and `destroy()`.
   - Observe the order in which the methods are executed.

2. **Applet for User Information Display**
   - Accept student name, register number, course, and semester as parameters.
   - Display the information using `paint()`.

3. **Interactive Applet Using Mouse Events**
   - Display a message inside the applet.
   - Display mouse X and Y coordinates when clicked.

4. **Applet for Simple Animation**
   - Create a horizontally moving circle.
   - Use `start()` and `stop()` to control the animation.

5. **Applet Using HTML Parameters**
   - Receive background color, foreground color, and message through HTML parameters.
   - Retrieve them in `init()` and display the message using `paint()`.

---

## SET 8 – Java AWT

### Programs

1. **AWT Components and Layout Managers**
   - Create a Student Registration Form using:
     - `Frame`
     - `Panel`
     - `Label`
     - `TextField`
     - `Choice`
     - `Checkbox`
     - `Button`
   - Include Submit and Clear buttons.

2. **AWT Controls and Event Handling**
   - Create a simple calculator.
   - Use `TextField` for input and `Button` for operations.
   - Implement `ActionListener`.
   - Handle invalid input and division by zero.

3. **Event Sources, Event Classes and Listeners**
   - Create a color selection application.
   - Change the background when a color is selected.
   - Demonstrate event sources, event classes, and listeners.

4. **Mouse and Keyboard Events with Adapter Classes**
   - Display the current mouse position.
   - Handle mouse clicks, mouse movement, and keyboard events.
   - Use adapter classes to simplify event handling.

5. **Integrated AWT Event-Driven Application**
   - Create a Student Performance Management System.
   - Enter student details and marks.
   - Calculate total and average.
   - Display the result.
   - Handle window closing using an adapter class.

---

## SET 9 – Java Swing

### Programs

1. **Student Registration Form**
   - Use:
     - `JLabel`
     - `JTextField`
     - `JRadioButton`
     - `JCheckBox`
     - `JComboBox`
     - `JButton`
   - Accept student details.
   - Display details using Submit.
   - Reset fields using Clear.

2. **Simple Calculator using Swing**
   - Accept two numbers.
   - Provide addition, subtraction, multiplication, and division.
   - Display the result.
   - Handle invalid input and division by zero.

3. **Student Mark List Application**
   - Accept student name, register number, and marks.
   - Calculate total, average, and grade.
   - Validate marks from 0–100.
   - Provide Calculate, Clear, and Exit buttons.

4. **Login and User Authentication Interface**
   - Use `JLabel`, `JTextField`, `JPasswordField`, and `JButton`.
   - Verify predefined username and password.
   - Display messages using `JOptionPane`.
   - Include Reset and Exit buttons.

5. **Library Book Management GUI**
   - Use:
     - `JTextField`
     - `JComboBox`
     - `JTable`
     - `JButton`
     - `JOptionPane`
   - Add book details to a table.
   - Delete selected books.
   - Clear input fields.
   - Display a message when no row is selected.

---

## Sets Overview

| Set | Topic | Programs |
|---|---|---:|
| **SET 4** | Inheritance, Interfaces, Packages & Exception Handling | 10 |
| **SET 5** | Java Threads | 5 |
| **SET 6** | I/O Streams and File Streams | 5 |
| **SET 7** | Java Applets | 5 |
| **SET 8** | Java AWT | 5 |
| **SET 9** | Java Swing | 5 |
| **Total** | **All Practical Programs** | **35** |

---

## Topics Covered

- Method Overriding
- Dynamic Method Dispatch
- Abstract Classes
- Interfaces
- Multiple Interfaces
- Packages and Sub-packages
- Exception Handling
- `throw`, `throws`, and `finally`
- Thread Life Cycle
- Thread Creation
- Runnable Interface
- Synchronization
- File Streams
- Data Streams
- Buffered Streams
- Java Applets
- Applet Life Cycle
- Mouse Events
- AWT Components
- Layout Managers
- Event Handling
- Adapter Classes
- Swing Components
- GUI Applications
- Form Handling
- Authentication
- Tables and Event-Driven Applications

---

## Repository Structure

```text
JavaLab/
│
├── SET 4/
│   ├── Inheritance Programs
│   ├── Interface Programs
│   ├── Package Programs
│   └── Exception Handling Programs
│
├── SET 5/
│   ├── ThreadLifeCycle.java
│   ├── ThreadDemo.java
│   ├── RunnableDemo.java
│   ├── Bank.java
│   └── Customer.java
│
├── SET 6/
│   ├── FileInputStream
│   ├── FileOutputStream
│   ├── DataInputStream
│   ├── DataOutputStream
│   └── Buffered Streams
│
├── SET 7/
│   ├── Applet Life Cycle
│   ├── User Information Applet
│   ├── Mouse Event Applet
│   ├── Animation Applet
│   └── HTML Parameter Applet
│
├── SET 8/
│   ├── Student Registration
│   ├── AWT Calculator
│   ├── Color Selection
│   ├── Mouse and Keyboard Events
│   └── Student Performance System
│
└── SET 9/
    ├── Swing Registration Form
    ├── Swing Calculator
    ├── Student Mark List
    ├── Login System
    └── Library Management GUI
