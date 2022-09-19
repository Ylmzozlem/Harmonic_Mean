public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);

        harmony(numbers);

    }

    public static void harmony(int[] num){
        double sum=0.0;
        for (double w:num) {
             sum=sum+1.0/w;

        }
        System.out.println("Your harmonic mean is " + sum);

    }
}
