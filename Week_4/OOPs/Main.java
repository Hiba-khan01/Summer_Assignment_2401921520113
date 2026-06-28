package Week_4.OOPs;

// Creates objects of Outer and Inner.
// Calls both display() methods.

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();

        Outer.Inner i = o.new Inner();
        i.display();
    }
  
}
