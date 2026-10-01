# Part 07 Guide — Logical operators and while loops

**The video, written out step by step.**

This page teaches the same thing as the video from **80:43 to 91:54**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 82:11)**, if you want to see him do it.

This part uses **two** files:

| File | Steps |
|---|---|
| `LogicalOperators.java` | Steps 1–6: `&&`, `\|\|`, `!` |
| `WhileLoops.java` | Steps 7–11: `while` and `do`-`while` |

---

## Part A — Logical operators (`LogicalOperators.java`)

In Part 06, each `if` checked **one** condition. **Logical operators** let you connect two
or more conditions into one.

| Operator | Name | True when… |
|---|---|---|
| `&&` | **and** | **both** sides are true |
| `\|\|` | **or** | **at least one** side is true |
| `!` | **not** | it flips true to false, and false to true |

`&&` is two ampersands (Shift + 7). `||` is two "pipe" characters. The pipe key is above
the Enter key, on the same key as the backslash `\`. Hold Shift.

### Step 1 — A temperature (video 81:35)

Open `LogicalOperators.java`. Type the `main` method. Inside it:

```java
        int temp = 25;
```

He means 25 degrees **Celsius** (about 77°F).

### Step 2 — `&&`: both must be true (video 82:11)

```java
        if (temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }
```

`temp >= 20 && temp <= 30` means "temp is at least 20 **and** temp is at most 30." In other
words: is temp **between 20 and 30**? **Both** halves must be true.

**Run it.** `temp` is 25, which is between 20 and 30. Output:

```
It is warm outside!
```

Try `35` (output: `It is hot outside!`) and `15` (output: `It is cold outside!`). With 15,
the first half (`15 >= 20`) is false, so the whole `&&` is false, even though the second
half (`15 <= 30`) is true.

### Step 3 — A common mistake

In math class you might write "20 ≤ temp ≤ 30." In Java you **must** write `temp` on both
sides of the `&&`. If you write this:

```java
        } else if (temp >= 20 && <= 30) {
```

you get this error:

```
error: illegal start of expression
```

Java doesn't know what `<= 30` is comparing. Write it out: `temp >= 20 && temp <= 30`.

### Step 4 — `||`: at least one must be true (video 83:40)

Now a little game. Like old computer games, the player types `q` to quit. Lowercase **or**
uppercase should both work.

Under your temperature code, still inside `main`, type:

```java
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();
```

`Scanner` turns red. Click on it, press `⌥ Enter` (Mac) or `Alt Enter` (Windows), and choose
**Import class**. IntelliJ adds `import java.util.Scanner;` between the `package` line and
the class. Or type that line there yourself.

`scanner.next()` reads the next **word** the user types (video 84:38).

Now the check (video 84:56):

```java
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
```

**To compare two Strings, use `.equals( )`, not `==`.** `response.equals("q")` asks "is the
text in `response` the same as `q`?"

`||` means "or": if the player typed `q` **or** `Q`, they quit.

**Run it.** The temperature line prints first. Then click inside the Run window, type
`no`, and press Enter:

```
It is warm outside!
You are playing a game! Press q or Q to quit
no
You are still playing the game *pew pew*
```

Run it again and type `q`. Then again with `Q`. Both times:

```
You quit the game
```

**Why not `==` for Strings?** Try changing it to `response == "q"`. There is no error. But
when you type `q`, it says `You are still playing the game *pew pew*` anyway. `==` checks
if two Strings are the same **object in memory**, not if they have the same letters.
**Always use `.equals` for Strings.** Change it back.

### Step 5 — `!`: not (video 86:11)

`!` flips true and false. `!response.equals("q")` means "response is **not** q."

He rewrites the same check using `!`. Change your `if` to:

```java
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
```

Read it out loud: "If the response is **not** `q` **and** the response is **not** `Q`, you
are still playing. Otherwise, you quit."

Notice **two** changes from Step 4:

1. The `||` became `&&`.
2. The two messages **swapped places**.

**Run it.** It works exactly like before: `no` keeps playing, `q` or `Q` quits.

### Step 6 — Missing a parenthesis

With `!` and `.equals( )` there are a lot of parentheses. If you are missing the last `)`
before the `{`:

```java
        if (!response.equals("q") && !response.equals("Q") {
```

you get:

```
error: ')' expected
```

Count them: every `(` needs a `)`. Click right after a `(` and IntelliJ highlights its
partner.

---

## Part B — while loops (`WhileLoops.java`)

A **while loop** is like an `if` statement that **keeps going**. It runs its block of code
**again and again, as long as** its condition is true.

This program asks for your name. If you just press Enter without typing anything, it
**asks again**, and keeps asking until you type something.

### Step 7 — A Scanner and an empty name (video 89:11)

Open `WhileLoops.java`. Type the `main` method. Inside it:

```java
        Scanner scanner = new Scanner(System.in);
        String name = "";
```

Import `Scanner` the same way as in Step 4.

`""` is an **empty String**: text with nothing in it.

### Step 8 — The while loop (video 89:29)

```java
        while (name.isBlank()) {

        }
```

- `while` looks like `if`: a condition in `( )`, then a block in `{ }`.
- `name.isBlank()` is **true** when `name` is empty (or only spaces). Right now `name` is
  `""`, so it is true, and the loop will run.

### Step 9 — Ask inside the loop (video 90:09)

Inside the loop's `{ }`:

```java
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
```

He uses `print`, not `println`, so the user types on the **same** line as the question.

**This second line is what lets the loop end.** Each time around, it puts what the user
typed into `name`. Once `name` is not blank, the condition is false and the loop stops.

### Step 10 — After the loop

**After** the loop's closing `}`:

```java
        System.out.println("Hello " + name);
```

**Run it.** Click in the Run window. Press Enter **without typing anything**, a few times.
It keeps asking. Then type a name and press Enter:

```
Enter your name: 
Enter your name: 
Enter your name: Bro
Hello Bro
```

### A loop that never stops

If you forget `name = scanner.nextLine();` inside the loop, `name` stays blank forever.
The condition is always true. The loop **never** stops, and your Run window fills up with
`Enter your name: Enter your name: Enter your name: ...`

**To stop a program that won't stop:** click the **red square ■ (Stop)** at the top of the
Run window. Then fix your code.

### Step 11 — The do-while loop (video 91:02)

There is a variation called the **do-while loop**. He changes his `while` loop into one.
Change yours like this:

```java
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
```

What moved:

1. The word **`do`** goes where `while (...)` used to be.
2. The **`while (name.isBlank())`** moves to the **end**, after the `}`.
3. It ends with a **semicolon `;`**. Without it, you get `error: ';' expected`.

**The difference:** a `while` loop checks the condition **first**. If it is false at the
start, the code inside never runs. A `do`-`while` loop runs the code **first**, then
checks. So it **always runs at least once**.

**Run it.** It works the same way as before.

---

## Your finished programs

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>LogicalOperators.java</code></summary>

```java
package part07;

import java.util.Scanner;

// (the comments at the top of your file)

public class LogicalOperators {
    public static void main(String[] args) {
        int temp = 25;
        if (temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
    }
}
```

</details>

<details>
<summary>Click to compare <code>WhileLoops.java</code></summary>

```java
package part07;

import java.util.Scanner;

// (the comments at the top of your file)

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
