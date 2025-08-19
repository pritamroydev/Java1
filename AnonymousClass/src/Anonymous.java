interface Animal{
    void sound();
}

public class Anonymous{
    public static void main(String args[]){
        Animal ob1 = new Animal(){
            public void sound(){
                System.out.println("Woof woof!!");
            }
        };
        ob1.sound();
    }
}