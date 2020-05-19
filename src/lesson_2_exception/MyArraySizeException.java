package lesson_2_exception;

public class MyArraySizeException extends Exception {
    private int length;
    private int heigth;

    public int getLength() {
        return length;
    }

    public int getHeigth() {
        return heigth;
    }

    public MyArraySizeException(int length, int heigth) {
        this.length = length;
        this.heigth = heigth;
    }


    public MyArraySizeException(String message, int length, int heigth) {
        super(message);
        this.length = length;
        this.heigth = heigth;
    }
    public void info (){
        System.out.println("Неверный размер массива [" + getLength() + "]" + "[" + getHeigth() + "]");
    }
}

