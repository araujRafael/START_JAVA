package variables;

public class Types {
  public static void main(String[] args){
    // Tipos de variáveis
    // byte = -128 ~ 127
    byte varByte = 127;
    System.out.println("varByte: "+varByte);
    // short = -32768 ~ 32767
    short varShort = -32768;
    System.out.println("varShort: "+varShort);
    // int = -2147483648 ~ 2147483647
    int varInt = 2147483647;
    System.out.println("varInt: "+varInt);
    // long = -9.223.372.036.854.775.808L ~ 9.223.372.036.854.775.807L  
    long varLong = 9223372036854775807L;
    System.out.println("varLong: "+varLong);
    // float = 2.1234567 até 7 casas decimais
    float varFloat = 2.1234567f;
    System.out.println("varFloat: "+varFloat);
    // float = 2.123456789... até 15 casas decimais
    double varDouble = 2.1234567f;
    System.out.println("varDouble: "+varDouble);
    // boolean = True || false
    boolean varBool = true;
    System.out.println("varBool: "+varBool);
  } 
}
