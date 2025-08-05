class Outer{
    static int x = 10;
    int y = 15;
    private String msg = "Welcome";

    // Static Nested Class
    static class StaticNested{
        void display(){
            System.out.println("Static nexted class: "+x);
        }
    }



    // Member Inner Class (Non-Static)
    class Inner{
        void display(){
            System.out.println("Innter class: "+x+", "+y);
            System.out.println("Member Inner Class: "+msg);
        }
    }


    //  Local Inner
    void outerMethod(){
        int local = 5;          // effective final
        String name = "Pritam";
        class LocalInner{
            void print(){
                System.out.println("Local Variable: "+local);
                System.out.println("My name is: "+name);
            }
        }

        LocalInner ob3 = new LocalInner();                           // Local Inner Class
        ob3.print();

    }


    // Anonymous Inner Class
    abstract class Greetings{
        abstract void wishes();
    }

    public static void main(String args[]){
        Outer.StaticNested ob = new Outer.StaticNested();           // Static Nested Class
        ob.display();

        Outer.Inner ob2 = new Outer().new Inner();                  // Member Inner Class
        ob2.display();

        new Outer().outerMethod();

        Outer.Greetings ob4 = new Outer(). new Greetings(){         // Anonymous Inner Class
            void wishes(){
                System.out.println("Hello sir");
            }
        };
        ob4.wishes();


    }
}

