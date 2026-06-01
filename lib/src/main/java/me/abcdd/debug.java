package me.abcdd;

public class debug{
    public static debugMode debugmode=debugMode.INFO;
    
    public static void info(String arg){
        if(debugmode==debugMode.INFO){
            System.out.println(arg);
            }
        }
        
        public static void warn(String arg){
        if(debugmode==debugMode.INFO|debugmode==debugMode.WARN){
            System.err.println(arg);
            }
        }
        
        public static void err(String arg){
        throw new RuntimeException(arg);
    }
    
    }