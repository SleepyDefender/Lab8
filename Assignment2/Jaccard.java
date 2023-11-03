package Assignment2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Jaccard implements SimilarityMetric {

    public static double computeJaccardsCoefficient(Point p1, Point p2) {
        Collection<String> tweet1 = new TreeSet<String>(Arrays.asList(p1
                .getTweet().split(" ")));

        Collection<String> tweet2 = new TreeSet<String>(Arrays.asList(p2
                .getTweet().split(" ")));

        Collection<String> intersectionOfTweets = new TreeSet<String>(
                tweet1);
        intersectionOfTweets.retainAll(tweet2);

        Collection<String> unionOfTweets = new TreeSet<String>(tweet1);
        unionOfTweets.addAll(tweet2);

        double jaccardsCoefficient = (double) intersectionOfTweets.size()
                / (double) unionOfTweets.size();
        return jaccardsCoefficient;
    }

@Override
public double measure(String text1, String text2) {
        Point p1 = new Point(text1);
        Point p2 = new Point(text2);
        return computeJaccardsCoefficient(p1, p2);
}
   
}


