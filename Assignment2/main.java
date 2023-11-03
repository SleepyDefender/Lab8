package Assignment2;

public class main {
    public static void main(String[] args) {
        SimilarityMetric cosineMetric = new cosine();
        SimilarityMetric jaccardMetric = new Jaccard();
        SimilarityMetric levenshteinMetric = new levenshteins();

        TextSimilarityChecker spellCheckerLevenshtein = new SpellChecker(levenshteinMetric);
        TextSimilarityChecker spellCheckerCosine = new SpellChecker(cosineMetric);
        TextSimilarityChecker spellCheckerJaccard = new SpellChecker(jaccardMetric);

        TextSimilarityChecker lessonRecommenderCosine = new LessonRecomender(cosineMetric);
        TextSimilarityChecker lessonRecommenderJaccard = new LessonRecomender(jaccardMetric);
        TextSimilarityChecker lessonRecommenderLevenshtein = new LessonRecomender(levenshteinMetric);

        String text1 = "This is a sample text.";
        String text2 = "This is another sample text.";

        // Testing SpellChecker with different metrics
        System.out.println("SpellChecker Levenshtein: " + spellCheckerLevenshtein.evaluate(text1, text2));
        System.out.println("SpellChecker Cosine: " + spellCheckerCosine.evaluate(text1, text2));
        System.out.println("SpellChecker Jaccard: " + spellCheckerJaccard.evaluate(text1, text2));

        // Testing LessonRecommender with different metrics
        System.out.println("LessonRecommender Cosine: " + lessonRecommenderCosine.evaluate(text1, text2));
        System.out.println("LessonRecommender Jaccard: " + lessonRecommenderJaccard.evaluate(text1, text2));
        System.out.println("LessonRecommender Levenshtein: " + lessonRecommenderLevenshtein.evaluate(text1, text2));
    }
}
 
    

