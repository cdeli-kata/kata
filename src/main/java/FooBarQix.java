public class FooBarQix {

    public String process(int digit) {
        //first rule
        StringBuilder stringBuilder = new StringBuilder();
        if(digit % 3 == 0) {
            stringBuilder.append("Foo");
        }
        if(digit % 5 == 0) {
            stringBuilder.append("Bar");
        }

        if(stringBuilder.toString().isEmpty()) {
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }
}
