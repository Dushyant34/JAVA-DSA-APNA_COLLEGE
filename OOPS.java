public class OOPS {
    public static void main(String args[]){
        
        /*Pen p1 = new Pen();    //Created a pen object called p1.
        p1.changeColor("Blue");     //We use dot operator to access properties and function of any object. 
        System.out.println(p1.color);
        p1.changeTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);*/

        /*BankAccount myAccount = new BankAccount();
        myAccount.username = "DushyantGajipara";
        System.out.println(myAccount.username);
        //myAccount.password = "abcXYZ1";      //This will throw error as private attribute can not be accessed in other class.
        //System.out.println(myAccount.password);

        System.out.println(myAccount.setPassword("abc124"));*/

        /*//Concept of getters and setters      --Encapsulation--
        Student s1 = new Student();
        s1.setName("KashyapGajipara");
        System.out.println(s1.getName());
        s1.setAge(14);
        System.out.println(s1.getAge());

        s1.setName("Jignesh");
        System.out.println(s1.getName());*/

        //Constructors
        Employee e1 = new Employee();
        e1.employeeName = "Mandar";
        e1.employeeId = 123;
        e1.password = "abcd";
        e1.marks[0] = 100;
        e1.marks[1] = 90;
        e1.marks[2] = 80;

        Employee e4 = new Employee(e1);     //Copy constructor
        e4.password = "xyz";
        
        e1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(e4.marks[i]);
        }

        Employee e2 = new Employee("RajeshGajipara");
        System.out.println(e2.employeeName);
        Employee e3 = new Employee(34);
        System.out.println(e2.employeeId);
        //Employee e4 = new Employee("Rohit", 45);
    }
} 
 
class Pen{      //This is the blueprint of the object Pen not the actual object.
    String color;
    int tip;

    void changeColor(String newColor){
        color = newColor;
    }

    void changeTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;

    public String setPassword(String pwd){
        password = pwd;
        return password;
    }

}

//Concept of getters and setters        --Encapsulation--
class Student{
    private String name;
    private int age;
    
    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }
    
}

//Constructors
class Employee{
    String employeeName;
    int employeeId;
    String password;
    int marks[];

    Employee(){     //If not written specifically Java automatically creates contructor but there are no initiallizations in it.
        marks = new int[3];
        System.out.println("This constructor is called...");
    }

    Employee(String employeeName){      //Parameterized constructor
        marks = new int[3];
        this.employeeName = employeeName;
    }

    Employee(int employeeId){       //This is also called constructor overloading (concept of polymorphism)
        marks = new int[3];
        this.employeeId = employeeId;
    }

    /*Employee(Employee e1){      //Shallow copy constructor
        marks = new int[3];
        this.employeeName = e1.employeeName;
        this.employeeId = e1.employeeId;
        this.marks = e1.marks;      //changes will reflect
    }*/

    Employee(Employee e1){      //Deep copy constructor
        marks = new int[3];
        this.employeeName = e1.employeeName;
        this.employeeId = e1.employeeId;
        for(int i=0; i<3; i++){
            this.marks[i] = e1.marks[i];        //changes will not reflect
        }
    }
}
