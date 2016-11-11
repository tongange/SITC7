package qin.sitc7.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee7.core.exceptions.JavaEE7Exception;
import qin.javaee7.core.hibernate.dao.impl.JavaEE7DAOSupportImpl;
import qin.sitc7.dao.StudentDAO;
import qin.sitc7.domain.Student;

import java.util.List;

import static qin.sitc7.core.SitcPrint.logLocation;

@Repository(value = "studentDAO7")
@SuppressWarnings("all")
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

    //region login

    @Override
    public String login(String stuName, String stuEmail, Integer stuId) throws JavaEE7Exception
    {
        String result = "";
        String queryString = new StringBuilder()
                    .append("from Student s where ")
                    .append("s.studentName=:stuName ")
                    .append("and s.studentEmail=:stuEmail ")
                    .append("and s.studentId=:stuId").toString();
        String[] paramNames = new String[]{"stuName", "stuEmail", "stuId"};
        Object[] values = new Object[]{stuName, stuEmail, stuId};

        List<Object> search = (List<Object>) findByNamedParam(queryString, paramNames, values);

        if (search.size() == 0) {
            result = str_failed;
            throw new JavaEE7Exception("list empty!");
        } else {
            result = str_success;
        }

        return result;
    }

    //endregion
}













