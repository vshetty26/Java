class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display method in Child class");
    }

    void show() {
        super.display();
        this.display();
    }
}
public class MethodResolution {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.display();

    }
}
