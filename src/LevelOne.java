import java.util.ArrayList;

public class LevelOne {
    public static void main(String[] args) {
        System.out.println("--- Рівень 1: Векторна структура (ArrayList) ---");

        // екземпляр
        ArrayList<Integer> vectorList = new ArrayList<>();
        vectorList.add(10);
        vectorList.add(20);
        vectorList.add(30);
        vectorList.add(40);
        vectorList.add(50);
        System.out.println("Вміст після вставки: " + vectorList);

        // видалення
        vectorList.remove(Integer.valueOf(20)); // видалення за значенням
        vectorList.remove(0);  // видалення за індексом

        System.out.println("Вміст після видалення: " + vectorList);
    }
}
