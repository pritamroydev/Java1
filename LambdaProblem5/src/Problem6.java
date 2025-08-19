interface Converter{
    String convert(String s);
}

public class Problem6{
    public static void main(String args[]){
        Converter ob1 = (a) -> a.toUpperCase();
        System.out.println(ob1.convert("hello world"));
    }
}