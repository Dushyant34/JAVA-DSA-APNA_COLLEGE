public class Static {
    public static void main(String[] args) {
        
        // Student s1 = new Student();
        // s1.schoolname = "SSB";
        // System.out.println(s1.percentage(90, 80, 70));

        // Student s2 = new Student();
        // System.out.println(s2.schoolname);

        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Student{
    String name;
    int rollno;

    static String schoolname;

    static int percentage(int phy, int maths, int chem){
        return (phy+maths+chem)/3;
    }
    
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal{
    
    //super();      //If not written by us Java atomatically writes this.
    Horse(){
        super.color = "White";
        System.out.println("Horse constructor is called...");
    }
}
