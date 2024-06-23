//RUKUNDO NDANGIZI DIDIER
package questionfive;


public class Car {
    private String make;
    private int yearModel;

    // Constructor
    public Car(String make, int yearModel) {
        this.make = make;
        this.yearModel = yearModel;
    }

    // Getter and setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
}

