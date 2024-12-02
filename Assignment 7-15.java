import java.util.Scanner;
import java.util.HashSet;


public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] result = eliminateDuplicates(list);
        System.out.println("Array after eliminating duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}



    

