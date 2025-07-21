class Sorcerer{
    void domain(){
        System.out.println("Domain Expansion");
    }
}

class Sukuna extends Sorcerer{
    void domain(){
        System.out.println("Domain Expansion: Melovrent Shrine");
    }

}

class Gojo extends Sorcerer{
    void domain(){
        System.out.println("Domain Expansion: Infinite Void");

    }
}


public class battle{
    public static void main(String args[]){
        Sorcerer g = new Gojo();
        g.domain();
        Sorcerer s = new Sukuna();
        s.domain();
    }
}