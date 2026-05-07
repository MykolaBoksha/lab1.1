import java.util.ArrayList;
import java.util.List;

public class LevelOne {
    public static void main(String[] args) {
        System.out.println("--- Рівень 1: Список з векторним розміщенням (ArrayList) ---");

        List<String> vectorList = new ArrayList<>();

        vectorList.add("15");
        vectorList.add("42");
        vectorList.add("7");
        vectorList.add("100");
        vectorList.add("23");
        System.out.println("Вміст списку після вставки: " + vectorList);

        vectorList.remove("42");
        vectorList.remove(0);

        System.out.println("Вміст списку після видалення: " + vectorList);
    }
}