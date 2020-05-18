public class Human implements Competitor {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean onDistance;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDistance = true;
    }

    public Human(String name) {
        this(name, 3000, 2);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun){
            System.out.println(name + " успешно пробежал/а " + dist + " метров/а! ");
        }else {
            System.out.println(name + " не смог/ла пробежать " + dist + " метров/а!\n ");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump){
            System.out.println(name + " успешно прыгнул/а " + height + " метров/а!\n ");
        }else {
            System.out.println(name + " не смог/ла прыгнуть " + height + " метров/а!\n");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + (onDistance?" на дистанции": "выбыл/ла из соревнований"));
    }
}


