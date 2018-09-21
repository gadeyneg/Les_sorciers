public abstract class Personnage implements Victime {
    protected int vie;
    protected String nom;
    protected Boolean en_vie; //1:vivant,0:mort

    public Personnage(int v,  String n){
        this.vie=v;
        this.nom=n;
        this.en_vie=true;
    }

    public String toString(){
        if(this.en_vie){
            return("Je m'appelle "+this.nom+"et j'ai "+this.vie+"points de vie.");
        }
        else {
            return(this.nom+" est mort.");
        }
    }

    public String getNom(){
        return(this.nom);
    }

    public Boolean mort(){
        return(!this.en_vie);
    }

    public int getVie(){
        return(this.vie);
    }

    public void addVie(int num){
        this.vie+=num;
    }

    public abstract void attaque(Personnage p);

}
