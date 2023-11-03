public class main {
    public static void main(String[] args) {
       var nGame = new Gitgaming(new MathGame());
         nGame.play();
            nGame.setStratergy(new GuessingGame());
            nGame.play();
    }
}