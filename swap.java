public class Swap {
    public static void main(String[] args){
        int a=23; int b=31;
        System.out.println("a ="+a+" b ="+b+" before swap");
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("after swap a ="+a+" b ="+b);
    }
}
