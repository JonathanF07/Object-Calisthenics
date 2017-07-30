package oneDotPerLine.good;

import java.util.List;

public class Board {

    String boardRepresentation() {
        StringBuffer buf = new StringBuffer();
        for (Location l : squares()) {
            l.addTo(buf);
        }
        return buf.toString();
    }

    private List<Location> squares() {
        // No implementation needed
        return null;
    }

}
