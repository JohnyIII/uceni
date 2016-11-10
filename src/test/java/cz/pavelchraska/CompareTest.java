package cz.pavelchraska;

import Objects.IntObject;
import org.junit.Assert;
import org.junit.Test;

public class CompareTest {
    IntObject[] field = new IntObject[20];

    @Test
    public void test() {
        for (int i = 0; i < field.length; i++) {
            field[i] = new IntObject();
            field[i].setValue((int) (Math.random() * 20));
        }
        sortAsc();
        Assert.assertTrue(isSortedAsc());

    }

    @Test
    public void test2() {
        for (int i = 0; i < field.length; i++) {
            field[i] = new IntObject();
            field[i].setValue((int) (Math.random() * 20));
        }
        sortDes();
        Assert.assertTrue(isSortedDes());

    }

    private boolean isSortedAsc() {
        for (int i = 0; i < field.length - 1; i++) {

            if (field[i].getValue() < field[i + 1].getValue()) return false;
        }
        return true;
    }

    private boolean isSortedDes() {
        for (int i = 0; i < field.length - 1; i++) {

            if (field[i].getValue() > field[i + 1].getValue()) return false;
        }
        return true;
    }

    private void sortAsc() {

    }

    private void sortDes() {

    }
}
