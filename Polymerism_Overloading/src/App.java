class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }

    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println("Int sum: "+c.add(5,3));
        System.out.println("Int sum: "+c.add(3.0,3.9));
        System.out.println("Int sum: "+c.add("Pritam","Roy"));
    }


}