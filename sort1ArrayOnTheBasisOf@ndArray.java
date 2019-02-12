// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;
import java.io.*;
 
// A class to represent a student.
 class Student
{
    int rollno;
    char name;
 
    // Constructor
    public Student(int rollno, char name)
    {
        this.rollno = rollno;
        this.name = name;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name ;
    }
}
 
class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
 
// Driver class
class Main
{
    public static void main (String[] args)
    {
        int a[]={10,9,8,7,6,5,4,3,2,1};
        char c[]={'a','s','d','f','g','h','j','k','l','o'};
		 Student[] arr = new Student[10];
		 for(int i=0 ;i<a.length;i++)
        arr[i] = new Student(a[i],c[i]);
        
		 
			 
        
        System.out.println("Unsorted");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
 
        Arrays.sort(arr, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}