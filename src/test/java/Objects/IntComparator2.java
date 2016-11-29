package Objects;

import java.util.Comparator;

/**
 * Created by Pajut on 7.11.2016.
 */
public class IntComparator implements Comparator<IntObject> {
    public int compare(IntObject o1, IntObject o2) {
        if(o1.getValue()< o2.getValue()){
            return 1;
        }else if (o1.getValue() == o2.getValue()){
            return 0;
        }else{
            return -1;
        }
    }
}
