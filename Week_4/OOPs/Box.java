package Week_4.OOPs;

// Base class storing length and breadth.
// Calculates area.

class Box {
    int length;
    int breadth;

    Box(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}