import java.util.LinkedList;
import java.util.List;

public class LevelTwo {
    public static void main(String[] args) {
        System.out.println("\n--- Рівень 2: Список зі зв'язаним розміщенням (LinkedList) ---");


        List<String> linkedList = new LinkedList<>();

        linkedList.add("50");
        linkedList.add("12");
        linkedList.add("88");
        linkedList.add("3");
        System.out.println("Вміст списку після вставки: " + linkedList);


        if (linkedList.size() >= 2) {
            linkedList.remove(0); // видалення першого
            linkedList.remove(linkedList.size() - 1); // видалення останнього
        }

        System.out.println("Вміст списку після видалення: " + linkedList);
    }
}
