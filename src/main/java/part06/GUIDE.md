# Part 06 Guide — if statements and switches

**The video, written out step by step.**

This page teaches the same thing as the video from **68:48 to 80:18**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 69:31)**, if you want to see him do it.

This part uses **two** files:

| File | Steps |
|---|---|
| `IfStatements.java` | Steps 1–6: `if`, `else`, `else if` |
| `Switches.java` | Steps 7–11: `switch`, `case`, `break`, `default` |

So far, every program ran **every** line, top to bottom. Now your program starts making
**decisions**: run this line only **if** something is true.

---

## Part A — if statements (`IfStatements.java`)

### Step 1 — A variable to decide about (video 69:21)

Open `IfStatements.java`. Type the `main` method inside the class. Inside `main`:

```java
        int age = 18;
```

### Step 2 — Your first if statement (video 69:31)

An `if` statement has three parts: the word `if`, a **condition** in `( )`, and a block of
code in `{ }`.

```java
        if (age >= 18) {
            System.out.println("You are an adult!");
        }
```

- `age >= 18` is the **condition**. It asks: "Is age greater than or equal to 18?" The
  answer is always **true** or **false**.
- If the answer is **true**, Java runs the code inside the `{ }`.
- If the answer is **false**, Java **skips** the code inside the `{ }`, as if it was not
  there.

**Run it.** `age` is 18, and 18 >= 18 is true. Output:

```
You are an adult!
```

**Notice:** there is **no `;`** after `if (age >= 18)`. The `{` comes right after the `)`.

### Step 3 — else: what to do when it's false (video 70:52)

Change `age` to `12`:

```java
        int age = 12;
```

**Run it.** Nothing prints. 12 >= 18 is false, so Java skips the block.

Now add an **`else`** right after the closing `}` of the `if`:

```java
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an adult!");
        }
```

`else` has **no condition**. It means "if the condition above was false, do this instead."
Now Java **always** runs exactly one of the two blocks.

**Run it.** Output:

```
You are not an adult!
```

### Step 4 — else if, and why order matters (video 71:45)

You can check **more** conditions before the `else`, with **`else if`**. He adds a check
for age 75 and up, **between** the `if` and the `else`:

```java
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 75) {
            System.out.println("OK boomer!");
        } else {
            System.out.println("You are not an adult!");
        }
```

Change `age` to `75` and **run it.** Output:

```
You are an adult!
```

**Why not "OK boomer!"?** Java checks the conditions **in order, from the top**, and stops
at the **first** one that is true. 75 >= 18 is true, so it prints "You are an adult!" and
**skips everything else**. It never even looks at `age >= 75`.

**The fix (video 72:06):** put the most specific check **first**. Swap the two conditions
and their messages:

```java
        if (age >= 75) {
            System.out.println("OK boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an adult!");
        }
```

**Run it.** Output:

```
OK boomer!
```

### Step 5 — Another else if (video 73:27)

Add one more `else if`, for teenagers, just before the `else`:

```java
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
```

Change `age` to `13` and **run it.** Output:

```
You are a teenager!
```

### Step 6 — Comparison operators, and `=` vs `==` (video 73:52)

The symbols you use in conditions are called **comparison operators**:

| Symbol | Means |
|---|---|
| `>` | greater than |
| `<` | less than |
| `>=` | greater than or equal to |
| `<=` | less than or equal to |
| `==` | **is equal to** |
| `!=` | is not equal to |

**One equals sign `=` and two `==` are different.**

- `=` **puts a value into** a variable: `age = 75;`
- `==` **asks** if two things are equal: `age == 75`

He changes the first check to "is age **exactly** 75?" If you use one `=` by mistake:

```java
        if (age = 75) {
```

you get this error:

```
error: incompatible types: int cannot be converted to boolean
```

That means: "`age = 75` puts 75 into age. That's not a yes-or-no question, and `if` needs a
yes-or-no question."

Use **two** equals signs (video 74:13):

```java
        if (age == 75) {
            System.out.println("OK boomer!");
        } else if (age >= 18) {
```

Change `age` to `75` and **run it.** Output:

```
OK boomer!
```

---

## Part B — switches (`Switches.java`)

A **switch** compares **one** value against a **list** of possible matches. If you find
yourself writing a lot of `else if`s that all check the same variable for equality, a
switch is often cleaner.

### Step 7 — A String to check (video 76:36)

Open `Switches.java`. Type the `main` method. Inside it:

```java
        String day = "Friday";
```

### Step 8 — The switch, and the first case (video 76:45)

```java
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;
        }
```

- `switch (day)` means: "compare `day` against each `case` below."
- `case "Sunday":` means: "if `day` equals `"Sunday"`, start here." Note the **colon `:`**
  at the end, not a semicolon.
- `break;` means: "you're done, jump out of the switch." **(video 77:30)** He says this part
  is important. Step 10 shows why.

### Step 9 — A case for every day (video 78:38)

Add a `case` for each of the other six days, in order: Monday, Tuesday, Wednesday,
Thursday, Friday, Saturday. Each one has its own `println` and its own `break;`.

He copies and pastes the first case six times. **Type each one.** It is good practice.

Here is Monday, so you can see the pattern:

```java
            case "Monday":
                System.out.println("It is Monday");
                break;
```

All seven cases go **inside** the switch's `{ }`.

**Run it.** `day` is `"Friday"`. Output:

```
It is Friday
```

Change `day` to `"Monday"` and run it again:

```
It is Monday
```

### Step 10 — What happens without `break` (video 78:55)

To show why `break` matters, he **deletes all the `break;` lines** and runs it with `day`
set to `"Monday"`. If you try it, the output is:

```
It is Monday
It is Tuesday
It is Wednesday
It is Thursday
It is Friday
It is Saturday
```

Without `break`, Java finds the matching case and runs it, **and then keeps going**,
running every case below it too. This is called **falling through**.

**Put all the `break;` lines back** before you go on.

### Step 11 — default: when nothing matches (video 79:40)

What if `day` is not a day at all? Change it:

```java
        String day = "Pizza";
```

**Run it.** Nothing prints. No case matches, so the switch does nothing.

Add a **`default`** at the very end of the switch, after the Saturday case:

```java
            default:
                System.out.println(day + " is not a day");
```

`default` is like `else`: it runs when **no** case matched.

**Run it.** Output:

```
Pizza is not a day
```

---

## Your finished programs

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>IfStatements.java</code></summary>

```java
package part06;

// (the comments at the top of your file)

public class IfStatements {
    public static void main(String[] args) {
        int age = 75;
        if (age == 75) {
            System.out.println("OK boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }
    }
}
```

Output:

```
OK boomer!
```

</details>

<details>
<summary>Click to compare <code>Switches.java</code></summary>

```java
package part06;

// (the comments at the top of your file)

public class Switches {
    public static void main(String[] args) {
        String day = "Pizza";
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println(day + " is not a day");
        }
    }
}
```

Output:

```
Pizza is not a day
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
