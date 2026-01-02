package core.basesyntax;

import java.util.Objects;

public class Wheel implements Cloneable {
    private  Integer radius;

    public Wheel(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        Wheel newWheel = new Wheel(this.radius);
        return newWheel.radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
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
    public Wheel clone() {
        return new Wheel(radius);
    }

    //implement this class

    @Override
    public String toString() {
        return "Wheel{"
            + "radius=" + radius
            + '}';
    }
}
