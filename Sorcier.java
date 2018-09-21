public class Sorcier extends Personnage{

    private double pouvoir;

    public Sorcier(int v, String n){
        super(v,n);
        this.pouvoir=Math.random();
    }

    public void attaque(Personnage p){
        System.out.println("Je suis "+this.nom+" et j'attaque "+p.nom);
        if(!p.mort()&!this.mort()) {
            int r=p.subitCharme((int)(this.getVie()*this.pouvoir));
            this.addVie(r);
        }
    }

    public int subitFrappe(int coup) {
        this.addVie(-coup);
        if (this.getVie() <= 0) {
            this.en_vie = false;
            return 0;
        } else {
            return ((int) (this.getVie() * this.pouvoir));
        }
    }

    public int subitCharme(int coup){
            return 0;
    }

    public double getPouvoir(){
        return this.pouvoir;
    }

}
