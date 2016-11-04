package qin.sitc7.test;

import org.junit.Test;
import qin.sitc7.domain.CourseType;
import qin.sitc7.domain.StudentCourse;

import java.util.HashMap;
import java.util.Map;

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
        String[] id = new String[]
                  {};
        Integer[] courseId = new Integer[]
                  {};
        String[] courseCode = new String[]
                  {};
        String[] courseName = new String[]
                  {};
        CourseType[] courseTypes = new CourseType[]
                  {};
        Double[] courseCredit = new Double[]
                  {};
        Double[] courseFinalExam = new Double[]
                  {};
        Double[] courseResit = new Double[]
                  {};
        Double[] courseFinalScore = new Double[]
                  {};
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2010-2011", 2);

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
                  {};
        Integer[] courseId = new Integer[]
                  {};
        String[] courseCode = new String[]
                  {};
        String[] courseName = new String[]
                  {};
        CourseType[] courseTypes = new CourseType[]
                  {};
        Double[] courseCredit = new Double[]
                  {};
        Double[] courseFinalExam = new Double[]
                  {};
        Double[] courseResit = new Double[]
                  {};
        Double[] courseFinalScore = new Double[]
                  {};
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2011-2012", 1);

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
                  {};
        Integer[] courseId = new Integer[]
                  {};
        String[] courseCode = new String[]
                  {};
        String[] courseName = new String[]
                  {};
        CourseType[] courseTypes = new CourseType[]
                  {};
        Double[] courseCredit = new Double[]
                  {};
        Double[] courseFinalExam = new Double[]
                  {};
        Double[] courseResit = new Double[]
                  {};
        Double[] courseFinalScore = new Double[]
                  {};
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2011-2012", 2);

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }
    //endregion

    //region courseTerm.put("2012-2013", 1);

    /**
     * courseTerm.put("2012-2013", 1);
     */
    @Test
    public void saveCourse5()
    {
        String[] id = new String[]
                  {};
        Integer[] courseId = new Integer[]
                  {};
        String[] courseCode = new String[]
                  {};
        String[] courseName = new String[]
                  {};
        CourseType[] courseTypes = new CourseType[]
                  {};
        Double[] courseCredit = new Double[]
                  {};
        Double[] courseFinalExam = new Double[]
                  {};
        Double[] courseResit = new Double[]
                  {};
        Double[] courseFinalScore = new Double[]
                  {};
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2012-2013", 1);

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }
    //endregion

    //region courseTerm.put("2012-2013", 2);

    /**
     * courseTerm.put("2012-2013", 2);
     */
    @Test
    public void saveCourse6()
    {
        String[] id = new String[]
                  {};
        Integer[] courseId = new Integer[]
                  {};
        String[] courseCode = new String[]
                  {};
        String[] courseName = new String[]
                  {};
        CourseType[] courseTypes = new CourseType[]
                  {};
        Double[] courseCredit = new Double[]
                  {};
        Double[] courseFinalExam = new Double[]
                  {};
        Double[] courseResit = new Double[]
                  {};
        Double[] courseFinalScore = new Double[]
                  {};
        Map<String, Integer> courseTerm = new HashMap<>();
        courseTerm.put("2012-2013", 2);

        saveStudent(id, courseId, courseCode, courseName, courseTypes, courseCredit, courseFinalExam, courseResit, courseFinalScore, courseTerm);
    }
    //endregion

    //endregion

}

































