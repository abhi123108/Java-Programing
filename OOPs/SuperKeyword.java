package OOPs;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h= new Horse();
    }
}

class Animal{
    Animal(){
        System.out.println("animal Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor is called");
    }
}