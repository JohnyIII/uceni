package Objects;

import javax.print.attribute.HashAttributeSet;

/**
 * Created by Pajut on 7.11.2016.
 */
public class IntObject {
    private int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntObject intObject = (IntObject) o;

        return value == intObject.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
