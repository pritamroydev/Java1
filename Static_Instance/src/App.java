class ABC{
    int a=2;
    static int b=3;

    static {
        System.out.println("Static block 1");
        b=5;
    }
    static {
        System.out.println("Static block 2");
        b=7;
    }

    {
        System.out.println("Instance block 1");
    }
    {
        System.out.println("Instance block 2");
    }
    static{
        System.out.println("The value of b is="+b);         // the O/P here is b=7, i.e., static variables(b) can be updated only using static blocks
    }

    public static void main(String args[]){
        ABC ob = new ABC();
        System.out.println("The value of a is="+ob.a);

    }
    
}