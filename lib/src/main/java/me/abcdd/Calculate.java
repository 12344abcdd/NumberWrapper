package me.abcdd;

public interface Calculate{
    
    public static numw add(numw numwObj1,numw numwObj2,types type){
        switch (type){
            case types.BYTE:
                return new numw(numwObj1.byteValue()+numwObj2.byteValue());
            case types.SHORT:
                return new numw(numwObj1.shortValue()+numwObj2.shortValue());
            case types.INT:
                return new numw(numwObj1.intValue()+numwObj2.intValue());
            case types.LONG:
                return new numw(numwObj1.longValue()+numwObj2.longValue());
            case types.FLOAT:
                return new numw(numwObj1.floatValue()+numwObj2.floatValue());
            case types.DOUBLE:
                return new numw(numwObj1.doubleValue()+numwObj2.doubleValue());
            case types.BIGINTEGER:
                return new numw(numwObj1.BigIntegerValue().add(numwObj2.BigIntegerValue()));
            case types.BIGDECIMAL:
                return new numw(numwObj1.BigDecimalValue().add(numwObj2.BigDecimalValue()));
            default:
                throw new RuntimeException();
            }
    
    }
    public numw add(numw numwObj);
    public void selfadd(numw numwObj);
    /*
    public numw subtract(numw numwObj);
    public void selfsubtract(numw numwObj);
    
    public numw multiply(numw numwObj);
    public void selfmultiply(numw numwObj);*/
    
    
    }