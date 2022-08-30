import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Amy");
        names.add("Bob");
        names.add("Cindy");
        names.add("David");

        System.out.println(names);
        System.out.println("Length: " + names.size());

        names.add(0, "Nick");
        names.add(1, "Mike");
        names.remove(3);
        System.out.println(names);
        System.out.println("New length: " + names.size());


    }

}
