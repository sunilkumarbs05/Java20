package learning.designPattern.behavioral.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        CollectionNames collectionNames = new CollectionNames();
        IteratorCustom customIterator = collectionNames.iterator();

        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }
    }
}
