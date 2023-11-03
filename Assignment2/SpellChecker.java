package Assignment2;

public class SpellChecker extends TextSimilarityChecker {

    public SpellChecker(SimilarityMetric metric) {
        super(metric);
    }

    public SpellChecker() {
        super(new levenshteins());
    }


    @Override
    public double getSimilarity(String text1, String text2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSimilarity'");
    }
    
}
