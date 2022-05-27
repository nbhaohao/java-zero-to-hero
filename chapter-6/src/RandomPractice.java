public class RandomPractice {

    public static int getRandom(int max) {
        return (int) (Math.random() * max) + 1;
    }

    public static void main(String[] args) {
        System.out.println(getRandom(5));
    }
}
