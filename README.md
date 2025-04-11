# Student Record Management System

A Java application to manage student records using arrays of objects, supporting **add**, **remove**, **update**, and **display** operations.

---

## ✨ Features

- **Add Student**: Dynamically expands the array to add a new student.
- **Remove Student**: Removes a student and shrinks the array.
- **Update Student**: Modifies existing student details.
- **Display Students**: Prints current student records.

---

## 🚀 How to Run

1. **Clone the repository**
2. **Compile Java files**
   ```bash
   javac src/com/lesson/lab/*.java -d out/
   ```
3. **Run the application**
   ```bash
   java -cp out/ com.lesson.lab.Main
   ```

---

## 🧠 Code Overview

- **`Student.java`**: Defines the `Student` class with attributes and methods.
- **`Main.java`**: Implements core functionalities (add, remove, update, print).

---

## 🧪 Example Output

### 🗑️ Remove element at index 4
**Operation:** Remove  
```
Student Name : John  
Student Name : Mary  
Student Name : Krish  
Student Name : Sara  
```

### ➕ Add new student rollNumber: 6, Name: Shally, Age: 3  
**Operation:** Add  
```
Student Name : John  
Student Name : Mary  
Student Name : Krish  
Student Name : Sara  
Student Name : Shally  
```

### ✏️ Update an element at index 2  
**Operation:** Update  
```
Student Name : John  
Student Name : Mary  
Student Name : Jenny  
Student Name : Sara  
Student Name : Shally  
```

---

## 📦 Corrected Code Snippet

### `Student.java`
```java
package com.lesson.lab;

public class Student {
    private int rollNumber;
    private String name;
    private int age;

    public Student() {}

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // Getters and setters remain the same
}
```

---

## 📂 File Structure

```
StudentRecordSystem/
├── src/
│   └── com/
│       └── lesson/
│           └── lab/
│               ├── Main.java
│               └── Student.java
├── out/            # Compiled files
└── README.md
```

---

## 🧑‍💻 Author

**Masingita Ottis Maluleke**  
[LinkedIn](https://www.linkedin.com/in/thefreelancer201) | [GitHub](https://github.com/Tinyu01)  
```

Let me know if you’d like to add badges, screenshots, or a section for known issues and TODOs!