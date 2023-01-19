package ru.hse.lambda;

import java.util.Arrays;
import java.util.Comparator;

// @formatter:off
@SuppressWarnings({"NonAsciiCharacters", "FieldNamingConvention", "unused"})
public class LambdaSeminar {















    long добрыйВечер;














    int примерСReflection;

    // @formatter:on
    // <editor-fold desc="Пример. Сортировка 🔢">
    public static class SortExample {

        public static void main(String[] args) {

        }


        public static void sorting() {
            String[] strings = {"a", "b", "cccc"};

            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
        }
    }

    // </editor-foldЮ
    // <editor-fold desc="Пример. MyForEach ">
    public static class MyForEach {
        public record Person(String firstName) {
        }

        public static void myForEach() {
        }
    }

    // </editor-fold>
    // <editor-fold desc="Пример. PrintFiltered">
    public static class PrintFiltered {
        public record Person2(String firstName) {
        }

        public static void printMatching() {
        }
    }

    // </editor-fold>
    // <editor-fold desc="@FunctionalInterface">
    public interface MyAction {
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

        }
    }
    //</editor-fold>
    //<editor-fold desc="invokedynamic">
    //</editor-fold>
    //<editor-fold desc="Enum">
    //</editor-fold>
}
