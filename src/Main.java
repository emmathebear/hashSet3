import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet ten = hashsetOfNumbers(1, 5);
        System.out.println(ten);
        int toRemove = 3;
        Iterator<Integer> tenIterator = ten.iterator();
        while (tenIterator.hasNext()) {
            Integer i = tenIterator.next();
            if (i == toRemove) {
                tenIterator.remove();
            }
        }
        System.out.println(ten);
        ten.clear();
        if (ten.isEmpty()) {
            System.out.println("ten is empty");
        }

    }

    public static HashSet<Integer> hashsetOfNumbers(int number, int length) {
        HashSet temp = new HashSet();
        for (int i = 0; i < length; i++) {
            temp.add(number + i);
        }
        return temp;
    }
}