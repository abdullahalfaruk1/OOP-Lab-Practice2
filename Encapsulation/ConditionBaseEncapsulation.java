package Encapsulation;

class Student {
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be Negative");
        }
    }

    public int getAge() {
        return age;
    }
}

public class ConditionBaseEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
       
        System.out.println("Age : " + s.getAge());
    }
}
