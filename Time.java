public class Time {
    protected int secondi,minuti,ore;

    public Time(int secondi, int minuti, int ore) {
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    public Time(int secondi){
        this.secondi += secondi;
        distribuisci();
    }       

    public int getSecondi() {
        return secondi;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getOre() {
        return ore;
    }

    public int convertiSecondi(){
        return secondi + minuti*60 + ore*3600;
    }

    private void distribuisci(){
        int contM = this.secondi/60;
        this.secondi = this.secondi%60;
        this.minuti += contM;
        int contO = this.minuti/60;
        this.minuti = this.secondi%60;
        this.ore += contO;
    }

    public void addSecondi(int secondi){
        this.secondi += secondi;
        distribuisci();
    }

    @Override
    public String toString(){
        return this.ore+":"+this.minuti+":"+this.secondi;
    }
}
