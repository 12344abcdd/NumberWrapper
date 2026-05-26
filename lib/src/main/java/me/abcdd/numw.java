package me.abcdd;

import java.math.*;

public class numw extends Number implements Operations{
    types type;
    byte byte_value;
    short short_value;
    int int_value;
    long long_value;
    float float_value;
    double double_value;
    BigInteger BigInteger_value;
    BigDecimal BigDecimal_value;
    
    public numw() {
    type=types.NULL;
    }
    
    
    public numw(byte byte_value){
        setValue(byte_value);
    }
    
    @Override
    public types getType(){
        return type;
    }
    
    public void setType(types type){
        if(this.type!=type){
            switch (type){
                case types.BYTE:
                    setValue(byteValue());
                case types.SHORT:
                    setValue(shortValue());
                case types.INT:
                    setValue(intValue());
                case types.LONG:
                    setValue(longValue());                 case types.FLOAT:
                    setValue(floatValue());
                case types.DOUBLE:
                    setValue(doubleValue());
                case types.BIGINTEGER:
                    setValue(BigIntegerValue());
                case BIGDECIMAL:
                    setValue(BigDecimalValue());
                }
            this.type=type;
            
        }
    }
    
    
    
    //设置对应类型值
    
    
    
    public void setValue(byte byte_value){
        this.byte_value=byte_value;
        type=types.BYTE;
    }
    
    
    public void setValue(short short_value){
        this.short_value=short_value;
        type=types.SHORT;
    }
    
    
    public void setValue(int int_value){
        this.int_value=int_value;
        type=types.INT;
    }
    
    
    public void setValue(long long_value){
        this.long_value=long_value;
        type=types.LONG;
    }
    
    
    public void setValue(float float_value){
        this.float_value=float_value;
        type=types.FLOAT;
    }
    
    
    public void setValue(double double_value){
        this.double_value=double_value;
        type=types.DOUBLE;
    }
    
    
    public void setValue(BigInteger BigInteger_value){
        this.BigInteger_value=BigInteger_value;
        type=types.BIGINTEGER;
    }
    
    
    public void setValue(BigDecimal BigDecimal_value){
        this.BigDecimal_value=BigDecimal_value;
        type=types.BIGDECIMAL;
    }
    
    
    //返回对应类型值
    @Override
    public String toString(){
        switch (type){
            case types.BYTE:
                return Byte.valueOf(byte_value).toString();
            case types.SHORT:
                return Short.valueOf(short_value).toString();
            case types.INT:
                return Integer.valueOf(int_value).toString();
            case types.LONG:
                return Long.valueOf(long_value).toString();
            case types.FLOAT:
                return Float.valueOf(float_value).toString();
            case types.DOUBLE:
                return Double.valueOf(double_value).toString();
            case types.BIGINTEGER:
                return BigInteger_value.toString();
            case types.BIGDECIMAL:
                return BigDecimal_value.toString();
            default:
                throw new RuntimeException();
            }
    }
   
   @Override
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
                throw new RuntimeException();
            }
    }

    @Override
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
    
    @Override
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

    @Override
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

    @Override
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

    @Override
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
    
    //big类，使用工厂方法
    @Override
    public BigInteger BigIntegerValue(){
        switch (type){
            case types.BYTE:
                return new BigInteger(Byte.valueOf(byte_value).toString());
            case types.SHORT:
                return new BigInteger(Short.valueOf(short_value).toString());
            case types.INT:
                return new BigInteger(Integer.valueOf(int_value).toString());
            case types.LONG:
                return new BigInteger(Long.valueOf(long_value).toString());
            case types.FLOAT:
                return new BigInteger(Float.valueOf(float_value).toString());
            case types.DOUBLE:
                return new BigInteger(Double.valueOf(double_value).toString());
            case types.BIGINTEGER:
                return BigInteger_value;
            case types.BIGDECIMAL:
                return new BigInteger(BigDecimal_value.toString());
            default:
                return BigInteger_value;
            }
    }
    
    @Override
    public BigDecimal BigDecimalValue(){
        switch (type){
            case types.BYTE:
                return new BigDecimal(Byte.valueOf(byte_value).toString());
            case types.SHORT:
                return new BigDecimal(Short.valueOf(short_value).toString());
            case types.INT:
                return new BigDecimal(Integer.valueOf(int_value).toString());
            case types.LONG:
                return new BigDecimal(Long.valueOf(long_value).toString());
            case types.FLOAT:
                return new BigDecimal(Float.valueOf(float_value).toString());
            case types.DOUBLE:
                return new BigDecimal(Double.valueOf(double_value).toString());
            case types.BIGINTEGER:
                return new BigDecimal(BigInteger_value.toString());
            case types.BIGDECIMAL:
                return BigDecimal_value;
            default:
                return BigDecimal_value;
            }
    }   
}