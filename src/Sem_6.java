import java.util.*;



public class Sem_6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "V.Vasilev", "Maincoon", 8, 4.4);
        Cat cat2 = new Cat("Barsik", "V.Petrov", "Siam", 6, 6.6);
        Cat cat3 = new Cat("Murzik", "V.Vasilev", "Maincoon", 8, 4.4);
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(set);
    }

    static void task0() {
//        1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//
//        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//
//        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
        Integer[] arr = {1, 2, 3, 2, 7, 9, 1, 4, 5, 6, 3, 20, 11, 23};
        String[] arr2 = {"1242", "adfe", "dfaewae"};
        Set<String> set1 = new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<String> set3 = new TreeSet<>(Arrays.asList(arr2));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    static double task1() {
        Integer[] arr = createArray(10000, 0, 24);
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0 / arr.length;

    }

    static Integer[] createArray(int size, int min, int max) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(min, max + 1);
        }
        return arr;
    }
}
