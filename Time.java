public class Time {
    protected int secondi,minuti,ore;

    /**
     * 
     * @param secondi
     * @param minuti
     * @param ore
     */

    public Time(int secondi, int minuti, int ore) {
        if(secondi >59 || minuti > 59 ){
            this.secondi = 0;
            this.minuti = 0;
            this.ore = 0;
        }
        else{
            this.secondi = secondi;
            this.minuti = minuti;
            this.ore = ore;
            distribuisci();
        }
    }

    /**
     * 
     * @param secondi
     */

    public Time(int secondi){
        this.secondi = secondi;
        distribuisci();
    }       

    /**
     * getter of secondi
     * @return secondi
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * getter of minuti
     * @return minuti
     */
    public int getMinuti() {
        return minuti;
    }


    /**
     * getter of ore
     * @return ore
     */
    public int getOre() {
        return ore;
    }

    /**
     * Converts the total time into seconds
     * @return int (seconds)
     */
    public int convertiSecondi(){
        return secondi + minuti*60 + ore*3600;
    }

    private void distribuisci(){
        int contM = this.secondi/60;
        this.secondi -= contM*60;
        this.minuti += contM;
        int contO = this.minuti/60;
        this.minuti -= contO*60;
        this.ore += contO;
    }

    /**
     * Adds seconds to the seconds counter
     * @param secondi
     */
    public void addSecondi(int secondi){
        this.secondi += secondi;
        distribuisci();
    }

    @Override
    public String toString(){
        return this.ore+":"+this.minuti+":"+this.secondi;
    }
}
