package yarchuk;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

//Отлично работает, если в классе, обьекты которого хранятся в колекции, правильно переопределены хэшкод и equals.
public class NoDuplicateCollection<T> {

    public Collection<T> deleteDuplicates(Collection<T> collection) {

        HashSet<T> set = new LinkedHashSet<>(collection);
        collection.clear();
        collection.addAll(set);

        return collection;
    }

}
