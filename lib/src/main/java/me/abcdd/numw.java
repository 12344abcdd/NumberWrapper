package me.abcdd;

public class numw extends Number {
    private types type;
    byte byte_value;
    short short_value;
    int int_value;
    long long_value;
    float float_value;
    double double_value;
    
    
    public numw() {
    }
    
    
    public types getType(){
        return type;
    }
    public void setType(types type){
        this.type=type;
    }
    
    public void setValue(int int_value){
        this.int_value=int_value;
        type=types.INT;
    }
    
    public int toInt(){
        switch (type){
            case types.INT:
                return int_value;
            default:
                return int_value;
        }
    }
    
    public int intValue(){
        return type==types.INT ? int_value : toInt();
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