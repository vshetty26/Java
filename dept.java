class Employee {
    void display() {
        System.out.println("Base class");
    }
}

class dept extends Employee {
    void display1() {
        System.out.println("Derived class");
    }

    public static void main(String[] args) {
        dept d = new dept();
        d.display();
        d.display1();
    }
}