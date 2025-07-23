class Calculator{
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        if(b==0){
            System.out.println("Error: Div by 0");
            return 0;
        }
        else{
            return a/b;
        }
    }

}

class SciCalc extends Calculator{
        public double getSin(int x1){
            return Math.sin(Math.toRadians(x1));
        }
        public double getCos(int x2){
            return Math.cos(Math.toRadians(x2));
        }
    }

public class Main{
    public static void main(String args[]){
        SciCalc ob = new SciCalc();
        System.out.println(ob.sum(5, 8));
        System.out.println(ob.multi(9, 7));
        System.out.println(ob.getSin(30));
        System.out.println(ob.getCos(45));
    }
}