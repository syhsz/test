package org.example.part2_3;


import java.util.*;

@SuppressWarnings("rawtypes")
public class CompareSpeed {
    public static void main(String[] args) {
        //Check speed for ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        ListSpeed arrayListSpeed =  new ListSpeed(arrayList);
        ListSpeed linkedListSpeed =  new ListSpeed(linkedList);
        arrayListSpeed.GetAddSpeed();
        linkedListSpeed.GetAddSpeed();
        arrayListSpeed.GetSearchSpeed();
        linkedListSpeed.GetSearchSpeed();
        arrayListSpeed.GetRemoveSpeed();
        linkedListSpeed.GetRemoveSpeed();
        System.out.print("\n");

        //Check speed for HashSet and TreeSet
        Set hashSet = new HashSet();
        Set treeSet = new TreeSet();
        SetSpeed hashSetSpeed = new SetSpeed(hashSet);
        SetSpeed treeSetSpeed = new SetSpeed(treeSet);
        hashSetSpeed.GetAddSpeed();
        treeSetSpeed.GetAddSpeed();
        hashSetSpeed.GetSearchSpeed();
        treeSetSpeed.GetSearchSpeed();
        hashSetSpeed.GetRemoveSpeed();
        treeSetSpeed.GetRemoveSpeed();
        System.out.print("\n");

        //Check speed for HashMap and TreeMap
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        MapSpeed hashMapSpeed = new MapSpeed(hashMap);
        MapSpeed treeMapSpeed = new MapSpeed(treeMap);
        hashMapSpeed.GetAddSpeed();
        treeMapSpeed.GetAddSpeed();
        hashMapSpeed.GetSearchSpeed();
        treeMapSpeed.GetSearchSpeed();
        hashMapSpeed.GetRemoveSpeed();
        treeMapSpeed.GetRemoveSpeed();

    }
}