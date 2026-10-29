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

// import java.util.Scanner;
// import java.math.BigInteger;
// public class clasical{
//     public static void main(String[] args) {
//         byte b = 65; 
//         int i = b;
//         System.out.println(i); // Output: 65

//         long l = 100000L;
//         int j = (int) l;
//         System.out.println(j); // Output: 100000

//         int value = 99;
//         char character = (char) value;
//         System.out.println(character); // Output: c

//         double num = 10.26555554844548456;
//         int d = (int) num; // Explicit casting (double to int)
//         System.out.println(d); // Output: 10

//         int number = 100;
//         number += 50; // Shorthand operator for addition
//         System.out.println(number); // Output: 150
//         number -= 30; // Shorthand operator for subtraction
//         System.out.println(number); // Output: 120
//         number *= 2; // Shorthand operator for multiplication
//         System.out.println(number); // Output: 240
//         number /= 3; // Shorthand operator for division
//         System.out.println(number); // Output: 80

//         int number = 10;
//         number++;
//         System.out.println(number); // Output: 11
//         ++number;
//         System.out.println(number); // Output: 12
//         int result = number++ + ++number; // Post-increment and pre-increment
//         System.out.println(result); // Output: 25
//         int result2 = ++number + number++; // Post-decrement and pre-decrement
//         System.out.println(result2); // Output: 1
//         int finalValue = number; // Final value of number after the operations
//         System.out.println(finalValue); // Output: 12

//         int a = 5;
//         int a1 = a++;
//         int a2 = ++a;
//         System.out.println(a1); // Output: 5
//         System.out.println(a2); // Output: 7
//         System.out.println(a);  // Output: 7

//         Ternary Operator in Java

//         int a = 10;
//         int b = 20;
//         System.out.println(a > b ? "a is greater" : "b is greater");
//         System.out.println((a < b) ? (a + b) : (a - b));

//         boolean flag = false;
//         String result = flag ? "false" : "true";
//         System.out.println(result);

//         Scanner Class in Java   {taking input from user}

//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int Age = Sc.nextInt();
//         System.out.println("Age: " + Age);

//         BigInteger bigInt = Sc.nextBigInteger();
//         System.out.println("BigInteger: " + bigInt);
//         Boolean boolValue = Sc.nextBoolean();
//         System.out.println("Boolean: " + boolValue);
//         Short shortValue = Sc.nextShort();
//         System.out.println("Short: " + shortValue);

//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = Sc.next();
//         System.out.println("Name: " + name);

//         conditonals logic in java
//         int a = 10;
//         int b = 20;
//         if(a==b){
//             System.out.println("A b same");
//         }else{
//         System.out.println("a & b not same"); 
//         };

//         String result = (a==b) ? "ab same" : "ab not same";
//         System.out.println(result);

//         boolean hasSubs = false;
//         int basicSubs = 1099;
//         if(hasSubs){
//             if(basicSubs >= 999){
//                 System.out.print("Premiem");;
//             }else{
//                 System.out.print("Basic User!");
//             }
//         }else{
//             System.out.print("Please take subscription first!");
//         }


//     }
// }
import java.util.Random;
import java.util.Scanner;
public class clasical{
    public static void main(String[] args){ 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int userInput = sc.nextInt();

        // System.out.println("Random Number: " + userInput);
        // switch(userInput % 2) {
        //     case 0:
        //         System.out.println("The number is even.");
        //         break;
        //     case 1:
        //         System.out.println("The number is odd.");
        //         break;
        //     default:
        //         System.out.println("Unexpected value: " + userInput);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int userInput = sc.nextInt();

        switch(userInput){
            
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}