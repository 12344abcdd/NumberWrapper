package me.abcdd;

import java.util.*;

public class test{
    public static void testget(long times){
        long j=0;
        int sum=0;
        Random r = new Random();
        long startTime=System.currentTimeMillis();
        for(;j<=times;j++){
            numw n=new numw(r.nextInt());
            sum+=n.byteValue();
            }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(sum);
        }
        
/*    public static void testget2(long times){
        long j=0;
        int sum=0;
        Random r = new Random();
        long startTime=System.currentTimeMillis();
        for(;j<=times;j++){
            numw n=new numw(r.nextInt());
            sum+=n.byteValue2();
            }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(sum);
        }*/
    }