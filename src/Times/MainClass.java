package Times;

public class MainClass {
    public static void main (String [] args){
        System.out.println("Рабочее время в неделю - 40 часов.");
        for (Days d: Days.values()){
            System.out.println(d + ": до конца рабочей недели осталось  " + d.getTime() + " " + d.getS());

        }
    }

}
