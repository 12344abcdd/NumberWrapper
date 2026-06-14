package me.abcdd;

public interface Getable{
    public me.abcdd.Types getType();
    public java.lang.String toString();
    public byte byteValue();
    public short shortValue();
    public int intValue();
    public long longValue();
    public float floatValue();
    public double doubleValue();
    public java.math.BigInteger BigIntegerValue();
    public java.math.BigDecimal BigDecimalValue();
  
    @SuppressWarnings("unchecked")
    public static <T extends Number> T getValue(numW numwObj) {
        switch (numwObj.type){
            case Types.BYTE:
                return (T) Byte.valueOf(numwObj.byte_value);
            case Types.SHORT:
                return (T) Short.valueOf(numwObj.short_value);
            case Types.INT:
                return (T) Integer.valueOf(numwObj.int_value);
            case Types.LONG:
                return (T) Long.valueOf(numwObj.long_value);
            case Types.FLOAT:
                return (T) Float.valueOf(numwObj.float_value);
            case Types.DOUBLE:
                return (T) Double.valueOf(numwObj.double_value);
            case Types.BIGINTEGER:
            // BigInteger → Number子类，直接强转
                return (T) numwObj.BigInteger_value;
            case Types.BIGDECIMAL:
                return (T) numwObj.BigDecimal_value;
            default:
                throw new RuntimeException();
        }
    }
}