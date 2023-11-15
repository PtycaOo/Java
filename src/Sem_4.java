import java.util.LinkedList;
import java.util.Scanner;



public class Sem_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("Bye!");
                return;
            }
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Bye!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    System.out.println("String added");
            }

        }

    }

    static void task() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("Bye!");
                return;
            }
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Bye!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    System.out.println("String added");
            }

        }
    }
}