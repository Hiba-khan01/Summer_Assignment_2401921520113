package Week_4.OOPs;

// Outer class with display().
// Contains Inner class with its own display().

class Outer {

    void display() {
        System.out.println("Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Inner class");
        }
    }
  
}