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

    //region iniVariables

    //region grade
    public static String grade1 = "一年级";

    public static String grade2 = "二年级";

    public static String grade3 = "三年级";

    public static String grade4 = "四年级";
    //endregion

    //region xi
    public static String computX = "计算机系";

    public static String networkX = "网络系";

    public static String huagongX = "化工系";

    public static String zhubaoX = "珠宝系";

    public static String swX = "商务系";
    //endregion

    public static String sitcSchool = "上海信息技术学校";

    //endregion
}


















