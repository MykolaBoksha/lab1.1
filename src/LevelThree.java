import java.util.ArrayList;
import java.util.LinkedList;

public class LevelThree {
    public static void main(String[] args) {
        System.out.println("\n--- Рівень 3: Взаємодія структур ---");

        ArrayList<Integer> firstStruct = new ArrayList<>();
        LinkedList<Integer> secondStruct = new LinkedList<>();

        // перша структура
        for (int i = 1; i <= 10; i++) {
            firstStruct.add(i * 3);
        }
        System.out.println("Перша структура (Vector): " + firstStruct);

        // друга структура
        for (Integer val : firstStruct) {
            if (val % 2 == 0) {
                secondStruct.add(val);
            }
        }

        // видалення
        System.out.println("Завдання виконано (копіювання парних чисел):");
        System.out.println("Результат (Перша): " + firstStruct);
        System.out.println("Результат (Друга): " + secondStruct);
    }
}