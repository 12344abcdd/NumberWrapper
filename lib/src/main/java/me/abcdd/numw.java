package me.abcdd;

public class numw extends Number {
    public numw() {
    
    }
    
    
    public int intValue(){
    
        return 0;
    }


    public long longValue(){
    
        return 0L;
    }


    public float floatValue(){
        return (float)doubleValue();
    }


    public double doubleValue(){
        return 0.0;
    }


    public byte byteValue() {
        return (byte)intValue();
    }


    public short shortValue() {
        return (short)intValue();
    }
}