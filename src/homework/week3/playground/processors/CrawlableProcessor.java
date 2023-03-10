package homework.week3.playground.processors;


import homework.week3.playground.utils.DistanceGenerator;
import homework.week3.playground.essence.creatures.Crawlable;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        String direction = String.valueOf(DistanceGenerator.generateDistance());
        this.runCrawlable(crawlable, direction);
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction);
    }

}
