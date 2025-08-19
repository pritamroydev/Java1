interface Calc{
    int sum(int a, int b);
}

public class Lambda{
    public static void main(String args[]){
        Calc l = (a, b) -> {                    // or (a+b);
            int c = a+b;                
            return c;
        };
        System.out.println(l.sum(5, 6));

    }
}