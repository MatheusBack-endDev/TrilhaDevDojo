package com.matheus.pwrapper.test;

public class WrappersTest1 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 10l;
        float floatp = 10f;
        double doublep = 10.0;
        char charp = 'M';
        boolean booleanp = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F; //boxing
        Double doubleW = 10D;
        Character charW = 'M';
        Boolean booleanW = true;

        long l = longW; //unboxing
    }
}
