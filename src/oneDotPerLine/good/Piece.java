package oneDotPerLine.good;

public class Piece {

    private String representation;

    String character() {
        return representation.substring(0, 1);
    }

    void addTo(StringBuffer buf) {
        buf.append(character());
    }

}
