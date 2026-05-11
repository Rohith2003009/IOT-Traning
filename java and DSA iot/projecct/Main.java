import java.util.*;

class Subject {
    String name;
    String teacher;

    Subject(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}

public class Main {

    static int N = 4;

    static Subject[] subjects = {
            new Subject("Math", "A"),
            new Subject("Physics", "B"),
            new Subject("Chemistry", "A"),
            new Subject("Biology", "C")
    };

    static String[] slots = {"Slot1", "Slot2", "Slot3", "Slot4"};
    static Subject[] result = new Subject[N];

    // FIXED: No unnecessary restriction
    static boolean isSafe(int index, Subject sub) {
        return true; // All slots are independent
    }

    static boolean generateTimetable(int index) {
        if (index == N) return true;

        for (int i = 0; i < N; i++) {
            if (subjects[i] != null) {

                result[index] = subjects[i];
                Subject temp = subjects[i];
                subjects[i] = null;

                if (generateTimetable(index + 1)) return true;

                // backtrack
                subjects[i] = temp;
                result[index] = null;
            }
        }
        return false;
    }

    static void display() {
        System.out.println("\nGenerated Timetable:");
        for (int i = 0; i < N; i++) {
            System.out.println(slots[i] + " -> " +
                    result[i].name + " (Teacher " + result[i].teacher + ")");
        }
    }

    public static void main(String[] args) {
        if (generateTimetable(0)) {
            display();
        } else {
            System.out.println("No valid timetable found!");
        }
    }
}