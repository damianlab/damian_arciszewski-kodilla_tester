public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 5, 6};

        int sum = 0;
        for( int i : numbers) {
            sum += i;
        }

        System.out.println(sum);
    }
}




