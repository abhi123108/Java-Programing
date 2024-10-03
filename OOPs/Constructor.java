package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student("Abhi");
        Student s2=new Student(1233);
        Student s3=new Student();
    }
}

class Student{
    String name;
    int rollno;

    Student(String name){
        this.name=name;
    }

    Student(int rollno){
        this.rollno=rollno;
    }

    Student(){
        System.out.println("contructor is called");
    }
}