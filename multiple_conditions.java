// In some cases we need to combine mutiple conditions for eg lets say we want to check if the age value is greater than 18 and less than 50
// This can be done using the && operator
class Demo {
  public static void main(String[] args) {
    int age = 42;
    if (age > 18 && age < 50) {
      System.out.println("Welcome");
    }
  }
}      // O/P is Welcome

// The && operator is also referred to as the logical AND operator
// The OR operator (||) checks if any one of the conditino is true
class Demo {
  public static void main(String[] args) {
    int age = 25;
    int height = 100;
    if (age > 18 || height > 150) {
      System.out.println("Welcome!");
    }
  }
}        // O/P is Welcome

// The NOT(!) logical operator is used to reverse the conditions
// If a condition is true the NOT logical operator will make it false and vice versa
class Demo {
  public static void main(String[] args) {
    int age = 25;
    if (!(age > 18)) {
      System.out.println("Too Young");
    }
    else {
      System.out.println("Welcome");
    }
  }
}        // O/P is Welcome

// if !(age > 18) read as " if age is NOT greater than 18"
// You can chain multiple conditions using parenthesis and the logical operator
class Demo {
  public static void main(String[] args) {
    String country = "US";
    int age = 42;
    if {(country == "US" || country == "GB") && (age > 0 && age < 100)) {
      System.out.println("Allowed");
    }
  }
}
