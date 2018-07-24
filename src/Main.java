import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("Bob");
        squadList.add("John");
        squadList.add("Kenn");
        squadList.add("Kevin");

        squadList.remove("Kenn");
        System.out.println(squadList);
        System.out.println(squadList.size());
        System.out.println(squadList.get(2));
        System.out.println(squadList);

    }
}
