import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        IntStream.rangeClosed(1, 100)
            .mapToObj(FooBarQix::process)
            .forEach(System.out::println);
    }
}
