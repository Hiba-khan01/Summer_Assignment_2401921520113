package Week_4.OOPs;

// Creates Box3D object.
// Displays area and volume.

public class TestBox {
    public static void main(String[] args) {

        Box3D b = new Box3D(5, 4, 3);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}
