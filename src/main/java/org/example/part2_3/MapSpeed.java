package org.example.part2_3;

import java.util.Map;

public class MapSpeed {
    Map<String, Integer> map;

    public MapSpeed(Map<String, Integer> map){
        this.map = map;
    }

    public void GetAddSpeed(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String strKey = "test" + i;
            map.put(strKey, i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s add %d elements: %dms\n", map.getClass().getSimpleName(), map.size(), endTime-startTime);
    }

    public void GetSearchSpeed(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < map.size(); i++) {
            String strKey = "test" + i;
            map.get(strKey);
          }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s search %d elements: %dms\n", map.getClass().getSimpleName(), map.size(), endTime-startTime);
    }

    public void GetRemoveSpeed(){
        long startTime = System.currentTimeMillis();
        int size = map.size();
        for (int i = 0; i < map.size(); i++) {
            String strKey = "test" + i;
            map.remove(strKey);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("%s remove %d elements: %dms\n", map.getClass().getSimpleName(), size, endTime-startTime);

    }
}
