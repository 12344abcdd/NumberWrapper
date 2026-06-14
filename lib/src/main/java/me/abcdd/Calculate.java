package me.abcdd;

public interface Calculate{
    public static numW add(numW numwObj1,numW numwObj2,Types type){
        switch (type){
            case Types.BYTE:
                return new numW(numwObj1.byteValue()+numwObj2.byteValue());
            case Types.SHORT:
                return new numW(numwObj1.shortValue()+numwObj2.shortValue());
            case Types.INT:
                return new numW(numwObj1.intValue()+numwObj2.intValue());
            case Types.LONG:
                return new numW(numwObj1.longValue()+numwObj2.longValue());
            case Types.FLOAT:
                return new numW(numwObj1.floatValue()+numwObj2.floatValue());
            case Types.DOUBLE:
                return new numW(numwObj1.doubleValue()+numwObj2.doubleValue());
            case Types.BIGINTEGER:
                return new numW(numwObj1.BigIntegerValue().add(numwObj2.BigIntegerValue()));
            case Types.BIGDECIMAL:
                return new numW(numwObj1.BigDecimalValue().add(numwObj2.BigDecimalValue()));
            default:
                throw new RuntimeException();
            }
    
    }
    
    
    public numW add(numW numwObj);
    public void selfadd(numW numwObj);
    /*
    public numW subtract(numW numwObj);
    public void selfsubtract(numW numwObj);
    
    public numW multiply(numW numwObj);
    public void selfmultiply(numW numwObj);*/
    
    
    }