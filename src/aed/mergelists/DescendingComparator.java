package aed.mergelists;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
	return i2-i1;
    }
}

