public class App {

    public static void main(String[] args) {
        
        Car c1 = new Car("BMW","[AB-123]");
        Car c2 = new Car("Mercedes", "[BC-321]");
        Car c3 = new Car("Fiat", "[XY-567]");


        ARealProperty parking1 = new Parking((byte)6);

        ((Parking)parking1).parkCar(c1, "1B");
        ((Parking)parking1).parkCar(c2, "1C");
        ((Parking)parking1).parkCar(c3, "2A");

        //System.out.println(parking1);

        ((Parking)parking1).printFreeSpaces();

        ((Parking)parking1).printMap();

        System.out.println(((Parking)parking1).getCarFromPlace("2A"));

    }
}