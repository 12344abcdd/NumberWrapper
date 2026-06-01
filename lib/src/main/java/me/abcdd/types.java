package me.abcdd;

public enum types {
BYTE,SHORT,INT,LONG,BIGINTEGER,FLOAT,DOUBLE,BIGDECIMAL;
    public static types cast(types t1,types t2){
    if (t1.ordinal()>=t2.ordinal()){
        return t1;
        }
    else {
        return t2;
        }
    }
}