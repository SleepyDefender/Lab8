package Assignment2;
public abstract class TextSimilarityChecker {
    
    SimilarityMetric metric;

    public TextSimilarityChecker(SimilarityMetric metric){
        this.metric = metric;
    }
    public final double evaluate(String text1, String text2){
        return getSimilarity(text1, text2);
    }
    public abstract double getSimilarity(String text1, String text2);

}
