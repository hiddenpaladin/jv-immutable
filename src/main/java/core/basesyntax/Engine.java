package core.basesyntax;

import java.util.Objects;

public class Engine {
    private Integer horsePower;
    private String manufacturer;

    public Engine(Integer horsePower, String manufacturer) {
        this.horsePower = horsePower;
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
        return Objects.hash(horsePower,manufacturer);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Ссылка на самого себя
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Engine myClass = (Engine) obj; // Приведение типа
        return horsePower == myClass.horsePower && Objects.equals(manufacturer, myClass.manufacturer);
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
