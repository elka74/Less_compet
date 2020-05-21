package lesson_1;

public class Cat implements Competitor {
    private String type;
    private String name;
    private int maxRun ;
    private int maxJump;
    private boolean onDistance;

    public Cat(String type, String name, int maxRun, int maxJump) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDistance = true;
    }
    public Cat(String type, String name) {
        this("Кот/кошка", name, 100, 1);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun){
            System.out.println(type + " " + name + " успешно пробежал/a " + dist + " метров/а! ");
        }else {
            System.out.println(type + " " + name + " не смог/ла пробежать " + dist + " метров/а!\n");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump){
            System.out.println(type + " " + name + " успешно прыгнул/а " + height + " метров/а!\n ");
        }else {
            System.out.println(type + " " + name + "не смог/ла прыгнуть " + height + " метров/а!\n");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + (onDistance?" на дистанции": "выбыл/а из соревнований"));
    }
}

