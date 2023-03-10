package homework.week3.playground.runners;


import homework.week3.playground.essence.creatures.Crawlable;
import homework.week3.playground.essence.creatures.animal.insects.Beetle;
import homework.week3.playground.essence.creatures.animal.vertebrata.Crocodile;
import homework.week3.playground.essence.creatures.animal.vertebrata.Vertebrata;
import homework.week3.playground.processors.CrawlableProcessor;
import homework.week3.playground.essence.creatures.animal.insects.Insects;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {
        CrawlableProcessor processor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insects insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        processor.runCrawlable(crawlableCrocodile);
        processor.runCrawlable(crawlableBeetle);
//        processor.runCrawlable(vertebrataCrocodile);
//        processor.runCrawlable(insectBeetle);
        processor.runCrawlable(aCrocodile);
        processor.runCrawlable(aBeetle);
        processor.runCrawlable(anonymousCrawlable);
    }
}