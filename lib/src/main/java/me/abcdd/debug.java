package me.abcdd;

public class debug{
    public static boolean enableDebug=true;
    public static void debug(String arg){
        if(enableDebug){
            System.out.println(arg);
            }
        }
    }