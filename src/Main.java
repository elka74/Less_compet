public class Main {
        public static void main(String[] args) {
            Competitor[] competitors = {
                    new Human("Иван"),
                    new Cat("Кот/кошка", "Буся"),
                    new Robot("Робот", "Вертер")
            };

            Obstacles[] obstacles = {
                    new Treadmill(3000),
                    new Wall(2)

            };
            for (Competitor c : competitors) {
                for (Obstacles o : obstacles) {
                    o.doIt(c);
                    if (!c.isOnDistance()) {
                        break;
                    }
                }
            }
            for (Competitor c : competitors) {
                c.info();
            }
        }
    }
