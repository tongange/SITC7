package qin.sitc7.test;

import org.junit.Test;
import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.domain.StudentCampus;
import qin.sitc7.domain.StudentMajor;
import qin.sitc7.domain.StudentNativePlace;
import qin.sitc7.domain.StudentPoliticalStatus;
import qin.sitc7.domain.StudentRecord;

public class SaveStudent extends SitcBaseTest
{
    @Test
    public void saveS()
    {
        StudentCampus sc0 = new StudentCampus("上海宏教学院");
        StudentCampus sc1 = new StudentCampus("上海信息技术学校");
        StudentMajor sm0 = new StudentMajor("软件工程", "学习java和.net开发");
        StudentMajor sm1 = new StudentMajor("网络管理", "学习如何成功地管理网络并且能够阻止迅雷等程序");
        StudentPoliticalStatus ss1 = new StudentPoliticalStatus("群众");
        StudentPoliticalStatus ss2 = new StudentPoliticalStatus("团员");
        StudentRecord sr1 = new StudentRecord("中专");
        StudentRecord sr2 = new StudentRecord("大专");
        StudentRecord sr3 = new StudentRecord("本科");

        saveObjs(sc0, sc1, sm0, sm1, ss1, ss2, sr1, sr2, sr3);
    }

    @Test
    public void saveNative()
    {
        String[] natives = new String[]
                  {
                            "中国",
                            "美国",
                            "英国",
                            "澳大利亚",
                            "加拿大",
                            "新西兰",
                            "俄罗斯",
                            "乌克兰",
                            "白俄罗斯",
                            "德国",
                            "法国",
                            "日本",
                            "韩国",
                            "新加坡",
                            "马来西亚",
                            "挪威",
                            "瑞典",
                            "芬兰"
                  };

        for (int i = 0; i < natives.length; i++)
        {
            StudentNativePlace sp = new StudentNativePlace(natives[i]);
            session.save(sp);
        }
    }

    @Test
    public void updStudent()
    {
    }

    //region save
    private void saveObjs(SuperEntity7... s)
    {
        for (int i = 0; i < s.length; i++)
        {
            session.save(s[i]);
        }
    }
    //endregion
}












