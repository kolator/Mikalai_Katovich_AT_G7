package homework.week3.playground.essence.creatures.animal.vertebrata;

import homework.week3.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }
    public void crawl (String direction){
        System.out.printf(("I am %s, my name is %s and I am crawling to %s for %s \n" + "wr-wr-wrr-r.. \n"), getClass().getSimpleName(), name, direction);
        // F - ?
    }
}

