package core.basesyntax;

import java.util.*;

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
        this.engine = engine;
        List<Wheel> tempList;
        tempList = new ArrayList<>();
        for (int i = 0; i <= wheels.size(); i++) {
            tempList.set(i,wheels.get(i).clone());
        }
        this.wheels = tempList;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public List<Wheel> getWheels() {
        List<Wheel> tempList;
        tempList = new ArrayList<>();
        for (int i = 0; i <= wheels.size(); i++) {
            tempList.set(i,wheels.get(i).clone());
        }
        return tempList;
    }

    public Engine getEngine() {
        Engine tempEngine = engine.clone();
        return tempEngine;
    }

    //переделать все что под этим сообщением

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {
        return  Objects.equals(this,obj);
    }

    public Car changeEngine(Engine engine) {
        return new Car(this.year,this.color,this.wheels,engine);
    }

    public Car changeColor(String newColor) {
        return new Car(this.year,newColor,this.wheels,this.engine);
    }

    public Car addWheel(Wheel newWheel) {
        List<Wheel> tempList;
        tempList = new ArrayList<>();
        for (int i = 0; i <= wheels.size(); i++) {
            tempList.set(i,wheels.get(i).clone());
        }
        tempList.add(newWheel.clone());
        return new Car(this.year,this.color,tempList,this.engine);
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
