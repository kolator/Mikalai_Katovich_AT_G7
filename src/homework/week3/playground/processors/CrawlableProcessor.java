package homework.week3.playground.processors;


import homework.week3.playground.utils.DirectionGenerator;
import homework.week3.playground.utils.DistanceGenerator;
import homework.week3.playground.essence.creatures.Crawlable;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        int distance = DistanceGenerator.generateDistance();
        String direction = DirectionGenerator.generateDirection();
        this.runCrawlable(crawlable, direction, distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }

}
