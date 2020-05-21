package lesson_1;

import lesson_1.Competitor;
import lesson_1.Obstacles;

public class Wall extends Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

