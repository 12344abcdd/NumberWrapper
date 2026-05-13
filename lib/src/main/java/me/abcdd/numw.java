package me.abcdd;

import java.math.*;

public class numw extends Number {
    private types type;
    byte byte_value;
    short short_value;
    int int_value;
    long long_value;
    float float_value;
    double double_value;
    BigInteger BigInteger_value;
    BigDecimal BigDecimal_value;
    
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
    
    return 0;
    }
    //返回对应类型值
    
    public byte byteValue() {
        switch (type){
            case types.BYTE:
                return byte_value;
            case types.SHORT:
                return (byte)short_value;
            case types.INT:
                return (byte)int_value;
            case types.LONG:
                return (byte)long_value;
            case types.FLOAT:
                return (byte)float_value;
            case types.DOUBLE:
                return (byte)double_value;
            case types.BIGINTEGER:
                return BigInteger_value.byteValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.byteValue();
            default:
                return byte_value;
            }
    }


    public short shortValue() {
        switch (type){
            case types.BYTE:
                return (short)byte_value;
            case types.SHORT:
                return short_value;
            case types.INT:
                return (short)int_value;
            case types.LONG:
                return (short)long_value;
            case types.FLOAT:
                return (short)float_value;
            case types.DOUBLE:
                return (short)double_value;
            case types.BIGINTEGER:
                return BigInteger_value.shortValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.shortValue();
            default:
                return short_value;
            }
    }
    
    
    public int intValue(){
        switch (type){
            case types.BYTE:
                return (int)byte_value;
            case types.SHORT:
                return (int)short_value;
            case types.INT:
                return int_value;
            case types.LONG:
                return (int)long_value;
            case types.FLOAT:
                return (int)float_value;
            case types.DOUBLE:
                return (int)double_value;
            case types.BIGINTEGER:
                return BigInteger_value.intValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.intValue();
            default:
                return int_value;
            }
    }


    public long longValue(){
        switch (type){
            case types.BYTE:
                return (long)byte_value;
            case types.SHORT:
                return (long)short_value;
            case types.INT:
                return (long)long_value;
            case types.LONG:
                return long_value;
            case types.FLOAT:
                return (long)float_value;
            case types.DOUBLE:
                return (long)double_value;
            case types.BIGINTEGER:
                return BigInteger_value.longValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.longValue();
            default:
                return long_value;
            }
    }


    public float floatValue(){
        switch (type){
            case types.BYTE:
                return (float)byte_value;
            case types.SHORT:
                return (float)short_value;
            case types.INT:
                return (float)int_value;
            case types.LONG:
                return (float)long_value;
            case types.FLOAT:
                return float_value;
            case types.DOUBLE:
                return (float)double_value;
            case types.BIGINTEGER:
                return BigInteger_value.floatValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.floatValue();
            default:
                return float_value;
            }
    }


    public double doubleValue(){
        switch (type){
            case types.BYTE:
                return (double)byte_value;
            case types.SHORT:
                return (double)short_value;
            case types.INT:
                return (double)int_value;
            case types.LONG:
                return (double)long_value;
            case types.FLOAT:
                return double_value;
            case types.DOUBLE:
                return double_value;
            case types.BIGINTEGER:
                return BigInteger_value.doubleValue();
            case types.BIGDECIMAL:
                return BigDecimal_value.doubleValue();
            default:
                return double_value;
            }
    }
}