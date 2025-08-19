interface Operation{
    int op(int a, int b);
}


public class Problem3{
    public static void main(String args[]){
        Operation ob1 = (a,b) -> (a+b);
        System.out.println(ob1.op(7,5));
        
        Operation ob2 = (a,b) -> (a-b);
        System.out.println(ob2.op(7,5));

        Operation ob3 = (a,b) -> (a*b);
        System.out.println(ob3.op(7,5));
    }
}