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
}

public class ConditionBaseEncapsulation {

}
