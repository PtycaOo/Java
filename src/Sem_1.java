import javax.swing.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Sem_1 {
    public static void main(String[] args) {
        task4(2,-2);

    }

    //    В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
//
//</aside>
    static void task0() {
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour > 5 && hour < 12) System.out.println("Доброе утро " + name);
        else if (hour < 18) System.out.println("Добрый день " + name);
        else if (hour < 23) System.out.println("Добрый вечер " + name);
        else System.out.println("Доброй ночи " + name);
    }

    static void task1() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            if (arr[i] == 0) {
                if (count > max) max = count;
                count = 0;
            }

        }
        if(count > max) max = count;
        System.out.println(max);
    }

    static void task2(){
        int[] nums = {2,2,3,3,1,4,2,6,8,4,4};
        int val = 2;
        int[] nums2 = new int[nums.length];
        Arrays.fill(nums2,val);
        int count = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums2[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums2));
    }

    static void task3(){
        String s = "Добро пожаловать на курс по Java";
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void task4(int a, int b){
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result = result * a;
        }
        result = (b > 0 ? result : 1/result);
        System.out.println(result);
    }
}