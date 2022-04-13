/**
 * <h1>Lab5</h1>
 *
 * <h2>CISC 181-40L Spring 2022</h2>
 *
 * <h3>University of Delaware</h3>
 *
 * <p>
 * // BuzzLightyear piece class that extends piece
 *
 * @author Zachariah Barraza, Cam Kennedy, and Victor Tung
 *
 * @since (2022-04-13)
 */
public class PieceBuzz extends Piece{
    private int numAttacks;
    private int numTimesBeenAttacked;
    private boolean workingLaser;

    public PieceBuzz(char symbol,
                     String teamColor,
                     int numAttacks,
                     int numTimesBeenAttacked,
                     boolean workingLaser,
                     boolean hidden,
                     boolean original) {
        super(symbol,teamColor,hidden,original);
        this.numAttacks = numAttacks;
        this.numTimesBeenAttacked = numTimesBeenAttacked;
        this.workingLaser = workingLaser;
    }

    public PieceBuzz(){
        this('B',"- -",
                0,0,
                true, false, true);
    }

    public char getSymbol() {
        return super.symbol;
    }
    public String getTeamColor() {
        return super.teamColor;
    }
    public int getNumAttacks() {
        return this.numAttacks;
    }
    public int getNumTimesBeenAttacked() {
        return this.numTimesBeenAttacked;
    }
    public boolean canAttack(){
        return this.workingLaser;
    }
    public boolean isHidden() {
        return super.hidden;
    }
    public boolean isOriginal(){ return super.original;}

    public void setSymbol(char symbol) {
        super.symbol = symbol;
    }
    public void setTeamColor(String teamColor) {
        super.teamColor = teamColor;
    }
    public void setWorkingLaser(boolean workingLaser) {
        this.workingLaser = workingLaser;
    }
    public void setHidden(boolean hidden) {
        super.hidden = hidden;
    }
    public void setOriginal(boolean original) {
        super.original = original;
    }

    public void setNumAttacks(int numAttacks)  {
        this.numAttacks = numAttacks;
    }

    public void updateNumTimesBeenAttacked(){
        this.numTimesBeenAttacked += 1;
        this.workingLaser = false;
    }

    public void speak(){
        System.out.println("To Infinity and Beyond!");
    }

    public boolean validMovePath(int fromSquareRow, int fromSquareCol,
                                 int toSquareRow, int toSquareCol) {
        // You will implement this method in a later step
        // each Piece will have a different valid path
        return true;
    }
    public Piece spawn(){
        return null;
    }
    public boolean canSpawn(){
        return false;
    }

}
