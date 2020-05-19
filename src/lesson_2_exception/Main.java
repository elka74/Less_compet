package lesson_2_exception;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {
                {"12", "4", "35", "3"},
                {"23", "56", "43", "11"},
                {"3", "5", "33", "9"},
                {"7", "63", "9", "66"},

        };
        try {
            sumArrNumbers(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            e.info();

        } catch (MyArraySizeException e) {
            e.printStackTrace();
            e.info();
        }
    }

    static void sumArrNumbers(String[][] s) throws MyArraySizeException, MyArrayDataException {
        for (String[] strings : s) {
            for (int j = 0; j < strings.length; j++) {
                if ((s.length != 4) || (strings.length != 4)) {
                    throw new MyArraySizeException("Exception", s.length, strings.length);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                try {
                    int x = Integer.parseInt(s[i][j]);
                    sum += x;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Exception", i, j);

                }
            }
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}



