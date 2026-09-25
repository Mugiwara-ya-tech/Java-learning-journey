// Loop allow you to repear a block of code multiple times

// WHILE LOOPS
// A while loop statement repeatedly executes a target statement as long as a given condition is True
class Demo {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println(x);
      x = x - 1;
    }
  }
}      // O/P is 3,2,1

// The while loop checks for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats
// The line x=x-1; is important as without it the condition would never become false and the loop would run forever
// Each time loop runs, 1 is subtracted from x

// As its common to decrease or increase a variable by 1 during loops, java provides increment and decrement operators
// for eg x = x - 1 can be simplified to x--
// Similarly the increment operaor ++ is used to increase the value of a variable by one
class Demo {
  public static void main(String[] args) {
    int x = 1;
    while(x <= 10) {
      System.out.println(x);
      x++;
    }
  }
}        // O/P is 1,2,3,4,5,6,7,8,9,10

// Some loops require to increase or decrease the value of a variable by a different number
class Demo {
  public static void main(String[] args) {
    int x = 0;
    while (x <= 10) {
      System.out.println(x);
      x = x + 2;
    }
  }
}       // O/P is 0,2,4,6,8,10

// There is also a shorter way for x = x + 2 it can be written as x+=2
// We can perform calculation and other operation in loops
class Demo {
  public static void main(String[] args ) {
    int sum = 0;
    int num = 0;
    while( num < 100) {
      sum += num;
      num++;
    }
    System.out.println(sum);
  }
}        // O/P is 5050

// We add the value of num to sum each time the loop runs and then increase the num value by 1
