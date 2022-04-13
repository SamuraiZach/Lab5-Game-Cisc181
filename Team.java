import java.util.ArrayList;
public class Team {
    protected String teamColor;
    protected ArrayList<Piece> teamPieces;

    public Team(String teamColor, ArrayList<Piece> teamPieces) {
        this.teamColor = teamColor;
        this.teamPieces = teamPieces;
    }

    public String getTeamColor() {
        return this.teamColor;
    }

    public ArrayList<Piece> getTeamPieces() {
        return this.teamPieces;
    }

    public void removePieceFromTeam(Piece pieceBeingRemoved) {
        teamPieces.remove(pieceBeingRemoved);
    }

    public void addPieceToTeam(Piece pieceBeingAdded) {
        teamPieces.add(pieceBeingAdded);
        for(Piece piece : teamPieces){
            if(piece == pieceBeingAdded){
                piece.teamColor = getTeamColor();
            }
        }
    }

    @Override
    public String toString() {
        String string = "Team " + this.teamColor + " Pieces:\n";
        for (Piece piece : teamPieces) {
            string += piece.toString() + " ";
        }
        return string;
    }
}