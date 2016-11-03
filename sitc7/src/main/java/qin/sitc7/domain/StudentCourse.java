package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.HashMap;
import java.util.Map;

/**
 * Student Course Entity
 *
 * @author qinzhengying
 * @since 1.7
 */
@SuppressWarnings("all")
public class StudentCourse implements SuperEntity7<String>
{
    //region constructor
    public StudentCourse()
    {
        SitcPrint.print7.prints("ini StudentCourse class");
    }

    public StudentCourse(Integer courseId, String courseCode, String courseName, Double courseCredit, Double courseFinalExam, Double courseResit, Double courseFinalScore)
    {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseFinalExam = courseFinalExam;
        this.courseResit = courseResit;
        this.courseFinalScore = courseFinalScore;
    }
    //endregion

    //region id
    private String id;

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public void setId(String id)
    {
        this.id = id;
    }
    //endregion

    //region courseId
    private Integer courseId;

    public Integer getCourseId()
    {
        return courseId;
    }

    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }
    //endregion

    //region courseCode
    private String courseCode;

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }
    //endregion

    //region courseName
    private String courseName;

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    //endregion

    //region courseClassify
    private CourseType courseClassify;

    public CourseType getCourseClassify()
    {
        return courseClassify;
    }

    public void setCourseClassify(CourseType courseClassify)
    {
        this.courseClassify = courseClassify;
    }
    //endregion

    //region courseCredit
    private Double courseCredit;

    public Double getCourseCredit()
    {
        return courseCredit;
    }

    public void setCourseCredit(Double courseCredit)
    {
        this.courseCredit = courseCredit;
    }
    //endregion

    //region courseFinalExam
    private Double courseFinalExam;

    public Double getCourseFinalExam()
    {
        return courseFinalExam;
    }

    public void setCourseFinalExam(Double courseFinalExam)
    {
        this.courseFinalExam = courseFinalExam;
    }
    //endregion

    //region courseResit
    private Double courseResit;

    public Double getCourseResit()
    {
        return courseResit;
    }

    public void setCourseResit(Double courseResit)
    {
        this.courseResit = courseResit;
    }
    //endregion

    //region courseFinalScore
    private Double courseFinalScore;

    public Double getCourseFinalScore()
    {
        return courseFinalScore;
    }

    public void setCourseFinalScore(Double courseFinalScore)
    {
        this.courseFinalScore = courseFinalScore;
    }
    //endregion

    //region courseTerm
    private Map<String, Integer> courseTerm = new HashMap<>();

    public Map<String, Integer> getCourseTerm()
    {
        return courseTerm;
    }

    public void setCourseTerm(Map<String, Integer> courseTerm)
    {
        this.courseTerm = courseTerm;
    }
    //endregion

    //region toString()

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StudentCourse{");
        sb.append("id='").append(id).append('\'');
        sb.append(", courseId=").append(courseId);
        sb.append(", courseCode='").append(courseCode).append('\'');
        sb.append(", courseName='").append(courseName).append('\'');
        sb.append(", courseCredit=").append(courseCredit);
        sb.append(", courseFinalExam=").append(courseFinalExam);
        sb.append(", courseResit=").append(courseResit);
        sb.append(", courseFinalScore=").append(courseFinalScore);
        sb.append('}');
        return sb.toString();
    }

    //endregion
}