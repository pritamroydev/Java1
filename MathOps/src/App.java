class MathOps{
    
    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public String multiply(String str, int times){
        return str.repeat(times);
    }

    public static void main(String args[]){
        MathOps ob = new MathOps();
        System.out.println(ob.multiply(5,3));
        System.out.println(ob.multiply(5,3,2));
        System.out.println(ob.multiply(5.7, 4.5));
        System.out.println(ob.multiply("Hello ", 5));

    }
}
