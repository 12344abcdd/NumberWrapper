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
    
    
    //对应类型的构造方法
    public numw() {
    
    }
    
    public numw(byte byte_value){
        setValue(byte_value);
    }
    
    public numw(short short_value){
        setValue(short_value);
    }
    
    public numw(int int_value){
        setValue(int_value);
    }
    
    public numw(long long_value){
        setValue(long_value);
    }
    
    public numw(float float_value){
        setValue(float_value);
    }
    
    public numw(double double_value){
        setValue(double_value);
    }
    
    public numw(BigInteger BigInteger_value){
        setValue(BigInteger_value);
    }
    
    public numw(BigDecimal BigDecimal_value){
        setValue(BigDecimal_value);
    }
    
    
    public numw add(numw numwObj,types type){
        switch (type){
            case types.BYTE:
                return new numw(byteValue()+numw.byteValue());
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
        //return new numw();
    }
    
    @Override
    public numw add(numw numwObj){
        /*if(type.ordinal()>=numwObj.getType().ordinal()){
            numwObj.setType(types.cast(type,numwObj.getType()));
            
        }*/
        
        throw new RuntimeException();
    }
        
    @Override
    public void selfadd(numw numwObj){
        /*switch(type){
            case types.Byte:
                byte_value+=numw*/
    }
    
    @Override
    public types getType(){
        return type;
    }
    
    @Override
    public void setType(types type){
        if(this.type!=type){
            switch (type){
                case types.BYTE:
                    setValue(byteValue());
                    break;
                case types.SHORT:
                    setValue(shortValue());
                    break;
                case types.INT:
                    setValue(intValue());
                    break;
                case types.LONG:
                    setValue(longValue());
                    break;
                case types.FLOAT:
                    setValue(floatValue());
                    break;
                case types.DOUBLE:
                    setValue(doubleValue());
                    break;
                case types.BIGINTEGER:
                    setValue(BigIntegerValue());
                    break;
                case BIGDECIMAL:
                    setValue(BigDecimalValue());
                    break;
                }
            this.type=type;
            
        }
    }
    
    
    
    //设置对应类型值
    @Override
    public void setValue(byte byte_value){
        this.byte_value=byte_value;
        type=types.BYTE;
    }
    
    @Override
    public void setValue(short short_value){
        this.short_value=short_value;
        type=types.SHORT;
    }
    
    @Override
    public void setValue(int int_value){
        this.int_value=int_value;
        type=types.INT;
    }
    
    @Override
    public void setValue(long long_value){
        this.long_value=long_value;
        type=types.LONG;
    }
    
    @Override
    public void setValue(float float_value){
        this.float_value=float_value;
        type=types.FLOAT;
    }
    
    @Override
    public void setValue(double double_value){
        this.double_value=double_value;
        type=types.DOUBLE;
    }
    
    @Override
    public void setValue(BigInteger BigInteger_value){
        this.BigInteger_value=BigInteger_value;
        type=types.BIGINTEGER;
    }
    
    @Override
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
                throw new RuntimeException();
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
                throw new RuntimeException();
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
                throw new RuntimeException();
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
                throw new RuntimeException();
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
                throw new RuntimeException();
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
                throw new RuntimeException();
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
                throw new RuntimeException();
            }
    }   
}