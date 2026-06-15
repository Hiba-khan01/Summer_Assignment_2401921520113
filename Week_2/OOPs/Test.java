package Week_2.OOPs;

package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part A
        Veena veena = new Veena();
        veena.play();

        // Part B
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Part C
        Playable p1 = new Veena();
        Playable p2 = new Saxophone();

        p1.play();
        p2.play();
    }
}