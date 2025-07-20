class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println("Int(5+7): "+c.add(5,7)+"Double(5.0+7.0): "+c.add(5.0, 7.0));
    }
}
