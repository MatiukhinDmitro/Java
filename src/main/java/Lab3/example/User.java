package Lab3.example;

import Lab3.Main;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

class ComparatorUser implements Comparator<Main> {
    String name;


    @Override
    public int compare(Main main, Main t1) {
        return 0;
    }

    @Override
    public Comparator<Main> reversed() {
        return null;
    }

    @Override
    public Comparator<Main> thenComparing(Comparator<? super Main> other) {
        return null;
    }

    @Override
    public <U> Comparator<Main> thenComparing(Function<? super Main, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Main> thenComparing(Function<? super Main, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Main> thenComparingInt(ToIntFunction<? super Main> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Main> thenComparingLong(ToLongFunction<? super Main> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Main> thenComparingDouble(ToDoubleFunction<? super Main> keyExtractor) {
        return null;
    }
}
