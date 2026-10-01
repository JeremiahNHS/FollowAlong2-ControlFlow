# Part 06 — if statements and switches

**We start this together in class · due before the next lecture · No AI**

In this part your programs start making **decisions**. Until now, every line ran, top to
bottom. Starting now, some lines run **only if** something is true.

This is also the **first part where the Challenge has a test**: Java checks your answers
for you, the same way you practiced in Part 00.

**What you learn:**

- `if`, `else if`, `else`: run some code only when a condition is true
- **comparison operators**: `>`, `<`, `>=`, `<=`, `==`, `!=`
- why `=` and `==` are different
- `switch`, `case`, `break`, `default`: compare one value against a list of matches

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
| **A · Follow along** | `IfStatements.java`, `Switches.java` | 25 | `part06 follow-along: if statements, switches` |
| **B · Comments** | the same two files | 25 | `part06 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part06 stretch: prediction, weather, seasons, battery` |
| **D · Challenge** | `Challenge.java` | 25 | `part06 challenge: canCharge, dayType` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part05/Stretch.java`. Look at your **Stretch B1** (the die roll) for **30 seconds**.
   It is in your **last repo, FollowAlong1-Basics**. Easiest way to see it: on GitHub, open your
   fork of FollowAlong1-Basics → `src/main/java/part05/Stretch.java`.
2. Close it.
3. Open `part06/Warmup.java`. **Without looking back**, type your Stretch B1 again. You have
   to type the `main` method **and** the `import` line yourself.
4. Run it with the **green ▶** next to `main`. You should get a number from 1 to 6.
5. If not, try to fix it yourself first. Look back at `part05/Stretch.java` only if you are
   really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 68:48](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 68:48 to about 80:18.** That is about 11 minutes of video, in **two
short videos** back to back. It will take you about 25 minutes, because you keep pausing
to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"I'm going to teach you guys all about if statements."*
> - **Stop** when he says *"that's all about switches."*

### Which file to type in

| When he… | Type in |
|---|---|
| teaches `if`, `else`, `else if` (68:48–74:54) | `IfStatements.java` |
| starts the switches video (75:25–80:18) | `Switches.java` |

### His screen looks different from yours

**His class is called `Main`. Yours are called `IfStatements` and `Switches`.** Leave the
`package part06;` line and the `public class ...` line alone. Type everything else, starting
with the `main` method.

**He changes `age` again and again** (18, then 12, then 75, then 13) and runs it each time.
Do the same: change the number, run it, check the output. At the end, your file only has
the latest number. That's fine.

**He rearranges his if statements** at about 72:06, so the "75 or older" check comes first.
Rearrange yours too. The guide, step 4, shows exactly what to move.

**He copies and pastes `case` blocks** in the switch video. **You type each one.** All seven
days. It is good practice, and it is how you'll remember `case`, `:` and `break;`.

**He deletes all the `break;` lines** to show you what happens. Try it, look at the output,
then **put them all back.**

**IntelliJ might color the word `switch` yellow** and suggest an "enhanced switch." That is
a newer way to write switches. **Ignore the suggestion.** Write it the way he does.

### Check your output as you go

**Check 1 (about 70:00): `age` is 18, one `if`.**

```
You are an adult!
```

**Check 2 (about 71:30): `age` is 12, with an `else`.**

```
You are not an adult!
```

**Check 3 (about 72:00): `age` is 75, but the "75 or older" check is second.** Notice it is
the **wrong** message:

```
You are an adult!
```

Java stops at the **first** true condition. 75 >= 18 is true, so it never reaches the
`>= 75` check.

**Check 4 (about 72:30): after he moves the 75 check to the top.**

```
OK boomer!
```

**Check 5 (about 73:40): `age` is 13, with the teenager check.**

```
You are a teenager!
```

**Check 6 (about 78:40): the switch, with `day` set to `"Friday"`.**

```
It is Friday
```

**Check 7 (about 79:00): all the `break`s removed, `day` set to `"Monday"`.** Every case
from Monday down runs:

```
It is Monday
It is Tuesday
It is Wednesday
It is Thursday
It is Friday
It is Saturday
```

**Now put the `break`s back.**

**Check 8 (about 80:00): `day` set to `"Pizza"`, with a `default`.**

```
Pizza is not a day
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `incompatible types: int cannot be converted to boolean` | You wrote `=` in a condition. To **ask** "is it equal?", use **two**: `==` |
| `'else' without 'if'` | Something is between the `if` block's `}` and the word `else`, or a `}` is missing. `else` must come right after the `if`'s closing `}` |
| Your `if` block runs even when the condition is false | You put a `;` right after the `)`. Like this: `if (age >= 18);` That `;` ends the `if`. Delete it |
| `: or -> expected` | A `case` line ends with `;`. It needs a colon: `case "Friday":` |
| `unclosed character literal` | You used single quotes `'Friday'`. Strings need double quotes: `"Friday"` |
| The switch prints more than one day | A `break;` is missing after one of the cases |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match the checks above, type this in the terminal:

```bash
git add -A
git commit -m "part06 follow-along: if statements, switches"
```

---

## In-class exercise — battery status and drive mode (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Write a method, then a switch

This time we write a small **method** together: a named block of code that takes a value
in and gives an answer back. (You fill in methods like this in Section D, too.)

1. **Under the `STEP 1 (continued)` comment, outside `main`,** write a method called
   `batteryStatus`. It takes a battery number and **returns** a word:
   - `100` or more → `"full"`
   - `20` or more → `"ok"`
   - anything less → `"low"`

   Use `if`, `else if` and `else`. The first line of the method is:

   ```java
   static String batteryStatus(int battery) {
   ```

2. **Inside `main`, under `STEP 1`,** print `batteryStatus(100)`, `batteryStatus(60)` and
   `batteryStatus(15)`.
3. Still in `main`, make a `String mode = "CRUISE";` and a `switch` on `mode`:
   `"CRUISE"` prints `Driving forward`, `"TURN"` prints `Turning`, and `default` prints
   `Stopped`. Don't forget `break;`.

Your output:

```
full
ok
low
Driving forward
```

Then try `mode = "TURN"` and `mode = "PARK"`. What prints each time?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `if (mode = "TURN") System.out.println("Turning");` | `incompatible types: String cannot be converted to boolean` |
| `else System.out.println("Stopped");` | `'else' without 'if'` |
| `if mode.equals("TURN") System.out.println("Turning");` | `'(' expected` |

**Hints:** one `=` **sets** a value; it does not compare. To compare two Strings, use
`.equals(...)`. An `else` has to come right after an `if`. And the condition of an `if`
always goes inside `( )`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part06 in-class: battery status and drive mode"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** follow-along files (`IfStatements.java` and
`Switches.java`), put a `//` comment **above every line of code**, saying **in your own
words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class`,
  `public static void main(...)`, every variable, every `if`, `else if`, `else`, `switch`,
  `case`, `break`, `default`, and every `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **when it runs.** Do not just
repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// if age is 75` | `// checks if age is exactly 75. == asks a question, it doesn't change age` |
| `// else` | `// runs only when none of the checks above were true` |
| `// break` | `// jumps out of the switch so the cases below don't run too` |
| `// default` | `// runs when day didn't match any case, like "Pizza"` |

Here is what a commented line looks like in your file:

```java
        // only runs if age is 18 or more AND the 75 check above was false
        } else if (age >= 18) {
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
git commit -m "part06 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int score = 85;
if (score >= 70) {
    System.out.println("C or better");
} else if (score >= 80) {
    System.out.println("B or better");
} else {
    System.out.println("Below C");
}

int level = 2;
switch (level) {
    case 1:
        System.out.println("Easy");
    case 2:
        System.out.println("Medium");
    case 3:
        System.out.println("Hard");
        break;
    default:
        System.out.println("Unknown");
}
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
C or better
Medium
Hard
```

- The score is 85, so you might expect "B or better." But Java checks **in order** and
  stops at the **first** true condition. 85 >= 70 is true, so it never checks `>= 80`.
- `level` is 2, so the switch starts at `case 2`. There is **no `break`** after it, so it
  **falls through** and also runs `case 3`. The `break` after "Hard" finally stops it.
- `case 1` and `default` never run.

</details>

### Stretch B — weather, seasons, and a battery

Put this code under your Stretch A code, in the same `main`.

**B1.** Make an `int` called `temperature` and set it to `72`. Use `if`, `else if`, `else`
to print:

- `Shorts weather` if it is 80 or more
- `Hoodie weather` if it is 60 or more
- `Coat weather` otherwise

With 72, it prints:

```
Hoodie weather
```

Try 85 and 40 too. The next part's warm-up is this one, from memory, so keep it short.

**B2.** Make an `int` called `month` (1 to 12). Use a **switch** to print the season:

| Months | Print |
|---|---|
| 12, 1, 2 | `Winter` |
| 3, 4, 5 | `Spring` |
| 6, 7, 8 | `Summer` |
| 9, 10, 11 | `Fall` |
| anything else | `That is not a month` |

**Hint:** you can stack cases with no code between them, and they **fall through** to the
same code. This time falling through is exactly what you want:

```java
    case 3:
    case 4:
    case 5:
        System.out.println("Spring");
        break;
```

With `month` set to `4`, it prints `Spring`. Try `12`, `7`, and `13`.

**B3.** Use a `Scanner` to ask for a battery percent. Then print:

- `Low battery. Go charge!` if it is under 20
- `Battery OK` if it is under 80
- `Fully charged` otherwise

```
Battery percent: 15
Low battery. Go charge!
```

Run it three times: try `15`, `50`, and `95`. (You need the `import` line for `Scanner`.)

### ✅ Commit Section C

```bash
git add -A
git commit -m "part06 stretch: prediction, weather, seasons, battery"
```

---

## Section D — Challenge (25 points)

*On your own.*

This part's challenge is **two small problems** in `Challenge.java`. This time, **a test
checks your answers.** You practiced this on [Part 00, step 6](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-6--your-first-test-red-then-green):
red means wrong, green means right.

### How to read a problem

Open `Challenge.java`. Each problem looks like this:

```java
    public static boolean canCharge(int battery, boolean docked) {
        return false;   // YOUR CODE — use an if statement
    }
```

You have not learned how to write these yet. (That's part 13.) For now, here is all you need
to know:

1. **The top line is given to you. Don't change it.** It says the problem's name
   (`canCharge`) and what it gives back (`boolean`: true or false).
2. **The inputs are already in the variables inside the `( )`.** Here, `battery` and
   `docked` already have values in them. The test fills them in. You don't use a Scanner.
3. **Your answer goes after the word `return`.** `return` means "this is my answer."
   Right now it always answers `false`. That's why the test is red.
4. **Replace only the line marked `YOUR CODE`.** You may use more than one line. For
   example, an `if` with a `return` inside each block:

```java
        if (battery > 50) {
            return true;
        } else {
            return false;
        }
```

*(That is **not** the answer. It is just to show the shape.)*

The comments above each problem in `Challenge.java` explain the rules and give examples.
**Read them carefully.**

### Problem 1 — `canCharge`

A robot should start charging when it is **docked** AND its battery is **below 100**.
Return `true` if it should charge, `false` if not.

| Call | Answer | Why |
|---|---|---|
| `canCharge(50, true)` | `true` | docked, battery not full |
| `canCharge(100, true)` | `false` | already full |
| `canCharge(20, false)` | `false` | not docked |
| `canCharge(0, true)` | `true` | docked, empty |

**Use an `if` statement.** You will need to check **two** things. Hint: you can put one
`if` inside another, **or** you can look ahead to Part 07 and use `&&` ("and").

### Problem 2 — `dayType`

Days are numbered 1 to 7. Return `"weekday"` for 1–5, `"weekend"` for 6 and 7, and
`"invalid"` for any other number.

| Call | Answer |
|---|---|
| `dayType(1)` | `"weekday"` |
| `dayType(5)` | `"weekday"` |
| `dayType(6)` | `"weekend"` |
| `dayType(7)` | `"weekend"` |
| `dayType(0)` | `"invalid"` |
| `dayType(9)` | `"invalid"` |

**Use a switch.** Stack the cases like in Stretch B2. Inside a switch in a problem like
this, you can `return` straight from a case. `return` leaves right away, so you don't need
a `break` after it.

### How to run the test

1. Open `Challenge.java`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to the test file,
   `ChallengeTest.java`. (It lives in `src` → `test` → `java` → `part06`.)
3. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
4. Look at the results. Before you change anything, **every test is red**. That's normal.
   - **Red ✗**: click it. You will see a message like this:

     ```
     canCharge(50, true) ==> expected: <true> but was: <false>
     ```

     That means: the test called `canCharge(50, true)`. The right answer is `true`. Your
     code gave back `false`.
   - **Green ✔**: that test passed.
5. Fix your code in `Challenge.java`, then run the test again. Repeat until **every test
   is green**, and the Run window says **Tests passed: 8**.

> **Never change `ChallengeTest.java`.** Only change `Challenge.java`. I can see if a test
> file was changed.

### ✅ Commit Section D

When all 8 tests are green:

```bash
git add -A
git commit -m "part06 challenge: canCharge, dayType"
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
a1b2c3d part06 challenge: canCharge, dayType
e4f5a6b part06 stretch: prediction, weather, seasons, battery
c7d8e9f part06 comments: explained every line of the follow-along code
9d8c7b6 part06 in-class: battery status and drive mode
0a1b2c3 part06 follow-along: if statements, switches
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part06 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part06 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong2-ControlFlow`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I
cannot see them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (the weather program) from memory.

**Finished early? Start Part 07.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 5 — Conditionals and Logic](https://books.trinket.io/thinkjava2/chapter5.html).
  Read the parts about relational operators and conditional statements.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
