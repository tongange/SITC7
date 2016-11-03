package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class StudentPoliticalStatus implements SuperEntity7<Short>
{
    //region constructor
    public StudentPoliticalStatus()
    {
        SitcPrint.print7.prints("ini StudentPoliticalStatus class");
    }

    public StudentPoliticalStatus(String studentPoliticalStatusName)
    {
        this.studentPoliticalStatusName = studentPoliticalStatusName;
    }
    //endregion

    //region id
    private Short id;

    @Override
    public Short getId()
    {
        return id;
    }

    @Override
    public void setId(Short id)
    {
        this.id = id;
    }
    //endregion

    //region status
    private String studentPoliticalStatusName;

    public String getStudentPoliticalStatusName()
    {
        return studentPoliticalStatusName;
    }

    public void setStudentPoliticalStatusName(String studentPoliticalStatusName)
    {
        this.studentPoliticalStatusName = studentPoliticalStatusName;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StudentPoliticalStatus{");
        sb.append("id=").append(id);
        sb.append(", studentPoliticalStatusName='").append(studentPoliticalStatusName).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //endregion

    //region studentSet
    private Set<Student> studentSet = new HashSet<>();

    public Set<Student> getStudentSet()
    {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet)
    {
        this.studentSet = studentSet;
    }
    //endregion
}