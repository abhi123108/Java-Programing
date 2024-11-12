package LinkedList;
// remove Cycle in linked list
import LinkedList.Linkedlist.Node;

public class Problem3 {
    public static Node head;

    public static boolean isCycle() {   // Floyd’s Cycle-Finding Algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break; // Break loop once cycle is detected
            }
        }
        
        // If no cycle is detected, return
        if (!cycle) {
            return;
        }
        
        // Reset slow to head to find the cycle start point
        slow = head;
        Node prev = null;  // to keep track of the last node of the cycle
        
        // Move slow and fast one step at a time to find the start of the cycle
        while (slow != fast) {
            prev = fast;   // keep track of the last node in the cycle
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creates a cycle

        System.out.println("Cycle detected: " + isCycle());
        removeCycle();
        System.out.println("Cycle detected after removal: " + isCycle());
    }
}

