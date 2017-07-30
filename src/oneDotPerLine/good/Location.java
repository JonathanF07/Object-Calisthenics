package oneDotPerLine.good;

public class Location {

    private Piece current;

    void addTo(StringBuffer buf) {
        current.addTo(buf);
    }

}
