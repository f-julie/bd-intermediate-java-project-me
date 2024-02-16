package com.amazon.ata.deliveringonourpromise.comparators;

import java.util.Comparator;
import com.amazon.ata.deliveringonourpromise.types.Promise;

public class PromiseAsinComparator implements Comparator<Promise> {
    // Compare the ASIN and return whichever is greater
    // Compare two strings and sort alphabetically

    @Override
    public int compare(Promise p1, Promise p2) {
        String asin1 = p1.getAsin();
        String asin2 = p2.getAsin();
        return asin1.compareTo(asin2);
    }
}
