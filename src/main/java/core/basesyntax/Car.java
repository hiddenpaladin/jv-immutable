package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Make this class immutable. See requirements in task description.
 */
public final class Car {
    private final Integer year;
    private final String color;
    private final List<Wheel> wheels;
    private final Engine engine;

    public Car(Integer year, String color, List<Wheel> wheels, Engine engine) {
        this.year = year;
        this.color = color;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public List<Wheel> getWheels() {
        return new ArrayList<>(wheels);
    }

    public Engine getEngine() throws CloneNotSupportedException {
        return engine.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //implement this class

    public Car changeEngine(Engine engine) {
        return new Car(this.year,this.color,this.wheels,engine);
    }

    public Car changeColor(String newColor) {
        return new Car(this.year,newColor,this.wheels,this.engine);
    }

    public Car addWheel(Wheel newWheel) {
        List<Wheel> newArray = new ArrayList<>(wheels);
        newArray.add(newWheel);
        return new Car(this.year,this.color,newArray,this.engine);
    }

    @Override
    public String toString() {
        return "Car{"
            + "year=" + year
            + ", color='" + color + '\''
            + ", wheels=" + wheels
            + ", engine=" + engine
            + '}';
    }
}
