package homework.playground.essence.creatures.animal.vertebrata;

import homework.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public void crawl(String direction, int distance) {
        System.out.printf(("I am %s, my name is %s and I am crawling to %s for %s \n" + "wr-wr-wrr-r.. \n"), getClass().getSimpleName(), name, direction, distance);

    }
}

