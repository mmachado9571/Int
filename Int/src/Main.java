Import java.util.Scanner;
import java.util.Random;
Import java.util.Arraylist;
// Marcos Machado
// This program is about a scoring game.
// Less than or eqaul to 1000 is true, more than 1000 is false.

// Types of Data and Ranges:
// Byte: -128 to 127
// Short: -32,768 to 32,767
// Integer: -2^31 to 2^31 - 1
// Long: -2^63 to 2^63 - 1
// Float: Range is beyond the scope.
// Double: Range is beyond the scope.
// Boolean: True or False values.
// Character: 0 to 65,535
// String: Non-numerical values (special support type).

// Control+Shift+F automatically formats the code.

public class Main {

  public static void main(String[] args) {
    System.out.println("Check out this \"crazy\" project.");

    // 1
    boolean bool1 = true;
    int Score = 1;
    double Double1 = 1.0;
    String String1 = "1";
    System.out.println((double)Score);
    // Casting means that one file will change to another.
    // For example, int1 becomes a double.
    if (bool1 = true) {
      System.out.println(String1);
    if (bool1 = false) {
      System.out.println(Double1);
    }
   }
    // A variable is a value that can change depending on the conditions or the
    // information passed to the program.
    
    // Scope is the visibility of variables.
    final int score = 1000; 
    // The final keyword makes the variable a constant (it must be initialized)
    // Final int score = 1000 means that the score will not pass the num. 1000.
    
  }
}
