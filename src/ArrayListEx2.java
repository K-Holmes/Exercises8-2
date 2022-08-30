import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 16; i++) {
            numbers.add(i);
        }
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(numbers);

        //remove numbers in reverse to avoid outofbounds exception
        numbers.remove(14);
        numbers.remove(12);
        numbers.remove(10);
        numbers.remove(8);
        numbers.remove(6);
        numbers.remove(4);
        numbers.remove(2);
        numbers.remove(0);

        System.out.println(numbers);

    }
}
