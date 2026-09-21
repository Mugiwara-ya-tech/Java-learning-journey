// Some program need user input
// To take input from the user, we first must import the corresponding class.

//        import java.util.Scanner;

// This line should be written at the very top of your code, before the class declaration
// This imports the scanner class, which we will use for taking input
// After importing the scanner class, we need to create a scanner object

//      Scanner sc = new Scanner(System.in);

import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name: "+name);       /* O/P is 
                                                    John
                                                    Name: John */
    } 
}

// Simillarly we can take a integer as input using nextInt()

import java.util.Scanner()
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age: "+age);        /* O/P is 
                                                    23
                                                    Age: 23 */
    }
}

// This will accept an integer input from the user and assign it to the age variable
// Note: There are simillar methods available to take other type as input: nextDouble(), nextFloat(), nextBoolean()

// We can use the same scanner to take multiple inputs

import java.util.scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name + ": "+ age)     /* O/P is 
                                                    John
                                                    23
                                                    John : 23 */
    }
}