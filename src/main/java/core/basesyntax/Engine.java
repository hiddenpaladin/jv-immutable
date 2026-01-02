package core.basesyntax;

import java.util.Objects;

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
        Engine newEngine = new Engine(this.horsePower,this.manufacturer);
        return newEngine.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this,obj);
    }

    @Override
    public Engine clone() {
        return new Engine(horsePower, manufacturer);
    }

    @Override
    public String toString() {
        return "Engine{"
            + "horsePower=" + horsePower
            + ", manufacturer='" + manufacturer + '\''
            + '}';
    }
}
