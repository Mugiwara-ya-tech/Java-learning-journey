// Consider a program that takes a day number as input and outputs the corresponding weekday
class Demo {
    public static void main(String[] args) {
        int day = 2;
        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
    }
}           // O/P is Tuesday

// Instead of many if else statement, which become hard to read, we can use a switch statement
// A switch statement test a variable for equality against a list of values.

class Demo {
    public static void main(String[] args) {
        int day == 2;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }
}               // O/P is Tuesday

// When the variable being switched on is equal to a case, the statements following that case will execute until a break statement.
// Its important to have a break statement for each case
// If no break appears, the program will continue to execute the next case in the switch even if the value doesn't match the variable that is switched on

class Demo {
    public static void main(String[] args) {
        int day == 2;
        switch(day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wedensday");
        }
    }
}           // O/P is Tuesday, Wednesday

// A switch statement can have an optional default case
// The default case can be used for performing a task when none of the case is matched

class Demo {
    public static void main(String[] args) {
        int day = 5;
        switch(day) {
            case 1:
                System.out.pritnln("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Another day");
        }
    }
}               // O/P is Another day

// No break is needed in the default case as its always the last statement in the switch.