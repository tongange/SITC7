package qin.sitc7.core;

import java.util.Calendar;
import java.util.Date;

import static qin.sitc7.core.SitcPrint.print7;

public final class SitcTools
{
    //region constructor and instance
    private SitcTools()
    {

    }

    /**
     * singleton
     */
    public static final SitcTools sitc_INSTANCE = new SitcTools();
    //endregion

    //region makeSaveCampusCode
    public static StringBuilder writeSaveCampus(String[] campusName)
    {
        StringBuilder _java = new StringBuilder();

        for (int i = 0; i < campusName.length; i++)
        {
            print7.prints("StudentCampus sc" + i + " = new StudentCampus(\"" + campusName[i] + "\");");
        }

        return _java;
    }
    //endregion

    //region getTime
    public static final Date getTime(int year, int month, int day)
    {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);

        return c.getTime();
    }
    //endregion
}