package CreationDesignPatterns.ProtoTypeDesignPattern.Problem;

public class Student {
    int age;
    private int rollNumber;
    String name;

    Student(){}

    Student(int age, int rollNumber, String name){
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    
}
