import java.util.List;
public class MHSurucu {
    public static void main(String[] args) {
        MaxHeap<Integer, String> maxHeap = new MaxHeap<>();

        // Test insertion
        maxHeap.insertion(5, "Five");
        maxHeap.insertion(8, "Eight");
        maxHeap.insertion(3, "Three");
        maxHeap.insertion(10, "Ten");
        maxHeap.insertion(7, "Seven");

        System.out.println("Heap after first insertions:\n" + maxHeap);

        maxHeap.insertion(6, "Six");
        maxHeap.insertion(2, "Two");
        maxHeap.insertion(9, "Nine");

        System.out.println("Heap after second insertions:\n" + maxHeap);

        // Test deletion
        Position<Integer, String> elementToRemove = maxHeap.peek();
        maxHeap.deletion(elementToRemove.getKey(),elementToRemove.getElement());
        System.out.println("Heap after deletion of max" + "\n" + maxHeap);

        // Test findLessThanKey
        List<Position<Integer, String>> lessThanKeyList = maxHeap.findLessThanKey(7);
        System.out.print("Values with keys less than 7:\n");
        for (Position<Integer, String> position : lessThanKeyList) {
            System.out.print(position.getElement() + " ");
        }
        System.out.println();

        // Test buildFromArray
        Object[] array = {
                new Object[]{15, "Fifteen"},
                new Object[]{12, "Twelve"},
                new Object[]{20, "Twenty"}
        };
        maxHeap.buildFromArray(array);
        System.out.println("Heap after building from array:\n" + maxHeap);

        // Test peek
        Position<Integer,String> maxElement = maxHeap.peek();
        System.out.println("Peek:\n" +maxElement.getKey() +" "+ maxElement.getElement());
    }
}
