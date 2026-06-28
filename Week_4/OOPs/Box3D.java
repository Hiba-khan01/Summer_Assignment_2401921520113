package Week_4.OOPs;

// Extends Box.
// Calculates volume.

class Box3D extends Box {
    int height;

    Box3D(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }
  
}