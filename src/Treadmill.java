public class Treadmill extends Obstacles {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}

