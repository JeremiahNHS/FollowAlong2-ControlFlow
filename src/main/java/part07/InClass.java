package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        rewatch 80:43–91:54 for logical operators and while loops
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we call our method here, then write a while loop together.
        System.out.println("Can drive? " + canDrive(80, false));
        System.out.println("Can drive? " + canDrive(80, true));
        System.out.println("Can drive? " + canDrive(20, false));

        int battery = 100;

        while (battery >= 20) {
            System.out.println("Driving... battery " + battery + "%");
            battery = battery - 25;
        } System.out.println("Stopped at " + battery + "%");




        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        boolean inRange = battery > 20 && battery < 100;
        boolean almostFull = battery > 20 || battery < 100;
        boolean ready = battery > 20;

    }

    // STEP 1 (continued) — we write the canDrive method here, outside main.
    static boolean canDrive(int battery, boolean docked) {
        return battery > 20 && !docked;
    }
}
