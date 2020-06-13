package aed.mergelists;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
	return i1-i2;
    }
}

