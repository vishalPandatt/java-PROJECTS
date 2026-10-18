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
        byte b = 65; 
        int i = b;
        System.out.println(i); // Output: 65

        long l = 100000L;
        int j = (int) l;
        System.out.println(j); // Output: 100000
    }
}