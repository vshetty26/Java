// class method{
//     public void Display()
//     {
//         int a=10;
//         System.out.println(a);
//     }
//     public static void main(String[] args){
//         System.out.println("Try programiz.pro");
//         method obj= new method();
//         obj.Display();
//     }
// }

class method{
    public static int Display()
    {
        int a=10;
        return a;
    }
    public static void main(String[] args){
        System.out.print(method.Display());
    }
}