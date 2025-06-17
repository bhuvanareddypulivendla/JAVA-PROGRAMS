import java.util.*;
import java.util.Queue;
 
public class Queueop{
    public static void main(String[] args){

Queue<String> queue = new LinkedList<>();
        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Eminum");
        queue.add("Fairy");
        // Display the initial queue
        System.out.println("Initial Queue: " + queue);
        // Peek at the front of the queue
        System.out.println("Peek: " + queue.peek()); // Shows front without removing
        // Remove elements (FIFO)
        System.out.println("Removed: " + queue.remove()); // Removes "Alice"
        System.out.println("Queue after removal: " + queue);
        // Add another element
        queue.offer("David"); // Similar to add(), but returns false if it fails
        System.out.println("Final Queue: " + queue);


        // Create a Deque of Strings
Deque<String> deque = new ArrayDeque<>();

        // 1. Adding elements at the end
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        System.out.println("Deque after add: " + deque);

        // 2. Adding elements at the front
        deque.addFirst("Mango");
        deque.addFirst("Orange");
        System.out.println("Deque after addFirst: " + deque);

        // 3. Removing elements from front and end
        String removedFirst = deque.removeFirst(); // removes Orange
        String removedLast = deque.removeLast();   // removes Cherry
        System.out.println("Removed first: " + removedFirst);
        System.out.println("Removed last: " + removedLast);
        System.out.println("Deque after removals: " + deque);

        // 4. Peek elements without removing
        System.out.println("Peek first element: " + deque.peekFirst());
        System.out.println("Peek last element: " + deque.peekLast());

        // 5. Iterating over deque
        System.out.println("Iterating over deque:");
        for (String item : deque) {
            System.out.println(item);
        }

        // 6. Check if deque contains an element
        System.out.println("Contains Banana? " + deque.contains("Banana"));
        System.out.println("Contains Cherry? " + deque.contains("Cherry"));

        // 7. Size and empty check
        System.out.println("Size of deque: " + deque.size());
        System.out.println("Is deque empty? " + deque.isEmpty());

        // 8. Clear the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);

    }
}