package qin.sitc7.test;

import org.junit.Test;
import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.domain.Student;
import qin.sitc7.domain.StudentCampus;
import qin.sitc7.domain.StudentGender;
import qin.sitc7.domain.StudentMajor;
import qin.sitc7.domain.StudentNativePlace;
import qin.sitc7.domain.StudentPoliticalStatus;
import qin.sitc7.domain.StudentRecord;

import static qin.sitc7.core.SitcPrint.print7;
import static qin.sitc7.core.SitcTools.computX;
import static qin.sitc7.core.SitcTools.getTime;
import static qin.sitc7.core.SitcTools.grade4;
import static qin.sitc7.core.SitcTools.swX;

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

    @Test
    public void saveStudent1()
    {
        short short1 = 3;
        StudentMajor m1 = (StudentMajor) session.get(StudentMajor.class, short1);
        short short2 = 1;
        StudentPoliticalStatus sps1 = (StudentPoliticalStatus) session.get(StudentPoliticalStatus.class, short2);
        short short3 = 1;
        StudentRecord sr1 = (StudentRecord) session.get(StudentRecord.class, short3);
        Long l1 = 2l;
        StudentCampus sc1 = (StudentCampus) session.get(StudentCampus.class, l1);
        Long l2 = 1l;
        StudentNativePlace sp1 = (StudentNativePlace) session.get(StudentNativePlace.class, l2);
        Object _debug = 0;

        Student s1 = new Student
                  (
                            21000029, "朱新杰", "",
                            grade4, swX, m1,
                            "提速", sr1, sc1,
                            "三年", false, true,
                            48, "103G01", "104001",
                            getTime(2010, 9, 1), getTime(2013, 7, 1), "",
                            "汉族", sps1, getTime(1994, 9, 28),
                            310228199409282615l, sp1,
                            "已婚", StudentGender.BOY, "",
                            "金山区枫泾镇兴塔小区兰兴路200弄2040号", "021-57362076", ""
                  );

        saveObjs(s1);
    }

    @Test
    public void saveStudent2()
    {
        short short3 = 1;
        StudentRecord sr1 = (StudentRecord) session.get(StudentRecord.class, short3);
        Long l1 = 2l;
        StudentCampus sc1 = (StudentCampus) session.get(StudentCampus.class, l1);
        Long l2 = 1l;
        StudentNativePlace sp1 = (StudentNativePlace) session.get(StudentNativePlace.class, l2);
        short short2 = 2;
        StudentPoliticalStatus sps1 = (StudentPoliticalStatus) session
                  .get(StudentPoliticalStatus.class, short2);

        short id = 2;
        StudentMajor m2 = (StudentMajor) session.get(StudentMajor.class, id);

        Student s2 = new Student
                  (
                            21000183, "秦江涛", "",
                            grade4, computX, m2,
                            ".NET编程", sr1, sc1,
                            "四年", false, true,
                            15, "104L01", "104005",
                            getTime(2010, 9, 1), getTime(2014, 7, 1), "",
                            //                                  birthDate
                            "汉族", sps1, getTime(1995, 8, 30),
                            500235199508308197l, sp1,
                            "未婚", StudentGender.BOY, "",
                            "奉贤区青村镇吴家村147号", "021-57560975", ""
                  );

        saveObjs(s2);
    }

    @Test
    public void deleteStudent()
    {
        Student s = (Student) session.get(Student.class, new Integer(3));
        session.delete(s);
        s = (Student) session.get(Student.class, new Integer(4));
        session.delete(s);
        s = (Student) session.get(Student.class, new Integer(5));
        session.delete(s);
    }

    @Test
    public void allSave()
    {
        saveS();
        saveNative();
        saveStudent1();
        saveStudent2();
    }

    @Test public void search1() {
        Student s = (Student) session.get(Student.class, new Integer(1));
        print7.prints(s.getStudentName() + '\t' + s.getStudentEmail() + '\t' + s.getStudentId());
    }
}












