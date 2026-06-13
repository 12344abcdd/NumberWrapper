package me.abcdd;

public interface Calculate{
    public static Numw add(Numw numwObj1,Numw numwObj2,Types type){
        switch (type){
            case Types.BYTE:
                return new Numw(numwObj1.byteValue()+numwObj2.byteValue());
            case Types.SHORT:
                return new Numw(numwObj1.shortValue()+numwObj2.shortValue());
            case Types.INT:
                return new Numw(numwObj1.intValue()+numwObj2.intValue());
            case Types.LONG:
                return new Numw(numwObj1.longValue()+numwObj2.longValue());
            case Types.FLOAT:
                return new Numw(numwObj1.floatValue()+numwObj2.floatValue());
            case Types.DOUBLE:
                return new Numw(numwObj1.doubleValue()+numwObj2.doubleValue());
            case Types.BIGINTEGER:
                return new Numw(numwObj1.BigIntegerValue().add(numwObj2.BigIntegerValue()));
            case Types.BIGDECIMAL:
                return new Numw(numwObj1.BigDecimalValue().add(numwObj2.BigDecimalValue()));
            default:
                throw new RuntimeException();
            }
    
    }
    
    
    public Numw add(Numw numwObj);
    public void selfadd(Numw numwObj);
    /*
    public Numw subtract(Numw numwObj);
    public void selfsubtract(Numw numwObj);
    
    public Numw multiply(Numw numwObj);
    public void selfmultiply(Numw numwObj);*/
    
    
    }