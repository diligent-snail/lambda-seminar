package ru.hse.lambda;

import ru.hse.lambda.retrofit.ToDo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

// @formatter:off
@SuppressWarnings({"NonAsciiCharacters", "FieldNamingConvention", "unused"})
public class LambdaSeminar {















    long добрыйДень0;














    int примерСReflection;

    // @formatter:on
    // <editor-fold desc="Пример. Сортировка 🔢">
    public static class SortExample {

        public static void main(String[] args) {

        }


        public static void sorting() {
            String[] strings = {"a", "b", "cccc"};

            Arrays.sort(strings, (String o1, String o2) -> o1.compareTo(o2));
        }
    }

    // </editor-fold>
    // <editor-fold desc="Пример. MyForEach ">
    public static class MyForEach {
        public interface PersonConsumer {
            void accept(Person person);
        }

        public record Person(String firstName) {
        }

        public static void myForEach(
                Collection<Person> collection,
                PersonConsumer consumer) {
            for (Person person : collection) {
                consumer.accept(person);
            }
        }

        public static void main(String[] args) {
            List<Person> people = List.of(new Person("Abc"));

            myForEach(people, person -> System.out.println(person));
        }
    }

    // </editor-fold>
    // <editor-fold desc="Пример. PrintFiltered">
    public static class PrintFiltered {

        public record Person2(String firstName) {
        }

        public interface PersonFilter {
            default int foo() {
                return 1;
            }

            boolean matches(Person2 person);
        }

        public static void main(String[] args) {
            List<Person2> people = List.of(new Person2("Abc"));

            PersonFilter personFilter = person -> person.firstName().contains("A");
            printMatching(people, personFilter);

            System.out.println(personFilter.getClass());
        }

        public static void printMatching(
                Collection<Person2> collection,
                PersonFilter filter) {
            for (Person2 person2 : collection) {
                if (filter.matches(person2)) {
                    System.out.println(person2);
                }
            }
        }
    }

    // </editor-fold>
    // <editor-fold desc="@FunctionalInterface">
    @FunctionalInterface
    public interface MyAction {
        // SAM = Single Abstract Method
        void accept(String string);
    }

    // </editor-fold>
    // <editor-fold desc="Кто реализует интерфейсы?">
    public static class WhoImplementsThem {

    }

    // </editor-fold>
    //<editor-fold desc="java.util.function">
    public static class JavaUtilFunction {
    }

    public static class StreamClass {
        public static void main(String[] args) throws IOException {


/*
            IntStream.range(0, 1000)
                    .filter(it -> it % 2 == 0)
                    .limit(10)
                    .forEach(System.out::println);
*/

            ToDo toDo = new ToDo();

            Supplier<String> stringSupplier = toDo::getBody;
            String s = stringSupplier.get();
            String s1 = stringSupplier.get();
            Supplier<List<String>> listSupplier = List::of;
            Supplier<ToDo> toDoSupplier = ToDo::new;
            Function<String, ToDo> function = ToDo::new;

            List.of("a", "bb", "ccc")
                    .stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);

        }

        private static boolean foo2(int it) {
            try {
                return foo(it);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static boolean foo(int t) throws IOException {
            return true;
        }
    }

    //</editor-fold>
    //<editor-fold desc="Checked исключения 👿👿👿">
    public static class CheckedExceptions {

    }

    //</editor-fold>
    //<editor-fold desc="MethodReferences">
    public static class MethodReferences {
        public static void main(String[] args) {
        }
    }

    //</editor-fold>
    //<editor-fold desc="effectively final">
    public static class EffectivelyFinal {
        public static void main(String[] args) {
            Runnable runnable = () -> System.out.println(args);
            runnable.run();
            runnable.run();
        }
    }
    //</editor-fold>
    //<editor-fold desc="invokedynamic">
    //</editor-fold>
    //<editor-fold desc="Enum">
    //</editor-fold>
}
