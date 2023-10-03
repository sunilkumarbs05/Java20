package learning.designPattern.behavioral.iterator;

public class CollectionNames implements ContainerCustom {

    private String names[] = {"Anil", "Sunil", "Veer", "Sowndarya"};

    @Override
    public IteratorCustom iterator() {
        return new CollectionNamesIterator();
    }

    private class CollectionNamesIterator implements IteratorCustom {
        int i = 0;

        @Override
        public boolean hasNext() {
            return i < names.length ? true : false;
        }

        @Override
        public Object next() {
            return hasNext() ? names[i++] : null;
        }
    }
}
