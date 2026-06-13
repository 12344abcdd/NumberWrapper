package me.abcdd;

import java.util.*;
import java.math.*;

public class test{
    public static void testGetInt(long times){
        long j=0;
        int sum=0;
        Random r = new Random();
        long startTime=System.currentTimeMillis();
        for(;j<=times;j++){
            Numw n=new Numw(r.nextInt());
            sum+=n.intValue();
            }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(sum);
        }
        public static void testGetBigInt(long times){
        long j=0;
        BigInteger sum=BigInteger.ZERO;
        Random r = new Random();
        long startTime=System.currentTimeMillis();
        for(;j<=times;j++){
            Numw n=new Numw(r.nextInt());
            sum=sum.add(n.BigIntegerValue());
            }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(sum);
        }
    }