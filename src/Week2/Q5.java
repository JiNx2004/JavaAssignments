//Program to understand all datatypes
public class Q5 {
  public static void main(String[] args) {
    
    byte byteValue = 127;
    short shortValue = 32767;
    int intValue = 21474836;
    long longValue = 922337203;

  
    float floatValue = 3.14f;
    double doubleValue = 3.141592;

  
    char charValue = 'A';

   
    boolean booleanValue = true;

   
    String stringValue = "Hello world";

    
    System.out.println("Byte: " + byteValue);
    System.out.println("Short: " + shortValue);
    System.out.println("Int: " + intValue);
    System.out.println("Long: " + longValue);
    System.out.println("Float: " + floatValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("Char: " + charValue);
    System.out.println("Boolean: " + booleanValue);
    System.out.println("String: " + stringValue);

   
    int sum = intValue + shortValue;
    int difference = intValue - byteValue;
    int product = intValue * 10;
    int division = intValue / 5;
    int modulus = intValue % 3;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Division: " + division);
    System.out.println("Modulus: " + modulus);

  
    double result1 = floatValue * doubleValue;
    double result2 = doubleValue / floatValue;

    System.out.println("Result 1: " + result1);
    System.out.println("Result 2: " + result2);

    
    charValue = (char) (charValue + 1);
    System.out.println("Updated Char: " + charValue);

  
    boolean andResult = booleanValue && true;
    boolean orResult = booleanValue || false;
    boolean notResult = !booleanValue;

    System.out.println("AND Result: " + andResult);
    System.out.println("OR Result: " + orResult);
    System.out.println("NOT Result: " + notResult);
}
}
