package qin.sitc7.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee7.core.hibernate.dao.impl.JavaEE7DAOSupportImpl;
import qin.sitc7.dao.StudentDAO;
import qin.sitc7.domain.Student;

import static qin.sitc7.core.SitcPrint.logLocation;

@Repository(value = "studentDAO7")
public class StudentDAOImpl extends JavaEE7DAOSupportImpl<Student, Integer> implements StudentDAO
{
    private static final long serialVersionUID = -4501304238548572734L;

    //region get log4j file location

    /**
     * if you override this function
     * then you can get your log4j location to special your prints
     *
     * @return
     */
    @Override
    public String getLog4jLocation()
    {
        return logLocation;
    }

    //endregion

    //region get Student class

    @Override
    public Class<Student> getEntityClass()
    {
        return Student.class;
    }

    //endregion
}