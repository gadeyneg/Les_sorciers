public class GnomeDeJardin extends NainJardin{
    public void GnomeDeJardin(int s){
        super.solidite=s;
    }

    public int subitCharme(int coup){
        int sort= (int)(Math.random()*this.solidite);
        if(sort>coup){
            return -coup;
        }
        return 0;
    }
}
