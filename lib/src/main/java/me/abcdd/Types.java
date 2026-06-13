package me.abcdd;

public enum Types {
BYTE,SHORT,INT,LONG,BIGINTEGER,FLOAT,DOUBLE,BIGDECIMAL;
    
    public static Types cast(Types t1,Types t2){
    if (t1.ordinal()>=t2.ordinal()){
        return t1;
        }
    else {
        return t2;
        }
    }
}