package com.qb.israel.arrays;

import java.util.ArrayList;

/**
 * Created by moraleix on 2/10/2017.
 */
public class ArraysTest
{
    static boolean aBoolean;

    public static void main (String [] args)
    {
        long intTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());

        byte arrayByte [] = new byte[5];
        boolean arrayBoolean [] = new boolean[5];
        short arrayShort [] = new short[5];
        char arrayChar [] = new char[5];
        int arrayInt [] = new int[5];
        long [] arrayLong = new long[5];
        float [] arrayFloat = new float[5];
        double [] arrayDouble = new double[5];
        String [] arrayString = new String[5];

        System.out.println("Boolean default: " + aBoolean);

        for (int x=0; x < arrayByte.length; x++)
        {
            System.out.println("byte : " + x + " " + arrayByte[x]);
            System.out.println("bool :" + x + " " + arrayBoolean[x]);
            System.out.println("short :" + x + " " + arrayShort[x]);
            System.out.println("char :" + x + " " + arrayChar[x]);
            System.out.println("int :" + x + " " + arrayInt[x]);
            System.out.println("long :" + x + " " + arrayLong[x]);
            System.out.println("float :" + x + " " + arrayFloat[x]);
            System.out.println("double :" + x + " " + arrayDouble[x]);
            System.out.println("String :" + x + " " + arrayString[x]);
        }

        int [] newArray = {1,2,3};

        int [] c = {1,2,3};
        int [] ab = {1,2,3};
        int [] abc = new int [ab.length];

        System.arraycopy(ab,0,abc,0,ab.length);
        //java.util.Arrays - contains all the sorting and searching algorithms.  

        for (int a=0; a<abc.length;a++) {
        	System.out.println("abc"+abc[a]);
        }

        long endTime = System.currentTimeMillis() - intTime;
        System.out.println("Execution time: " + endTime);
        System.out.println(java.util.Arrays.toString(abc));
        byte [][][][][][] biByte = new byte [5][][][][][];
        String [][] myDualString = {{"1","2"},{"3","4"},{"5","6"}};
        
        //ArrayList
        Integer integer1 = new Integer("1500");
        Integer integer2 = new Integer(100);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(integer1);
        arrayList.add(integer2);
        arrayList.add(5);
        arrayList.add(1,255); //Autoboxing and placing on position 1 and moving the rest of the elements one position under.
        
        System.out.println(arrayList);
        arrayList.remove(integer2);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

    }
}
