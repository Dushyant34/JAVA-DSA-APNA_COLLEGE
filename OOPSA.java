public class OOPSA {
    public static void main(String[] args) {
        
        //Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();

        //Chicken c1 = new Chicken();
        // c1.eat();
        // c1.walk();

        //Animal a = new Animal();      - instance creation not allowed of abstract class

        //System.out.println(h1.color);

        Mustang m1 = new Mustang();     //Animal -> Hourse -> Mustang
    }
}

abstract class Animal{
    String color;
    
    Animal(){
        color = "Brown";
        System.out.println("Animal constroctor is called...");
    }
    
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    
    Horse(){
        System.out.println("Hourse constroctor is called...");
    }

    void changeColor(){
        color = "White";
    }
    
    void walk(){
        System.out.println("Hourse walks on 4 legs");
    }
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang constroctor is called...");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}
