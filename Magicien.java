public class Magicien extends Sorcier implements SuperPouvoir {

    public Magicien(int v, String nom){
        super(v,nom);
    }

    public double sort(){
        return Math.random()*this.getPouvoir();
    }


    public int subitCharme(int coup) {
        this.addVie(-coup);
        return(-(int)(coup*this.sort()));
    }
}
