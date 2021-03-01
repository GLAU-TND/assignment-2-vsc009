/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Vishal", 56));
        queue.enqueue(new Student("Kush", 15));
        queue.enqueue(new Student("Priyanshu", 34));
        queue.enqueue(new Student("Aryan", 5));
        queue.enqueue(new Student("Shubham", 46));
        queue.enqueue(new Student("Shivam", 56));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}