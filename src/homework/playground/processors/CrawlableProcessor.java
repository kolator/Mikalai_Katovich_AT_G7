package homework.playground.processors;


import homework.playground.utils.DirectionGenerator;
import homework.playground.utils.DistanceGenerator;
import homework.playground.essence.creatures.Crawlable;

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
