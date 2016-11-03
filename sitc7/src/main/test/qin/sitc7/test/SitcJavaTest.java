package qin.sitc7.test;

import org.junit.Test;

import static qin.sitc7.core.SitcTools.writeSaveCampus;

public class SitcJavaTest
{
    @Test
    public void makeCampus()
    {
        writeSaveCampus(new String[]{
                                  "上海宏教学院", "上海信息技术学校",
                                  "交通大学", "复旦大学",
                                  "上海大学", "曲沃路大学",
                                  "绿卡专用学校", "临汾路小学",
                                  "上海大石学校", "里得学院",
                                  "哈弗大学", "上海南蕴学院"
                        }
        );
    }

    @Test
    public void mathTest()
    {
        int a = 0, b = 0, c = 0, d = 0;

        /*
                a + b = 8
                a + c = 13
                b + d = 8
                c - d = 6

                2a + b + c + b + c = 35
                2a + 2b + 2c = 35

                a + b + c = 17.5
                a + c = 13
                b + 13 = 17.5
                b = 4.5

                a = 3.5
                b = 4.5
                c = 9.5
                d = 3.5
         */
    }
}


















