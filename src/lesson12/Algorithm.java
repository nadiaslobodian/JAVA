package lesson12;

public class Algorithm {

    public boolean revers(String word) {

        char[] array = word.toCharArray();
        char storage;

        for (int i = 0; i < array.length / 2; i++) {
            storage = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = storage;
        }
        String word1 = new String(array);

        if(word.equals(word1)) {
            return true;
        } else {
            return false;
        }
}













}
