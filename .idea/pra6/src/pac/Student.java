package pac;

public class Student implements Comparable {

    private int  iDNumber;
    private int GPA;

    public Student(int idNum, int GPA) {
        this. iDNumber = idNum;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "idNum=" +  iDNumber + ", GPA=" + GPA + '}';
    }

    public int getIdNum() {
        return  iDNumber;
    }

    public void setIdNum(int idNum) {
        this. iDNumber = idNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");
        // < 0 -> o, 0 -> ==, >0 -> this;
        return this. iDNumber - ((Student) o). iDNumber;
    }
}
