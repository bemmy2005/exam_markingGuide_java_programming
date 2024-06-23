//RUKUNDO NDANGIZI DIDIER
package questionfive;

public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", 2020);
        System.out.println("My car is a " + myCar.getMake() + " " + myCar.getYearModel());

        // Creating a CellPhone object
        CellPhone myPhone = new CellPhone("Apple", "iPhone 12", 1001.99);
        System.out.println("My phone is a " + myPhone.getManufacturer() + " " + myPhone.getModel() + " which costs $" + myPhone.getRetailPrice());
    }
}
