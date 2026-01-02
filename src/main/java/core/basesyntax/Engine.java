package core.basesyntax;

public class Engine implements Cloneable {
    private Integer horsePower;
    private String manufacturer;

    public Engine(Integer horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getHorsePower() {
        Engine newEngine = new Engine(this.horsePower,this.manufacturer);
        return newEngine.horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(horsePower,manufacturer);
    }

    //implement this

    @Override
    public String toString() {
        return "Engine{"
            + "horsePower=" + horsePower
            + ", manufacturer='" + manufacturer + '\''
            + '}';
    }
}
