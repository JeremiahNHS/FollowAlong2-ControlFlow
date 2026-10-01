# Part 07 — Logical operators and while loops

**We start this together in class · due before the next lecture · No AI**

In this part you learn to check **more than one thing at once**, and to make your program **repeat**
something until it is done. By the end, your program can keep asking a question until the
user gives a real answer.

**What you learn:**

- `&&` (and), `||` (or), `!` (not): connecting conditions
- why Strings are compared with `.equals( )`, not `==`
- `while` loops: repeat code as long as something is true
- `do`-`while` loops: the same, but the code always runs at least once
- how to stop a program that never ends

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (follow along), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Follow along** | `LogicalOperators.java`, `WhileLoops.java` | 25 | `part07 follow-along: logical operators, while loops` |
| **B · Comments** | the same two files | 25 | `part07 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part07 stretch: prediction, countdown, password, number check` |
| **D · Challenge** | `Challenge.java` | 25 | `part07 challenge: canPlay, digitCount` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part06/Stretch.java`. Look at your **Stretch B1** (the weather program) for **30
   seconds**.
2. Close it.
3. Open `part07/Warmup.java`. **Without looking back**, type your Stretch B1 again. You have
   to type the `main` method yourself, too.
4. Run it with the **green ▶** next to `main`. With 72, does it print `Hoodie weather`?
5. If not, try to fix it yourself first. Look back at `part06/Stretch.java` only if you are
   really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 80:43](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 80:43 to about 91:54.** That is about 11 minutes of video, in **two
short videos** back to back. It will take you about 25 minutes, because you keep pausing
to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"we're going to discuss the three logical operators."*
> - **Stop** when he says *"that is the while loop."*

### Which file to type in

| When he… | Type in |
|---|---|
| teaches `&&`, `\|\|` and `!` (80:43–87:47) | `LogicalOperators.java` |
| starts the while loops video (88:22–91:54) | `WhileLoops.java` |

### His screen looks different from yours

**His class is called `Main`. Yours are called `LogicalOperators` and `WhileLoops`.** Leave
the `package part07;` line and the `public class ...` line alone. Type everything else,
starting with the `main` method.

**He types the `import` line by hand.** In IntelliJ, click on the red word `Scanner` and
press `⌥ Enter` (Mac) or `Alt Enter` (Windows), then choose **Import class**. Or type
`import java.util.Scanner;` yourself, **after** `package part07;` and **before**
`public class`.

**Typing input.** When the program waits for you, **click inside the Run window** at the
bottom, type, and press Enter.

**He changes his code in place** twice: from `||` to `!` with `&&` (about 86:11), and from
`while` to `do`-`while` (about 91:02). Do the same. Your file ends up with the **newest**
version. That's fine.

**If your program never stops,** click the **red square ■ (Stop)** at the top of the Run
window. A loop that never ends is called an **infinite loop**. Everyone makes one
eventually. It does not hurt your computer.

**He copies and pastes a line.** **You type it.** Every time.

### Check your output as you go

**Check 1 (about 83:30): the temperature check, with `temp` at 25.**

```
It is warm outside!
```

Change `temp` to `35`: `It is hot outside!` Change it to `15`: `It is cold outside!`
Then set it back to `25`.

**Check 2 (about 85:30): the quit game with `||`.** Run it and type `no`:

```
It is warm outside!
You are playing a game! Press q or Q to quit
no
You are still playing the game *pew pew*
```

Run it again and type `q`, and once more with `Q`. Both times the last line is:

```
You quit the game
```

**Check 3 (about 87:30): after he rewrites it with `!` and `&&`.** Same results as Check 2:
`no` keeps playing, `q` and `Q` quit.

**Check 4 (about 90:50): the while loop.** Press Enter **without typing** two times, then
type a name:

```
Enter your name: 
Enter your name: 
Enter your name: Bro
Hello Bro
```

**Check 5 (about 91:50): after he changes it to `do`-`while`.** Same as Check 4.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `illegal start of expression` on a line with `&&` or `\|\|` | You wrote `temp >= 20 && <= 30`. Java needs the variable on **both** sides: `temp >= 20 && temp <= 30` |
| `')' expected` | A `)` is missing. With `!` and `.equals( )` there are a lot of them. Count them |
| You type `q` but it says you are **still playing** | You used `==` to compare Strings. Use `response.equals("q")` |
| `cannot find symbol` … `symbol: class Scanner` | The `import` line is missing. Click the red `Scanner` and press `⌥ Enter` / `Alt Enter` |
| `';' expected` at the end of `} while (name.isBlank())` | A `do`-`while` loop ends with a semicolon: `} while (name.isBlank());` |
| The Run window fills up with the same line forever | An infinite loop. Click the red ■ **Stop**. Then check that the loop changes `name` (or whatever it checks) inside the `{ }` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match the checks above, type this in the terminal:

```bash
git add -A
git commit -m "part07 follow-along: logical operators, while loops"
```

---

## In-class exercise — can the rover drive? (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — A method with `&&` and `!`, then a while loop

1. **Under the `STEP 1 (continued)` comment, outside `main`,** write a method called
   `canDrive`. The rover can drive when its battery is **more than 20** **and** it is
   **not** docked. The first line is:

   ```java
   static boolean canDrive(int battery, boolean docked) {
   ```

   The whole answer fits on one line, after `return`, using `&&` and `!`.

2. **Inside `main`, under `STEP 1`,** print `canDrive(80, false)`, `canDrive(80, true)`
   and `canDrive(10, false)`, each with `"Can drive? "` in front.
3. Still in `main`, start with `int battery = 100;`. Use a **while loop**: as long as
   `battery` is **20 or more**, print the battery and then take away 25.
4. After the loop, print where it stopped.

Your output:

```
Can drive? true
Can drive? false
Can drive? false
Driving... battery 100%
Driving... battery 75%
Driving... battery 50%
Driving... battery 25%
Stopped at 0%
```

**Before you run it:** why does the loop print `25%` and then stop at `0%`? Say it out loud,
then check.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `boolean inRange = battery > 20 and battery < 100;` | `';' expected` |
| `boolean almostFull = battery > 20 \|\| < 100;` | `illegal start of type` |
| `boolean ready = battery && true;` | `bad operand types for binary operator '&&'` |

**Hints:** Java has no word `and`. It uses `&&`. Each side of `&&` or `||` has to be a
**complete** true/false question, so `< 100` alone is not enough: write `battery < 100`.
And `battery` is a number, not true or false, so `battery && true` makes no sense to Java.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part07 in-class: can the rover drive"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** follow-along files (`LogicalOperators.java` and
`WhileLoops.java`), put a `//` comment **above every line of code**, saying **in your own
words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `import`, `public class`,
  `public static void main(...)`, every variable, every `if`, `else if`, `else`, `while`,
  `do`, and every `System.out...` and `scanner...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **when it runs.** Do not just
repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// temp and temp` | `// true only if temp is 20 or more AND 30 or less, so between 20 and 30` |
| `// if not q` | `// true when the player typed something that is not q and not Q, so keep playing` |
| `// while blank` | `// keeps repeating the code below as long as name is still empty` |
| `// read name` | `// reads what the user typed and puts it in name, which lets the loop end` |

Here is what a commented line looks like in your file:

```java
        // .equals checks if the letters match. == would not work for Strings
        if (!response.equals("q") && !response.equals("Q")) {
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run each file again when you're done.** Comments must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part07 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int x = 7;
System.out.println(x > 5 && x < 10);
System.out.println(x > 5 && x > 10);
System.out.println(x < 5 || x == 7);
System.out.println(!(x == 7));
int count = 3;
while (count > 0) {
    System.out.println("count is " + count);
    count = count - 1;
}
System.out.println("done");
```

2. **Above that code**, write what you think it will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
true
false
true
false
count is 3
count is 2
count is 1
done
```

- You can print a condition directly. It prints `true` or `false`.
- `x > 5 && x > 10` is false: 7 is more than 5, but **not** more than 10. `&&` needs both.
- `x < 5 || x == 7` is true: the first half is false, but the second half is true. `||`
  needs only one.
- `!(x == 7)`: `x == 7` is true, and `!` flips it to false.
- The loop runs while `count > 0`: for 3, 2, and 1. When `count` becomes 0, the condition
  is false, the loop stops, and `done` prints.

</details>

### Stretch B — a countdown, a password, and a number check

Put this code under your Stretch A code, in the same `main`.

**B1.** Use a `while` loop to count down from 5 to 1, then print `Liftoff!`:

```
5
4
3
2
1
Liftoff!
```

The next part's warm-up is this one, from memory, so keep it short. (About 6 lines.)

**B2.** Use a `Scanner` and a `while` loop. Keep asking for a password **until** the user
types `java123`. Then print `Access granted`.

```
Password: hello
Password: letmein
Password: java123
Access granted
```

**Hint:** start with `String password = "";`. The loop should keep going while the password
is **not** equal to `"java123"`. That's a job for `!` and `.equals( )`.

**B3.** Keep asking the user to pick a number **until** it is from 1 to 10. Then print it.

```
Pick a number from 1 to 10: 0
Pick a number from 1 to 10: 12
Pick a number from 1 to 10: 7
You picked 7
```

**Hint:** start with `int number = 0;`. The loop should keep going while the number is
**too small OR too big**: `number < 1 || number > 10`. Use the same `Scanner` as B2, and
`scanner.nextInt()` to read a number.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part07 stretch: prediction, countdown, password, number check"
```

---

## Section D — Challenge (25 points)

*On your own.*

Two small problems in `Challenge.java`, checked by a test, just like in Part 06.

**Reminder of how these work:** the top line of each problem is given. The inputs are
already in the variables inside the `( )`. Replace only the line marked `YOUR CODE`. Your
answer goes after `return`. You may add more lines above the `return`. (Part 06's
[README, Section D](../part06/README.md#section-d--challenge-25-points) explains this in
more detail.)

### Problem 1 — `canPlay`

You can play video games if your **homework is done OR it is the weekend**, AND the hour
is **from 8 up to (but not including) 21**. Hours use a 24-hour clock: 8 is 8 AM, 20 is
8 PM, 21 is 9 PM.

| Call | Answer | Why |
|---|---|---|
| `canPlay(true, false, 10)` | `true` | homework done, 10 AM |
| `canPlay(false, true, 20)` | `true` | weekend, 8 PM |
| `canPlay(false, false, 15)` | `false` | homework not done, and not the weekend |
| `canPlay(true, true, 21)` | `false` | too late |
| `canPlay(true, false, 7)` | `false` | too early |

**Use `&&` and `||`.** Hint: put the "or" part in parentheses, like
`(homeworkDone || isWeekend)`, so Java checks it as one piece. You can write the whole answer
on one line after `return`, because a condition **is** a true/false value.

### Problem 2 — `digitCount`

Return how many digits `n` has. `n` is never negative. `0` has 1 digit.

| Call | Answer |
|---|---|
| `digitCount(7)` | `1` |
| `digitCount(42)` | `2` |
| `digitCount(999)` | `3` |
| `digitCount(12345)` | `5` |
| `digitCount(0)` | `1` |

**Use a `while` loop.** Hint: `n / 10` chops off the last digit, because whole-number
division drops the decimal. `12345 / 10` is `1234`. Keep chopping and count how many times,
until only one digit is left (`n` is less than 10).

### How to run the test

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows) to jump to
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
3. **Red ✗**: click it and read the message, like
   `digitCount(42) ==> expected: <2> but was: <0>`. **expected** is the right answer.
   **but was** is what your code gave.
4. Fix `Challenge.java` and run the test again, until the Run window says
   **Tests passed: 9**.

**A test that never finishes** means your `while` loop never stops. Click the red ■
**Stop**. Make sure `n` gets smaller inside the loop.

> **Never change `ChallengeTest.java`.** Only change `Challenge.java`. I can see if a test
> file was changed.

### ✅ Commit Section D

When all 9 tests are green:

```bash
git add -A
git commit -m "part07 challenge: canPlay, digitCount"
```

Not all green by the deadline? **Commit anyway.** No commit gets 0.

---

## Hand it in: push before the next lecture

### 1. Fill in your log

At the bottom of this page, fill in the three lines under **My log**.

### 2. Check your commits

In the terminal, type:

```bash
git log --oneline
```

Near the top of the list, you should see **your commits for this part**, newest first:

```
a1b2c3d part07 challenge: canPlay, digitCount
e4f5a6b part07 stretch: prediction, countdown, password, number check
c7d8e9f part07 comments: explained every line of the follow-along code
9d8c7b6 part07 in-class: can the rover drive
0a1b2c3 part07 follow-along: logical operators, while loops
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part07 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part07 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong2-ControlFlow`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I
cannot see them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (the countdown) from memory.

**Finished early? Start Part 08.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started:
Finished:
The line that took me the longest:
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 5 — Conditionals and Logic](https://books.trinket.io/thinkjava2/chapter5.html)
  for `&&`, `||` and `!`. [Chapter 6 — Loops and Strings](https://books.trinket.io/thinkjava2/chapter6.html)
  for the `while` loop.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
