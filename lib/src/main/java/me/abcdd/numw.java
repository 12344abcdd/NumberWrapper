package me.abcdd;

public class numw extends Number {
    int int_value;
    
    public numw() {
    
    }
    
    
    public void setValue(int int_value){
        this.int_value=int_value;
    }
    
    public int intValue(){
    
        return int_value;
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