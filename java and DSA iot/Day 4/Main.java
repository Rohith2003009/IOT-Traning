import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1.Add  2.View  3.Search  4.Update  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // Add Student
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    list.add(new Student(id, name));
                    System.out.println("Added!");
                    break;

                // View Students
                case 2:
                    for (Student s : list) {
                        System.out.println(s.id + " " + s.name);
                    }
                    break;

                // Search by ID
                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();

                    for (Student s : list) {
                        if (s.id == sid) {
                            System.out.println("Found: " + s.name);
                        }
                    }
                    break;

                // Update Student
                case 4:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    for (Student s : list) {
                        if (s.id == uid) {
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();
                            System.out.println("Updated!");
                        }
                    }
                    break;
            }

        } while (choice != 5);
    }
}