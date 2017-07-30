package oneDotPerLine.bad;

import java.util.List;

public class Board {

    String boardRepresentation() {
        StringBuffer buf = new StringBuffer();
        for (Location l : squares()) {
            buf.append(l.current.representation.substring(0, 1));
        }
        return buf.toString();
    }

    private List<Location> squares() {
        // No implementation needed
        return null;
    }


}
