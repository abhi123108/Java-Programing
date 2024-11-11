package OOPs;

public class Inheritence {
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.eat();;
    }
}
//base class
class Animal {
    String color;

    void eat(){

    }

    void breath(){
        
    }
}

//derived class / subclass
class Fish extends Animal{
    int fins;

    void sweem(){
        System.out.println("Swims in water");
    }
}
