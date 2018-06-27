import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO:‚±‚ê‚©‚çn‚ß‚Ü‚·
        System.out.println("Hello");

        // NullPointer(Ver.2‚Å‰ğÁ)
        String str = "Hello";
        if (!str.isEmpty()) {
            System.out.println(str);
        }

        // IndexOutObBounds(Ver.2‚Å–„‚ß‚İ)
        ArrayList array = new ArrayList();

        array.add("1”Ô–Ú");
        array.add("2”Ô–Ú");
        array.add("3”Ô–Ú");

        for (int i = 0; i < 10; i++) {
            System.out.println(array.get(i));
        }

    }

}
