interface Square{
    int calculate(int x);
}

public class Problem2{
    public static void main(String args[]){
        Square ob = (a) -> (a*a);
        System.out.println(ob.calculate(7));
    }
}