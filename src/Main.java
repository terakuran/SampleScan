import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO:これから始めます
        System.out.println("Hello");

        // NullPointer(Ver.2で解消)
        String str = "Hello";
        if (!str.isEmpty()) {
            System.out.println(str);
        }

        // IndexOutObBounds(Ver.2で埋め込み)
        ArrayList array = new ArrayList();

        array.add("1番目");
        array.add("2番目");
        array.add("3番目");

        for (int i = 0; i < 10; i++) {
            System.out.println(array.get(i));
        }

    }

}
