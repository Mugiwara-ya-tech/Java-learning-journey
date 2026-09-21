// The int type is used to store whole numbers (or integers as we call them in programming)

class Demo {
    public static void main(Stringp[] args) {
        int age = 42;
        System.out.println(age);   // O/P is 42
    }
}

// To work with decimal numbers use the type double

class Demo {
    public static void main(String[] args) {
        double weight = 12.5;
        System.out.println(weight);    // O/P is 12.5
    }
}

// Java has another type for decimal called float
// When using the float type you need to use an postfix after the value

class Demo {
    public static void main(String[] args) {
        float height = 1.94;
        System.out.println(height);     // O/P is 1.94
    }
}

// By default decimal values are of type double. Float is using less storage in the memory but is not as precise as the double type
// This mean that the calculation that uses floats are faster than the one that use double, however the result is less accurate in terms of the decimal digits.

// Note: Use float instead of double when memory usage is critical. If you need more precise computations for eg when dealing with currency use double

// The char type is used to hold a single character
// Its created similar to strings, however it uses single quote for the value

class Demo {
    public static void main(String[] args) {
        char letter = "B";
        System.out.println(letter);    // O/P is B
    }
}

// Another important type is boolean it can hold only the value true or false

class Demo {
    public static void main(String[] args) {
        boolean isOpen = false;
        System.out.println(isOpen);    // O/P is False
    }
}
