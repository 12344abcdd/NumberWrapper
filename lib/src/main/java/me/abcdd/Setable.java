package me.abcdd;

public interface Setable{
    public void setType(me.abcdd.types type);
    public void setValue(byte byte_value);
    public void setValue(short short_value);
    public void setValue(int int_value);
    public void setValue(long long_value);
    public void setValue(float float_value);
    public void setValue(double double_value);
    public void setValue(java.math.BigInteger BigInteger_value);
    public void setValue(java.math.BigDecimal BigDecimal_value);
    public void setValue(Number numObj);
}