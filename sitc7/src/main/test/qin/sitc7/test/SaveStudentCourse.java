package qin.sitc7.test;

import org.junit.Test;
import qin.sitc7.domain.CourseType;
import qin.sitc7.domain.StudentCourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static qin.sitc7.domain.CourseType.arbitraryElective;
import static qin.sitc7.domain.CourseType.limitedElective;
import static qin.sitc7.domain.CourseType.professionalRequired;
import static qin.sitc7.domain.CourseType.publicElective;

@SuppressWarnings("all")
public class SaveStudentCourse extends SitcBaseTest
{
    private static final long serialVersionUID = -3190822100859863142L;

    private void saveStudent(String[] id, Integer[] courseId, String[] courseCode, String[] courseName, CourseType[] courseTypes, Double[] courseCredit, Double[] courseFinalExam, Double[] courseResit, Double[] courseFinalScore, Map<String, Integer> courseTerm)
    {
        for (int i = 0; i < courseFinalExam.length; i++)
        {
            StudentCourse sc = new StudentCourse();
            sc.setId(id[i]);
            sc.setCourseId(courseId[i]);
            sc.setCourseCode(courseCode[i]);
            sc.setCourseName(courseName[i]);
            sc.setCourseClassify(courseTypes[i]);
            sc.setCourseCredit(courseCredit[i]);
            sc.setCourseFinalExam(courseFinalExam[i]);
            sc.setCourseResit(courseResit[i]);
            sc.setCourseFinalScore(courseFinalScore[i]);
            sc.setCourseTerm(courseTerm);

            session.save(sc);
        }
    }

    private void printIds(Integer[] courseId, String[] courseCode, String[] courseName, List<String> idList)
    {
        for (int i = 0; i < courseName.length; i++)
        {
            idList.add(courseCode[i] + "——" + courseId[i] + "——" + courseName[i]);
        }

        for (Iterator<String> sIt = idList.iterator(); sIt.hasNext(); )
        {
            System.out.println("\"" + sIt.next() + "\",\n");
        }
    }

    //region saveStudentCourse
    @Test
    public void saveStudentCourse1()
    {
        //0299	D0022002B	信息技术基础实习	专业必修	1.5		95		95	4
        StudentCourse s1 = new StudentCourse();
        //课程代码————课程序号——课程名称
        s1.setId("D0022002B-0299-信息技术基础实习");
        s1.setCourseId(299);
        s1.setCourseCode("D0022002B");
        s1.setCourseName("信息技术基础实习");
        s1.setCourseClassify(professionalRequired);
        s1.setCourseCredit(1.5d);
        s1.setCourseFinalExam(195d);
        s1.setCourseResit(null);
        s1.setCourseFinalScore(95d);
        Map<String, Integer> s1_courseTerm = new HashMap<>();
        s1_courseTerm.put("2010-2011", 1);
        s1.setCourseTerm(s1_courseTerm);

        session.save(s1);
    }

    @Test
    public void batchSaveStudent()
    {
        //课程代码————课程序号——课程名称
        String[] id = new String[]
                  {
                            "299——D0022002B——信息技术基础实习",
                            "411——G0021001B——经济政治与社会",
                            "155——G0023001B——主题教育(1)",
                            "107——G0023012B——假期实践(1)",
                            "473——A0021001B——体育(1)",
                            "443——A0021007B——体锻达标(1)",
                            "283——A0022015B——英语(1)",
                            "363——G0022004B——德育践行(1)",
                            "379——G0021013B——心理健康",
                            "251——D0022001B——信息技术基础",
                            "59——G0023006B——公益劳动(1)",
                            "347——G0022001B——新生入学教育",
                            "331——A0022007B——语文(1)",
                            "185——A0023002B——硬笔书法",
                            "209——D0024001B——信息技术特长",
                            "315——G0022002B——行为礼仪教育",
                            "235——A0022001B——数学(1)"
                  };
        Integer[] courseId = new Integer[]
                  {
                            299, 411, 155, 107,
                            473, 443, 283, 363,
                            379, 251, 59, 347,
                            331, 185, 209, 315,
                            235
                  };
        String[] courseCode = new String[]
                  {
                            "D0022002B", "G0021001B", "G0023001B", "G0023012B",
                            "A0021001B", "A0021007B", "A0022015B", "G0022004B",
                            "G0021013B", "D0022001B", "G0023006B", "G0022001B",
                            "A0022007B", "A0023002B", "D0024001B", "G0022002B",
                            "A0022001B"
                  };
        String[] courseName = new String[]
                  {
                            "信息技术基础实习", "经济政治与社会", "主题教育(1)", "假期实践(1)",
                            "体育(1)", "体锻达标(1)", "英语(1)", "德育践行(1)",
                            "心理健康", "信息技术基础", "公益劳动(1)", "新生入学教育",
                            "语文(1)", "硬笔书法", "信息技术特长", "行为礼仪教育",
                            "数学(1)"
                  };
        CourseType[] courseTypes = new CourseType[]
                  {
                            professionalRequired, publicElective, limitedElective, limitedElective,
                            publicElective, publicElective, professionalRequired, professionalRequired,
                            publicElective, professionalRequired, limitedElective, professionalRequired,
                            professionalRequired, limitedElective, limitedElective, professionalRequired,
                            professionalRequired
                  };
        Double[] courseCredit = new Double[]
                  {
                            1.5d, 2d, 1d, 0.5d,
                            1d, 1d, 6d, 1d,
                            2d, 4d, 0.5d, 2d,
                            6d, 2d, 2d, 1d,
                            6d
                  };
        Double[] courseFinalExam = new Double[]
                  {
                            95d, 58d, 92d, 85d,
                            50d, 45d, 81d, 90d,
                            77d, 95d, 95d, 90d,
                            68d, 75d, 70d, 90d,
                            81d

                  };
        Double[] courseResit = new Double[]
                  {
                            null, 60d, null, null,
                            null, null, null, null,
                            null, null, null, null,
                            null, null, null, null,
                            null
                  };
        Double[] courseFinalScore = new Double[]
                  {
                            95d, 60d, 92d, 85d,
                            60d, 60d, 92d, 90d,
                            77d, 95d, 95d, 90d,
                            65d, 75d, 70d, 90d,
                            76d

                  };
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2010-2011", 1);

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);

    }
    //endregion

    //region save2

    //region courseTerm.put("2010-2011", 2);

    /**
     * courseTerm.put("2010-2011", 2);
     */
    @Test
    public void saveCourse2()
    {
        //课程代码————课程序号——课程名称
        String[] id = new String[]
                  {
                            "G0022003B——135——素质拓展教育", "A0021002B——1521——体育（2）", "G0022005B——119——德育践行（2）",
                            "G0024074B——361——音乐欣赏", "A0022023B——188——英语（2）", "A0021008B——228——体锻达标（2）",
                            "A0022022B——170——语文（2）", "C0023001B——45——物理", "G0023007B——59——公益劳动（2）",
                            "C0022001B——95——金工实习", "G0021002B——1017——哲学与人生", "A0022021B——152——数学（2）",
                            "G0023013B——29——假期实践（2）", "E0023001B——38——化学", "G0023002B——13——主题教育（2）"
                  };
        Integer[] courseId = new Integer[]
                  {
                            135, 1521, 119, 361,
                            188, 228, 170, 45,
                            59, 95, 1017, 152,
                            29, 38, 13
                  };
        String[] courseCode = new String[]
                  {
                            "G0022003B", "A0021002B", "G0022005B", "G0024074B",
                            "A0022023B", "A0021008B", "A0022022B", "C0023001B",
                            "G0023007B", "C0022001B", "G0021002B", "A0022021B",
                            "G0023013B", "E0023001B", "G0023002B"
                  };
        String[] courseName = new String[]
                  {
                            "素质拓展教育", "体育（2）", "德育践行（2）", "音乐欣赏",
                            "英语（2）", "体锻达标（2）", "语文（2）", "物理",
                            "公益劳动（2）", "金工实习", "哲学与人生", "数学（2）",
                            "假期实践（2）", "化学", "主题教育（2）"

                  };
        CourseType[] courseTypes = new CourseType[]
                  {
                            professionalRequired, publicElective,
                            professionalRequired, arbitraryElective,
                            professionalRequired, publicElective,
                            professionalRequired, limitedElective,
                            limitedElective, professionalRequired,
                            publicElective, professionalRequired,
                            limitedElective, limitedElective,
                            limitedElective
                  };
        Double[] courseCredit = new Double[]
                  {
                            2d, 1d, 1d, 1d,
                            6d, 1d, 6d, 2d,
                            0.5d, 1.5d, 2d, 6d,
                            0.5d, 2d, 1d
                  };
        Double[] courseFinalExam = new Double[]
                  {
                            90d, 60d, 85d, 83d,
                            82d, 60d, 65d, 90d,
                            85d, 60d, 79d, 72d,
                            90d, 81d, 85d
                  };
        Double[] courseResit = new Double[]
                  {
                            null, null, null, null,
                            null, null, null, null,
                            null, null, null, null,
                            null, null, null
                  };
        Double[] courseFinalScore = new Double[]
                  {
                            90d, 60d, 85d, 83d,
                            92d, 60d, 65d, 90d,
                            85d, 60d, 79d, 76d,
                            90d, 81d, 85d
                  };
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2010-2011", 2);

        List<String> idList = new ArrayList<>();

        //课程代码————课程序号——课程名称
        printIds(courseId, courseCode, courseName, idList);

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }

    //endregion

    //region courseTerm.put("2011-2012", 1);

    /**
     * courseTerm.put("2011-2012", 1);
     */
    @Test
    public void saveCourse3()
    {
        String[] id = new String[]
                  {
                            "G0024069B——62——硬笔书法",
                            "DL022011B——975——C程序设计实习",
                            "G0021007B——980——职业生涯规划",
                            "DL022004B——974——数据库原理与应用",
                            "DL022003B——973——C程序设计",
                            "G0023008B——982——公益劳动（3）",
                            "DL022002B——972——沟通与交流（1）",
                            "G0023003B——981——主题教育（3）",
                            "DL022001B——971——计算机英语(1)",
                            "D0022003B——970——计算机组装与维护",
                            "G0022006B——969——德育践行（3）",
                            "A0021009B——979——体锻达标（3）",
                            "G0022010B——977——专业入门教育",
                            "G0022012B——976——劳动教育（1）"
                  };
        Integer[] courseId = new Integer[]
                  {
                            62, 975, 980, 974,
                            973, 982, 972, 981,
                            971, 970, 969, 979,
                            977, 976
                  };
        String[] courseCode = new String[]
                  {
                            "G0024069B", "DL022011B", "G0021007B", "DL022004B",
                            "DL022003B", "G0023008B", "DL022002B", "G0023003B",
                            "DL022001B", "D0022003B", "G0022006B", "A0021009B",
                            "G0022010B", "G0022012B"
                  };
        String[] courseName = new String[]
                  {
                            "硬笔书法", "C程序设计实习", "职业生涯规划", "数据库原理与应用",
                            "C程序设计", "公益劳动（3）", "沟通与交流（1）", "主题教育（3）",
                            "计算机英语(1)", "计算机组装与维护", "德育践行（3）", "体锻达标（3）",
                            "专业入门教育", "劳动教育（1）"
                  };
        CourseType[] courseTypes = new CourseType[]
                  {
                            arbitraryElective, professionalRequired,
                            publicElective, professionalRequired,
                            professionalRequired, limitedElective,
                            professionalRequired, limitedElective,
                            professionalRequired, professionalRequired,
                            professionalRequired, publicElective,
                            professionalRequired, professionalRequired
                  };
        Double[] courseCredit = new Double[]
                  {
                            1d, 1.5d, 2d, 5d,
                            6d, 0.5d, 2d,
                            1d, 2d, 2d, 1d,
                            1d, 1.5d, 1.5d
                  };
        Double[] courseFinalExam = new Double[]
                  {
                            74d, 83d, 84d, 75d,
                            69d, 83d, 90d, 89d,
                            92d, 76d, 90d, 60d,
                            98d, 85d
                  };
        Double[] courseResit = new Double[]
                  {
                            null, null, null, null,
                            null, null, null, null,
                            null, null, null, null,
                            null, null
                  };
        Double[] courseFinalScore = new Double[]
                  {
                            74d, 83d, 84d, 75d,
                            69d, 83d, 90d, 89d,
                            92d, 76d, 90d, 60d,
                            98d, 85d
                  };
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2011-2012", 1);

        //printIds(courseId, courseCode, courseName, new ArrayList<String>());

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }
    //endregion

    //region courseTerm.put("2011-2012", 2);

    /**
     * courseTerm.put("2011-2012", 2);
     */
    @Test
    public void saveCourse4()
    {
        String[] id = new String[]
                  {
                            "DL022005B——780——动态网页制作实习",
                            "G0023004B——791——主题教育（4）",
                            "G0023009B——790——公益劳动（4）",
                            "A0021004B——1397——体育（4）",
                            "G0021010B——789——职业道德与法律",
                            "G0022007B——779——德育践行（4）",
                            "G0024063B——218——美文欣赏",
                            "G0023014B——792——假期实践（3）",
                            "G0024076B——215——影视鉴赏",
                            "DL022008B——783——软件工程",
                            "DL022009B——784——程序员基础",
                            "G0024093B——222——桌游(高级班)",
                            "DL022006B——781——计算机英语(2)",
                            "G0024069B——223——硬笔书法",
                            "DL022007B——782——沟通与交流（2）",
                            "A0021010B——788——体锻达标（4）",
                            "DL022010B——785——数据结构",
                            "G0022013B——786——劳动教育（2）"
                  };
        Integer[] courseId = new Integer[]
                  {
                            780, 791, 790, 1397,
                            789, 779, 218, 792,
                            215, 783, 784, 222,
                            781, 223, 782, 788,
                            785, 786
                  };
        String[] courseCode = new String[]
                  {
                            "DL022005B", "G0023004B", "G0023009B", "A0021004B",
                            "G0021010B", "G0022007B", "G0024063B", "G0023014B",
                            "G0024076B", "DL022008B", "DL022009B", "G0024093B",
                            "DL022006B", "G0024069B", "DL022007B", "A0021010B",
                            "DL022010B", "G0022013B"
                  };
        String[] courseName = new String[]
                  {
                            "动态网页制作实习", "主题教育（4）", "公益劳动（4）", "体育（4）",
                            "职业道德与法律", "德育践行（4）", "美文欣赏", "假期实践（3）",
                            "影视鉴赏", "软件工程", "程序员基础", "桌游(高级班)",
                            "计算机英语(2)", "硬笔书法", "沟通与交流（2）", "体锻达标（4）",
                            "数据结构", "劳动教育（2）"
                  };
        CourseType[] courseTypes = new CourseType[]
                  {
                            professionalRequired, limitedElective,
                            limitedElective, publicElective,
                            publicElective, professionalRequired,
                            arbitraryElective, limitedElective,
                            arbitraryElective, professionalRequired,
                            professionalRequired, arbitraryElective,
                            professionalRequired, arbitraryElective,
                            professionalRequired, publicElective,
                            professionalRequired, professionalRequired
                  };
        Double[] courseCredit = new Double[]
                  {
                            3d, 1d, 0.5d, 1d,
                            2d, 1d, 1d, 0.5d,
                            1d, 3d, 4d, 1d,
                            2d, 1d, 2d, 1d,
                            6d, 1.5d
                  };
        Double[] courseFinalExam = new Double[]
                  {
                            84d, 88d, 91d, 42d,
                            77d, 90d, 96d, 95d,
                            90d, 67d, 60d, 100d,
                            90d, 96d, 72d, 45d,
                            60d, 95d
                  };
        Double[] courseResit = new Double[]
                  {
                            null, null, null, 60d,
                            null, null, null, null,
                            null, null, null, null,
                            null, null, null, 60d,
                            null, null
                  };
        Double[] courseFinalScore = new Double[]
                  {
                            84d, 88d, 91d, 60d,
                            77d, 90d, 96d, 95d,
                            90d, 67d, 60d, 100d,
                            90d, 96d, 72d, 60d,
                            60d, 95d
                  };
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2011-2012", 2);

        //printIds(courseId, courseCode, courseName, new ArrayList<String>());

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }
    //endregion

    //endregion

    @Test
    public void saveAll()
    {
        batchSaveStudent();
        saveCourse2();
        saveCourse3();
        saveCourse4();
    }

}

































