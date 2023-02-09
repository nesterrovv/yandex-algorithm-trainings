# Problem A: Air conditioner
## Problem description
In the office where the programmer Petr works, a new type 
of air conditioner was installed. This conditioner differs 
in special simplicity in management. The air conditioner 
has only two controllable parameters: the desired temperature
and operating mode.

The air conditioner can operate in the following four modes:

* "freeze" - cooling. In this mode, the air conditioner can only
reduce the temperature. If the temperature in the room is already
not more than desired, then it turns off.

* "heat" - heating. In this mode, the air conditioner can only 
increase the temperature. If the temperature in the room is 
already not less than desired, then it turns off.

* "auto" - automatic mode. In this mode, the air conditioner
can both increase and decrease the temperature in the room 
to the desired one.

* "fan" - ventilation. In this mode, the air conditioner 
only ventilates the air and does not change the temperature 
in the room.

The air conditioner is powerful enough, so when set to the 
correct operating mode, it brings the temperature in the room 
to the desired one in an hour.

It is required to write a program that, based on the set temperature 
in the room t<sub>room</sub>, the desired temperature t<sub>cond</sub> set on the air conditioner and the operating mode, 
determines the temperature that will be set in the room in an hour.

## Input format

The first line of the input file contains two integers 
t<sub>room</sub> and t<sub>cond</sub> separated by exactly 
one space, 
(–50 ≤ t<sub>cond</sub> ≤ 50, –50 ≤ t<sub>cond</sub> ≤ 50).

The second line contains one word written in lowercase letters 
of the Latin alphabet — the air conditioner operation mode.

## Output Format
The output file must contain a single integer - 
the temperature that will be established in the room in an hour.

## Solution

Let's consider 4 cases and think about temperature changing in
these cases:
* "freeze" - temperature will reduced from t<sub>room</sub> 
to  t<sub>cond</sub> if t<sub>room</sub> > t<sub>cond</sub>, 
otherwise no temperature changes will happen
* "heat" - temperature will increased from t<sub>room</sub>
to  t<sub>cond</sub> if t<sub>room</sub> < t<sub>cond</sub>,
otherwise no temperature changes will happen. 
* "auto" - temperature will changed (reduces or increased) 
from t<sub>room</sub> to  t<sub>cond</sub> without any external 
conditions. 
* "fan" - no temperature changes will happen

The logic described above is enough to write 
[code](https://github.com/nesterrovv/yandex-algorithm-trainings/blob/master/src/algorithmTrainings1/homeworks/homework1/Task_A_AirConditioner.java) 
that covers all these conditions. Let's return final temperature 
for all of four cases.

# Code

```java
package algorithmTrainings1.homeworks.homework1;

import java.util.Scanner;

public class Task_A_AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temperatures = scanner.nextLine().split(" ");
        String mood = scanner.next();
        int tRoom = Integer.parseInt(temperatures[0]);
        int tCond = Integer.parseInt(temperatures[1]);
        System.out.println(solve(tRoom, tCond, mood));
        scanner.close();
    }

    public static int solve(int tRoom, int tCond, String mood) {
        switch (mood) {
            case "auto":    return tCond;
            case "heat":    return Math.max(tRoom, tCond);
            case "freeze":  return Math.min(tRoom, tCond);
            default:        return tRoom;
        }
    }
}
```
