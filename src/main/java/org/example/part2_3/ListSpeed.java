package org.example.part2_3;

import java.util.List;

public class ListSpeed {

    List<Integer> list;

    public ListSpeed(List<Integer> list){
        this.list = list;
    }

    public void GetAddSpeed() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s add %d elements: %dms\n", list.getClass().getSimpleName(), list.size(), endTime-startTime);
    }

    public void GetSearchSpeed() {
        long startTime = System.currentTimeMillis();
        int num = 10000;
        for (int i = 0; i < num; i++) {
            list.get(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s search %d elements: %dms\n", list.getClass().getSimpleName(), num, endTime-startTime);
    }

    public void GetRemoveSpeed() {
        long startTime = System.currentTimeMillis();
        int num = 10000;
        for (int i = 0; i < num; i++) {
            list.remove(0);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s remove %d elements from the begin: %dms\n", list.getClass().getSimpleName(), num, endTime-startTime);
    }



}
