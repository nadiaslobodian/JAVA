package homework12;

public class Algorithm {

    public void returning (int number) {

        String value = String.valueOf(number);
        char[] array = value.toCharArray();
        char temporary;

        for (int i = 0; i < array.length / 2; i++) {
            temporary = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temporary;
        }

        String value1 = new String(array);

        if (value.equals(value1)) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }

    public String newReturn (String data) {

        char[] array = data.toCharArray();
        char temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 -i] = temp;
        }

        String data1 = new String(array);

        return data1;
}

}
