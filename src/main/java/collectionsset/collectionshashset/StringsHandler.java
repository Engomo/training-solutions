package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> strings) {
        Set<String> uniqueStrings = new HashSet<>(strings);
        return uniqueStrings;
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        setA.retainAll(setB);
        return setA;
    }
}
