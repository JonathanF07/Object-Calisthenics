package wrapAllPrimitivesAndStrings.good;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hour {

    public String hour;

    public String buildHour(Date hour) {
        DateFormat df = new SimpleDateFormat("hh:'00' a");
        return df.format(hour);
    }

}
