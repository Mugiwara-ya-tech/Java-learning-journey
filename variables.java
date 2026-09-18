# A variables lets you store a value by assigning it to a name. The name can be used to refer to the value later in the program
# Every variable has a type which defines the type of the value it holds. A variable can holds a text value, a number, a decimal etc

"This is some text"
# Text in quote is called a string

String name;
# This creates a variable called name or type string
# Now our variable name can hold string values

# In programming terms the process of creating a variable is called declaration

# After declaring our variable we can assign it a value using the assignment operator "="
String name;
name = "James";

# Now name hold the value "James"

# Note: The type String should start with a capital letter S. A lowercase version will cause an error

class Demo{
    public static void main(String[] args) {
        String name;
        name = "James"
        System.out.println(name);    # O/P is James
    }
}

# We can combine the declaration and assignment into one statement
class Demo{
    public static void main(String[] args) {
        String name = "James";
        System.out.println(name);    # O/P is James
    }
}

# A variable can change its value during the program multiple times
class Demo{
    public static void main(String[] args) {
        String name = "James";
        name = "David";
        System.out.println(name)   # O/P is David
    }
}