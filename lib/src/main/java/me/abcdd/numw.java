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
    
    
 //   @Override
    
    
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
   
   //使用Getable接口的静态方法，返回Number对象并调用返回对应值的方法
   @Override
    public byte byteValue(){
        return Getable.getValue(this).byteValue();
    }

    @Override
    public short shortValue(){
        return Getable.getValue(this).shortValue();
    }
    
    @Override
    public int intValue(){
        return Getable.getValue(this).intValue();
    }

    @Override
    public long longValue(){
        return Getable.getValue(this).longValue();
    }

    @Override
    public float floatValue(){
        return Getable.getValue(this).floatValue();
    }

    @Override
    public double doubleValue(){
        return Getable.getValue(this).doubleValue();
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