public class OOPSP {
    public static void main(String args[]){

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,3));
        // System.out.println(calc.sum((float)1.5, (float)3.5));
        // System.out.println(calc.sum(1,3,5));

        Deer d = new Deer();
        d.eat();
    }
}

class Calculator{
    
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    
    void eat(){
        System.out.println("Eats anything");
    } 
}

class Deer extends Animal{

    void eat(){
        System.out.println("Eats Grass");
    }
}
