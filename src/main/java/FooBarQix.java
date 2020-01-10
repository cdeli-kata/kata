import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Character.getNumericValue;

public class FooBarQix {

    public String process(int digit) {
        Map<Integer, String> rulesMap = new HashMap<>();
        rulesMap.put(3, "Foo");
        rulesMap.put(5, "Bar");
        rulesMap.put(7, "Qix");

        //first rule
        String fooBarQix = rulesMap
                .keySet()
                .stream()
                .filter(divisor -> divisor != 7 && digit % divisor == 0)
                .map(rulesMap::get)
                .collect(Collectors.joining());

        //second rule
        String digitAsString = String.valueOf(digit);
        fooBarQix += digitAsString
                .chars()//unicode
                .mapToObj(intAsChar -> rulesMap.getOrDefault(getNumericValue(intAsChar), ""))
                .collect(Collectors.joining());

        return fooBarQix.isEmpty() ? digitAsString : fooBarQix;
    }
}
