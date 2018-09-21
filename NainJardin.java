public class NainJardin implements Victime{
    protected int solidite;

    public void NainJardin(int s){

        this.solidite=s;
    }

    public int getSolidite(){

        return this.solidite;
    }

    public void changeSolidite(int ns){

        this.solidite=ns;
    }

    public int subitFrappe(int coup) {
        if(solidite<coup){
            int a = this.getSolidite();
            this.changeSolidite(0);
            return a;
        }
        else{
            return coup;
        }
    }

    public int subitCharme(int coup){

        return -1;
    }
}
