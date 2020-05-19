package lesson_2_exception;

public class MyArrayDataException extends NumberFormatException{

    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }
    public void info (){
        System.out.println("Неверный формат введенного символа в ячейке [" + getI() + "]" + "[" + getJ()+ "]");
    }
}
