# You can use common math operators to perform calculations

class Demo {
    public static void main(String[] args){
        int x = 6;
        int y = 3;
        System.out.println(x+y);
    }
}     # O/P is 9

# The result can be assigned to another variable

class Demo {
    public static void main(String[] args) {
        double price1 = 24.99;
        double price2 = 19.45;
        double sum = price1 + price2;
        System.out.println(sum);    # O/P is 44.44
    }
}

# Simillarly you can use - for subtraction

class Demo {
    public static void main(String[] args) {
        int salary = 90000;
        int tax = 15000;
        int result = salary - tax;
        System.out.println(result);    # O/P is 75000
    }
}

# The * operator multiplies two values

class Demo {
    public static void main(String[] args) {
        int pricec = 1200;
        System.out.println(price * 0.2);     # O/P is 240
    }
}

# The / operator divides one value by another

class Demo {
    public static void main(String[] args) {
        int amount = 9000;
        int price = 49;
        int result = amount/price;
        System.out.println(result);     # O/P is 183
    }
}

# You can use the double to get the result of the division with a decimal point

class Demo {
    public static void main(String[] args) {
        double amount = 9000;
        double price = 49;
        double result = amount/price;
        System.out.println(result);   # O/P is 183.6734
    }
}

# The modulo % (or remainder) math operation returns the remainders of a division

class Demo {
    public static void main(String[] args) {
        int items = 23;
        int res = item % 5;
        System.out.println(res);   # O/P is 3
    }
}

# Java allow to add together strings, using the + operator. The result is the combination of the strings

class Demo {
    public static void main(String[] args) {
        String firstname = "James";
        String lastname = "Smith";
        String fullname = firstname + lastname;
        System.out.println(fullname);     # O/P is JamesSmith
    }
}

# Note that the result will combine the given string without any separator we can add a space ' ' between them

#        String fullname = firstname + " " + lastname;

# The process of adding string together is called concatenation. You can also concatenate strings with other type such as integers and doubles.