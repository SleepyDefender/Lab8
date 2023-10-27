public class Gitgaming {

    private game stratergy;

    public Gitgaming(game stratergy){
        this.stratergy = stratergy;
    }

    public void play(){
        this.stratergy.play();
    }

    public void setStratergy(game stratergy){
        this.stratergy = stratergy;
    }


}
