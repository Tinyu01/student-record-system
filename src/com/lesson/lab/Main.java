package com.lesson.lab;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "John", 19);
        students[1] = new Student(2, "Mary", 23);
        students[2] = new Student(3, "Krish", 18);
        students[3] = new Student(4, "Sara", 20);
        students[4] = new Student(5, "Harry", 25);

        System.out.println("Remove element at 4");
        int indexToDelete = 4;
        students = removeElement(indexToDelete, students);

        System.out.println("\nAdd new student rollNumber:6, Name:shally, Age:3");
        Student newStudent = new Student(6, "shally", 3);
        students = addElement(newStudent, students);

        System.out.println("\nUpdate an element at index 2");
        int indexToUpdate = 2;
        students = updateElement(indexToUpdate, students);
    }

    public static Student[] removeElement(int indexToDelete, Student[] originalArray) {
        Student[] newArray = new Student[originalArray.length - 1];
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = originalArray[i];
            }
        }
        printArray("Remove", newArray);
        return newArray;
    }

    public static Student[] addElement(Student newStudent, Student[] originalArray) {
        Student[] newArray = new Student[originalArray.length + 1];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        newArray[newArray.length - 1] = newStudent;
        printArray("Add", newArray);
        return newArray;
    }

    public static Student[] updateElement(int indexToUpdate, Student[] originalArray) {
        originalArray[indexToUpdate].setName("Jenny");
        printArray("Update", originalArray);
        return originalArray;
    }

    public static void printArray(String message, Student[] students) {
        System.out.println("\nOperation:" + message);
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
        }
    }
}