package Assignment2;

public class LessonRecomender extends TextSimilarityChecker {

    public LessonRecomender(SimilarityMetric metric) {
        super(metric);
    }

    public LessonRecomender() {
        super(new Jaccard());
    }

    @Override
    public double getSimilarity(String text1, String text2) {
        return metric.measure(text1, text2);
    }
    
}
