import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Character.getNumericValue;

public class FooBarQix {

    public static String process(int digit) {
        Map<Integer, String> rulesMap = new HashMap<>();
        rulesMap.put(3, "Foo");
        rulesMap.put(5, "Bar");
        rulesMap.put(7, "Qix");

        //first rule : number divisible by 3 then Foo, divisible by 5 then Bar
        String fooBarQix = rulesMap
                .keySet()
                .stream()
                .filter(divisor -> divisor != 7 && digit % divisor == 0)
                .map(rulesMap::get)
                .collect(Collectors.joining());

        //second rule : append if number contains (3 -> Foo), (5 -> Bar), (3 -> Qix)
        String digitAsString = String.valueOf(digit);
        fooBarQix += digitAsString
                .chars()//unicode
                .mapToObj(intAsChar -> rulesMap.getOrDefault(getNumericValue(intAsChar), ""))
                .collect(Collectors.joining());

        return fooBarQix.isEmpty() ? digitAsString : fooBarQix;
    }
}
