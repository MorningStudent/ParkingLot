public class Parking extends ARealProperty {

    private byte freePlaces;
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;

    public Parking (byte freePlaces) {
        setFreePlaces(freePlaces);
    }

    public byte getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(byte freePlaces) {
        this.freePlaces = freePlaces;
    }

    public void printFreeSpaces() {

        System.out.println("Free places: " + getFreePlaces());
    }

    public Car getCarFromPlace (String place) {

        if (place.equals("1A")) {
            return place1A;
        } else if (place.equals("1B")) {
            return place1B;
        } else if (place.equals("1C")) {
            return place1C;
        } else if (place.equals("2A")) {
            return place2A;
        } else if (place.equals("2B")) {
            return place2B;
        } else if (place.equals("2C")) {
            return place2C;
        }

        return null;
    }

    public void setCarToPlace(String place, Car car) {

        if (place.equals("1A")) {
            place1A = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        } else if (place.equals("1B")) {
            place1B = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        } else if (place.equals("1C")) {
            place1C = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        } else if (place.equals("2A")) {
            place2A = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        } else if (place.equals("2B")) {
            place2B = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        } else if (place.equals("2C")) {
            place2C = car;
            setFreePlaces((byte)(getFreePlaces() - 1));
        }
    }

    public void parkCar(Car c, String place) {

        if (getCarFromPlace(place) == null) {
            setCarToPlace(place, c);
        } else {
            System.out.println(place + " is already busy! choose another place for " + c + "!");
        }
    }

    public String toString() {
        
        String out = 
        "-----------------------------------------\n" +
        "| "+String.format("%-17s", place1A)+" | "+String.format("%-17s", place2A)+" |\n" +
        "-----------------------------------------\n" +
        "| "+String.format("%-17s", place1B)+" | "+String.format("%-17s", place2B)+" |\n" +
        "-----------------------------------------\n" +
        "| "+String.format("%-17s", place1C)+" | "+String.format("%-17s", place2C)+" |\n" +
        "-----------------------------------------";

        return out.replace("null", "0   ");
    }

    public void printMap() {
        System.out.println(toString());
    }
}
