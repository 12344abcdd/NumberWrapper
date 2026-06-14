package me.abcdd;

public enum Types {
BYTE,SHORT,INT,LONG,BIGINTEGER,FLOAT,DOUBLE,BIGDECIMAL;
    
    public static boolean isIntegerType(Types type){
        if (type==null){
            return false;
        }
        if(type.ordinal()<=4){
            return true;
        }
        return false;
    }
    
    public static boolean isInteger(numW numwObj){
        if (numwObj==null){
            return false;
        }
        return isIntegerType(numwObj.type);
    }
    
    public static boolean isDecimalType(Types type){
        if (type==null){
            return false;
        }
        if(type.ordinal()>=5){
            return true;
        }
        return false;
    }
    
    public static boolean isDecimal(numW numwObj){
        if (numwObj==null){
            return false;
        }
        return isDecimalType(numwObj.type);
    }
    
    public static Types cast(Types t1, Types t2) {
    // 任意一方是BigDecimal → BigDecimal
    if(t1==BIGDECIMAL || t2==BIGDECIMAL) return BIGDECIMAL;
    // 任意一方是Double → Double
    if(t1==DOUBLE || t2==DOUBLE) return DOUBLE;
    // 任意一方是Float → Float
    if(t1==FLOAT || t2==FLOAT) return FLOAT;
    // 任意一方BigInteger → BigInteger
    if(t1==BIGINTEGER || t2==BIGINTEGER) return BIGINTEGER;
    // 纯整数按ordinal升级
    return t1.ordinal()>=t2.ordinal()?t1:t2;
    }
}