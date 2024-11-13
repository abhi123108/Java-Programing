package OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        student s1= new student();
        s1.schoolName="CAM";

        student s2=new student();
        System.out.println(s2.schoolName);
    }
}

class student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }

    String getName(String name){
        return this.name;
    }
}
