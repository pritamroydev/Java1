interface Message{
    void printMsg();
}

public class Problem1{
    public static void main(String args[]){
        Message ob = new Message(){
            public void printMsg(){
                System.out.println("Hello, Java Anonymous Class!");
            }
        };
        ob.printMsg();
    }
}