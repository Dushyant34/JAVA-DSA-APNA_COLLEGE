public class OOPSI {
    public static void main(String args[]){

        //Fish shark = new Fish();
        //shark.eat();

        Dog dobby = new Dog();
        /*dobby.eat();
        dobby.breed = "Labradour";
        dobby.legs = 4;

        System.out.println(dobby.breed);
        System.out.println(dobby.legs);*/

        Bird sparrow = new Bird();
        sparrow.eat();
        dobby.walk();
        
    }
}

//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }

}

//Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walks on land");
    }
}

class Dog extends Mammal{
    String breed;
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly in sky");
    }
}