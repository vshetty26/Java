// Write a program to create parent class College(cno, cname, caddr) and derived class department(dno, dname) from 
//college. Write a necessary methods to display college details. 

import java.util.Scanner;

class College {
    int cno;
    String cname;
    String caddr;
    College(int cno,String cname,String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    void display() {
        System.out.println("College number " + cno);
        System.out.println("College name " + cname);
        System.out.println("College address " + caddr);
    }
}
class Department extends College {
    int dno;
    String dname;

    Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    void display() {
        super.display();
        System.out.println("Department number " + dno);
        System.out.println("Department name " + dname);
    }
}

class Parent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("College Number");
        int cno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("College Name");
        String cname = scanner.nextLine();

        System.out.print("College Address");
        String caddr = scanner.nextLine();

        System.out.print(" Department Number");
        int dno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Department Name");
        String dname = scanner.nextLine();

        Department d = new Department(cno,cname, caddr, dno, dname);
        d.display();
        scanner.close();
    }
}