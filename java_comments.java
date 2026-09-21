// Comments are annotations in the code that explain what the code is doing.
// Code is for computers, while comments are for humans who read and work with the code
// A single-line comment start with two forward slashes and continues until it reaches the end of the line

class Demo {
    public static void main(String[] args) {
        // Storing the age of the user
        int age = 23;   // this is just a demo value
        System.out.println(age)     # 23
    }
}

// You can also comment out lines of code in case they are work in progress or you dont want to delete it yet

class Demo {
    public static void main(String[] args) {
        int age = 23;
        //int height = 122;
        System.out.println(age);        // O/P is 23
        // System.out.println(height);
    }
}

// The commented lines of code will get ignored when you run the program
// If you need to comment out multiple lines or write a multi line comment you can use the /* */ symbols like this

class Demo {
    public static void main(String[] args) {
        /* This is just a
            demo program that
            outputs a number */
        int age = 23;
        System.out.println(age);     // O/P is 23
    }
}

# Anything between /* */ symbols becomes a comment