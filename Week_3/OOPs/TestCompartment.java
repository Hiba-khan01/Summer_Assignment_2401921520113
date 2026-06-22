// Create random compartments and demonstrate polymorphism.
package Week_3.OOPs;

import java.util.Random;

class TestCompartment {
    public static void main(String[] args) {

        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            int x = r.nextInt(4) + 1;

            if(x == 1)
                c[i] = new FirstClass();
            else if(x == 2)
                c[i] = new Ladies();
            else if(x == 3)
                c[i] = new General();
            else
                c[i] = new Luggage();
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(c[i].notice());
        }
    }
}