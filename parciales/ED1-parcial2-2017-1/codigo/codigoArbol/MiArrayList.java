import java.util.Arrays;

public class MiArrayList {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];

        public MiArrayList() {
                elements = new int[DEFAULT_CAPACITY];
        }

        public void add(int e) {
                if (size == elements.length) {
                        ensureCapa();
                }
                elements[size++] = e;
        }

        private void ensureCapa() {
                int newSize = elements.length * 2;
                elements = Arrays.copyOf(elements, newSize);
        }

        public int get(int i) {
                if (i>= size || i <0) {
                        throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
                }
                return  elements[i];
        }
}



