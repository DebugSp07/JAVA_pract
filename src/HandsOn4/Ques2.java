package HandsOn4;

class Parent {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Method of parent class by object of parent class
        parentObj.printParent();

        // Method of child class by object of child class
        childObj.printChild();

        // Method of parent class by object of child class
        childObj.printParent();
    }
}





