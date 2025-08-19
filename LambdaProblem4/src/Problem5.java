interface Check{
    boolean test(int x);
}


public class Problem5{
    public static void main(String args[]){
        Check ob = (a) -> (a%2==0);
        if(ob.test(13)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}