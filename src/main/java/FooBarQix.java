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

        //second rule
        String number = String.valueOf(digit);
        for (char c : number.toCharArray()) {
            if(String.valueOf(3).charAt(0) == c) {
                stringBuilder.append("Foo");
            }
            if(String.valueOf(5).charAt(0) == c) {
                stringBuilder.append("Bar");
            }
            if(String.valueOf(7).charAt(0) == c) {
                stringBuilder.append("Qix");
            }
        }

        if(stringBuilder.toString().isEmpty()) {
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }
}
