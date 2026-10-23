// public class clasical {
//     public static void main(String[] args) {
//         // Variable 
//         // int age;
//         // age = 21;
//         // System.out.println(age);

//         // float height = 5.9f;
//         // System.out.println(height);

//         char grade = 'A';
//         System.out.println(grade + 2);
//     }
// }

// ASCII code in Java

// import java.nio.charset.StandardCharsets;

// public class clasical {
//     public static void main(String[] args) {
//         String text = "Hello";
//         byte[] asciiBytes = text.getBytes(StandardCharsets.US_ASCII);
        
//         // Printing the numerical byte array
//         for (byte b : asciiBytes) {
//             System.out.print(b + " "); 
//         }
//         // Output: 72 101 108 108 111
//     }
// }


// Type Casting in Java

public class clasical{
    public static void main(String[] args) {
        // byte b = 65; 
        // int i = b;
        // System.out.println(i); // Output: 65

        // long l = 100000L;
        // int j = (int) l;
        // System.out.println(j); // Output: 100000

        // int value = 99;
        // char character = (char) value;
        // System.out.println(character); // Output: c

        // double num = 10.26555554844548456;
        // int d = (int) num; // Explicit casting (double to int)
        // System.out.println(d); // Output: 10

        // int number = 100;
        // number += 50; // Shorthand operator for addition
        // System.out.println(number); // Output: 150
        // number -= 30; // Shorthand operator for subtraction
        // System.out.println(number); // Output: 120
        // number *= 2; // Shorthand operator for multiplication
        // System.out.println(number); // Output: 240
        // number /= 3; // Shorthand operator for division
        // System.out.println(number); // Output: 80

        // int number = 10;
        // number++;
        // System.out.println(number); // Output: 11
        // ++number;
        // System.out.println(number); // Output: 12
        // int result = number++ + ++number; // Post-increment and pre-increment
        // System.out.println(result); // Output: 25
        // int result2 = ++number + number++; // Post-decrement and pre-decrement
        // System.out.println(result2); // Output: 1
        // int finalValue = number; // Final value of number after the operations
        // System.out.println(finalValue); // Output: 12

        // int a = 5;
        // int a1 = a++;
        // int a2 = ++a;
        // System.out.println(a1); // Output: 5
        // System.out.println(a2); // Output: 7
        // System.out.println(a);  // Output: 7

        // Ternary Operator in Java

        // int a = 10;
        // int b = 20;
        // System.out.println(a > b ? "a is greater" : "b is greater");
        // System.out.println((a < b) ? (a + b) : (a - b));

        boolean flag = false;
        String result = flag ? "false" : "true";
        System.out.println(result);

    }
}