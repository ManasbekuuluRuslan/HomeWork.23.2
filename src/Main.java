import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(100);
            numbers.add(num);
        }
        ArrayList<Integer> tak = new ArrayList<>();
        ArrayList<Integer> jup = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                jup.add(num);
            } else {
                tak.add(num);
            }
        }
        System.out.println("Жалпы сандар: " + numbers);
        System.out.println("Жуп сандар: " + jup);
        System.out.println("Так сандар: " + tak);
    }
}