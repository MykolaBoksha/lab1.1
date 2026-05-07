import java.util.LinkedList;

public class LevelTwo {
    public static void main(String[] args) {
        System.out.println("\n--- Рівень 2: Зв'язана структура (LinkedList) ---");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Node_A");
        linkedList.add("Node_B");
        linkedList.add("Node_C");
        linkedList.addFirst("Start_Node"); // специфічно для зв'язаного списку

        System.out.println("Вміст після вставки: " + linkedList);

        linkedList.remove("Node_B");
        linkedList.removeLast();

        System.out.println("Вміст після видалення: " + linkedList);
    }
}
