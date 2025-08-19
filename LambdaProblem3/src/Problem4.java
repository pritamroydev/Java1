interface LengthFinder{
    int length(String x);
}


public class Problem4{
    public static void main(String args[]){
        LengthFinder l = (a) -> (a.length());
        System.out.println(l.length("LambdaExpression"));
    }
}