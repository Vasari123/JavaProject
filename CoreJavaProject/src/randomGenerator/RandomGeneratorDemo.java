package randomGenerator;

import java.util.random.RandomGenerator;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println("Random int " + generator.nextInt());
        System.out.println("Random int " + generator.nextInt(101));
        System.out.println("Random double " + generator.nextDouble());
        System.out.println("Random double " + generator.nextDouble(10.0));
    }
}
