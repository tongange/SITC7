package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class StudentNativePlace implements SuperEntity7<Long>
{
    //region constructor
    public StudentNativePlace()
    {
        SitcPrint.print7.prints("ini StudentNativePlace class");
    }

    public StudentNativePlace(String studentNativePlaceName)
    {
        this.studentNativePlaceName = studentNativePlaceName;
    }
    //endregion

    //region id
    private Long id;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region studentNativePlaceName
    private String studentNativePlaceName;

    public String getStudentNativePlaceName()
    {
        return studentNativePlaceName;
    }

    public void setStudentNativePlaceName(String studentNativePlaceName)
    {
        this.studentNativePlaceName = studentNativePlaceName;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StudentNativePlace{");
        sb.append("id=").append(id);
        sb.append(", studentNativePlaceName='").append(studentNativePlaceName).append('\'');
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