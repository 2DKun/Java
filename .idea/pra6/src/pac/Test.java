package pac;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(12, 4),
                new Student(10, 5),
                new Student(189, 81),
                new Student(2, 320)
        };
        System.out.println("\nStudents list:");
        for (Student s : students) {
            System.out.println(s);
        }




        // Метод сортировки вставками по id
        Student temp;
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }
        System.out.println("\nStudents list after sorting by inserts:");
        for (Student s : students) {
            System.out.println(s);
        }




        // Метод быстрой сортировки по GPA


        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        QSor qs = new QSor();
        qs.qSort(students, students.length-1, 0, comp);
        System.out.println("\nStudents list after quick sort:");
        for (Student s : students) {
            System.out.println(s);
        }



        // Метод сортировки слиянием


        Student[] students2 = new Student[]{  //2 список
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };

        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        MerSor ms = new MerSor();
        ms.mergeSort(allStudents, allStudents.length);
        System.out.println("\nStudents list after merge sort:");
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

}
