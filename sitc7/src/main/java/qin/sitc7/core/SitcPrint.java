package qin.sitc7.core;

import qin.javaee7.core.JavaEE7Print;

/**
 * 输出类
 *
 * @author qinzhengying
 * @since 1.7
 */
public class SitcPrint extends JavaEE7Print
{
    public static final String logLocation = "D:\\idea2016WK\\SITC7\\sitc7\\src\\resources\\log4j.properties";

    private static final long serialVersionUID = 3488114197314639970L;

    public SitcPrint(String log4jLocation)
    {
        super(logLocation);
    }

    public static final SitcPrint print7 = new SitcPrint(logLocation);
}