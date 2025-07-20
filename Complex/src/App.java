class Complex{
    double r, im;
    String name;
    Complex(String name, double r, double im){
        this.r = r;
        this.im = im;
    }
    Complex add(Complex ref){
        Complex temp = new Complex("temp", 0, 0);
        temp.r = this.r + ref.r;
        temp.im = this.im + ref.im;
        
        return temp;
    }
    
    void display(String name){
        System.out.println(name+": "+":"+" "+this.r+" + "+this.im+"i");
    }
    
    public static void main(String args[]){
        Complex c1 = new Complex("c1", 10, 20);
        Complex c2 = new Complex("c2", 5, 30);
        Complex c3 = c1.add(c2);
        c1.display("c1");
        c2.display("c2");
        c3.display("c3");   
    }
    
}