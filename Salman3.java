class Operators {
 
 public static void main(String[] args) {
  
  int a = 10;
  int b = 20;
  
  //Arithmetic Operators
  System.out.println("a + b = " + (a + b));
  System.out.println("a - b = " + (a - b));
  System.out.println("a * b = " + (a * b));
  System.out.println("a / b = " + (a / b));
  System.out.println("a % b = " + (a % b));
 
  //Assignment Operators
  a += 10; //a = a + 10
  b -= 10; //b = b - 10
  a *= 10; //a = a * 10
  b /= 10; //b = b / 10
  a %= 10; //a = a % 10
 
  //Increment/Decrement Operators
  a++; //a = a + 1
  b--; //b = b - 1
  
  //Relational Operators
  System.out.println("a == b = " + (a == b));
  System.out.println("a != b = " + (a != b));
  System.out.println("a > b = " + (a > b));
  System.out.println("a < b = " + (a < b));
  System.out.println("a >= b = " + (a >= b));
  System.out.println("a <= b = " + (a <= b));
  
  //Logical Operators
  System.out.println("(a == 1) && (b == 2) = " + ((a == 1) && (b == 2)));
  System.out.println("(a == 1) || (b == 2) = " + ((a == 1) || (b == 2)));
  System.out.println("!(a == b) = " + (!(a == b)));
  
  //Bitwise Operators
  System.out.println("a & b = " + (a & b));
  System.out.println("a | b = " + (a | b));
  System.out.println("a ^ b = " + (a ^ b));
  System.out.println("~a = " + (~a));
  System.out.println("a << 2 = " + (a << 2));
  System.out.println("a >> 2 = " + (a >> 2));
  System.out.println("a >>> 2 = " + (a >>> 2));
 }
}