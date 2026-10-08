package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
// this line defines the name of the class
public class Switches {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the variable day of type String with value "Pizza"
        String day = "Pizza";
        // checks the value of day to see which case it matches
        switch (day) {
            // checks if day is equal to Sunday, if equal it executes the code inside
            case "Sunday":
                // Prints out text
                System.out.println("It is Sunday");
                //if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Monday, if equal it executes the code inside
            case "Monday":
                // prints out text
                System.out.println("It is Monday");
                // if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Tuesday, if equal it executes the code inside
            case "Tuesday":
                // prints out text
                System.out.println("It is Tuesday");
                // if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Wednesday, if equal it executes the code inside
            case "Wednesday":
                // prints out text
                System.out.println("It is Wednesday");
                // if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Thursday, if equal it executes the code inside
            case "Thursday":
                // prints out text
                System.out.println("It is Thursday");
                // if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Friday, if equal it executes the code inside
            case "Friday":
                // prints out text
                System.out.println("It is Friday");
                // if true, ends the switch so the other cases don't execute
                break;
            // checks if day is equal to Saturday, if equal it executes the code inside
            case "Saturday":
                // prints out text
                System.out.println("It is Saturday");
                // if true, ends the switch so the other cases don't execute
                break;
            // if day doesn't match any of the cases this code is executed
            default:
                // prints out text
                System.out.println(day + " is not a day");

        }
    }

}
