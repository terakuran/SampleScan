import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO:���ꂩ��n�߂܂�
        System.out.println("Hello");

        // NullPointer(Ver.2�ŉ���)
        String str = "Hello";
        if (!str.isEmpty()) {
            System.out.println(str);
        }

        // IndexOutObBounds(Ver.2�Ŗ��ߍ���)
        ArrayList array = new ArrayList();

        array.add("1�Ԗ�");
        array.add("2�Ԗ�");
        array.add("3�Ԗ�");

        for (int i = 0; i < 10; i++) {
            System.out.println(array.get(i));
        }

    }

}
