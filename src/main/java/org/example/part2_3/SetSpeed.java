package org.example.part2_3;

import java.util.Iterator;
import java.util.Set;

public class SetSpeed {
    Set set;

    public SetSpeed(Set set) {
        this.set = set;
    }

    public void GetAddSpeed() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%s add %d elements: %dms\n", set.getClass().getSimpleName(), set.size(), endTime - startTime);
    }

    public void GetSearchSpeed() {
        long startTime = System.currentTimeMillis();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%s search %d elements: %dms\n", set.getClass().getSimpleName(), set.size(), endTime - startTime);
    }

    public void GetRemoveSpeed() {
        long startTime = System.currentTimeMillis();
        int size = set.size();
        for (int i = 0; i < size; i++) {
            set.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%s remove %d elements: %dms\n", set.getClass().getSimpleName(), size, endTime - startTime);

    }
}
