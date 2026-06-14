package me.abcdd;

public class log{
    public static void info(String arg){
            System.out.println(arg);
        }
        
        public static void warn(String arg){
            System.err.println(arg);
        }
        
        public static void err(String arg){
            throw new RuntimeException(arg);
        }
}