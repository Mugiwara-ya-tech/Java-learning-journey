// Conditional statement are used to perform different actions based on different conditions
// The if statement is one of the most frequently used conditoinal statements
// If the if statements condition is true, the block of code inside the if statement is executed

/* Syntax is 
    if (condition) {
        // Some Code
    }
*/

// Any of the following comparison operators may be used to form the condition

/*
<  Less than
> Greater than
!= Not equal to
== Equal to
<= Less than or equal to
>= Greater than or equal to
*/

class Demo {
    public static void main(String[] args) {
        int age = 24;
        if (age >= 18) {
            System.out.println("Welcome");
        }
    }
}    // O/P is Welcome

// Remember that you need to use two equal signs(==) to test for equality, since a single equal sign is the assignment operator

class Demo {
    public static void main(String[] args) {
        itn number = 8;
        if (number == 8) {
            System.out.print;n("Bingo");
        }
    }
}           // O/P is Bingo

// An if statement can be followed by an optional else statement which executes when the condition evaluates to false
class Demo {
    public static void main(String[] args) {
        int age = 30;
        if(age < 16) {
            System.out.println("Too Young");
        }
        else {
            System.out.println("welcome");
        }
    }
}           // O/P is Welcome

// You can use one if-else statement inside another if or else statement

class Demo {
    public static void main(String[] args) {
        int age = 25;
        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");
            }
            else {
                System.out.println("Too Young");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}               // O/P is Welcome!

// You can use nest as many if-else statements as you want, however the code will become harder to read and understand
// Instead of using nested if else statement you can use the else if statement to check multiple conditions

class Demo {
    public static void main(String[] args) {
        int age = 25;
        if (age <= 0) {
            System.out.println("Error");
        }
        else if (age <= 16) {
            System.out.println("Too Young");
        }
        else if (age < 100) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Really?");
        }
    }
}           // O/P is Welcome

// You can include as many else if statement as you need