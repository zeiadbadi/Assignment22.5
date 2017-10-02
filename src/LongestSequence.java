import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class LongestSequence {



    private static int input;
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();


    public static void main(String[] args) {


        boolean k = true;
        System.out.println("Enter a series of numbers ending with 0: (with a space between each number)");
        while(k) {

            input = scan.nextInt();
            if(input > 0) {

                list.add(input);
            }
            else
            {
                k = false;
            }
        }

        int counter = 1;
        for(int i = 1; i < list.size(); i++) {

            if(list.get(i).equals(list.get(i - 1))) {

                counter++;
            }
            else
            {
                map.put(counter, i - counter);
                counter = 1;
            }
        }

        System.out.println("The longest same number sequence starts at index "
                +map.lastEntry().getValue() + " with " + map.lastEntry().getKey()
                + " values of " + list.get(map.lastEntry().getKey()));
    }
}