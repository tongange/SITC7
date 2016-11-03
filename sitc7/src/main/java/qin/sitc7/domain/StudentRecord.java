package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class StudentRecord implements SuperEntity7<Short>
{
    //region constructor
    public StudentRecord()
    {
        SitcPrint.print7.prints("ini StudentRecord class");
    }

    public StudentRecord(String studentRecordName)
    {
        this.studentRecordName = studentRecordName;
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

    //region recordName
    private String studentRecordName;

    public String getStudentRecordName()
    {
        return studentRecordName;
    }

    public void setStudentRecordName(String studentRecordName)
    {
        this.studentRecordName = studentRecordName;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StudentRecord{");
        sb.append("id=").append(id);
        sb.append(", studentRecordName='").append(studentRecordName).append('\'');
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