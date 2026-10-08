package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        rewatch 68:48–80:18 for if statements and switches
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we call our method here, then write a switch together.
        System.out.println(batteryStatus(100));
        System.out.println(batteryStatus(60));
        System.out.println(batteryStatus(15));

        String mode = "PARK";
        switch (mode){
            case "CRUISE":
                System.out.println("Driving forward");
                break;
            case "TURN":
                System.out.println("Turning");
                break;
            default:
                System.out.println("Stopped");
        }




        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        if (mode.equals("TURN")) System.out.println("Turning");
        else System.out.println("Stopped");
        if (mode.equals("TURN")) System.out.println("Turning");

    }

    // STEP 1 (continued) — we write the batteryStatus method here, outside main.
    static String batteryStatus(int battery){
        if (battery >= 100) {
            return ("full");
        } else if (battery >= 20){
            return ("ok");
        } else {
            return ("low");
        }
    }
}
