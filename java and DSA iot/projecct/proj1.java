import java.util.Scanner;


class Ride {
    int rideId;
    String pickup;
    String drop;
    double fare;

    Ride(int rideId, String pickup, String drop, double fare) {
        this.rideId = rideId;
        this.pickup = pickup;
        this.drop = drop;
        this.fare = fare;
    }
}


class Node {
    Ride data;
    Node next;

    Node(Ride data) {
        this.data = data;
        this.next = null;
    }
}


class RideHistory {
    Node head = null;

 
    void addRide(Ride r) {
        Node newNode = new Node(r);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Ride added!");
    }

    void deleteLastRide() {
        if (head == null) {
            System.out.println("No rides to delete!");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        System.out.println("Last ride deleted!");
    }

   
    void displayRides() {
        if (head == null) {
            System.out.println("No rides found!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("Ride ID: " + temp.data.rideId +
                    " | Pickup: " + temp.data.pickup +
                    " | Drop: " + temp.data.drop +
                    " | Fare: " + temp.data.fare);
            temp = temp.next;
        }
    }

    
    void searchRide(String location) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.pickup.equalsIgnoreCase(location) ||
                temp.data.drop.equalsIgnoreCase(location)) {

                System.out.println("Found Ride -> ID: " + temp.data.rideId +
                        " | Pickup: " + temp.data.pickup +
                        " | Drop: " + temp.data.drop +
                        " | Fare: " + temp.data.fare);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No ride found for location: " + location);
        }
    }

    void reverseHistory() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        System.out.println("Ride history reversed!");
    }
}


public class proj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RideHistory history = new RideHistory();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Ride");
            System.out.println("2. Delete Last Ride");
            System.out.println("3. Display Rides");
            System.out.println("4. Search Ride by Location");
            System.out.println("5. Reverse Ride History");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Ride ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Pickup: ");
                    String pickup = sc.nextLine();

                    System.out.print("Enter Drop: ");
                    String drop = sc.nextLine();

                    System.out.print("Enter Fare: ");
                    double fare = sc.nextDouble();

                    history.addRide(new Ride(id, pickup, drop, fare));
                    break;

                case 2:
                    history.deleteLastRide();
                    break;

                case 3:
                    history.displayRides();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter location to search: ");
                    String loc = sc.nextLine();
                    history.searchRide(loc);
                    break;

                case 5:
                    history.reverseHistory();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}