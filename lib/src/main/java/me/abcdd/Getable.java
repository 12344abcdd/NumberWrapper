package me.abcdd;

public interface Getable{
    public me.abcdd.types getType();
    public java.lang.String toString();
  public byte byteValue();
  public short shortValue();
  public int intValue();
  public long longValue();
  public float floatValue();
  public double doubleValue();
  public java.math.BigInteger BigIntegerValue();
  public java.math.BigDecimal BigDecimalValue();
  
  public static T Value()<T extands Number> {
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
}