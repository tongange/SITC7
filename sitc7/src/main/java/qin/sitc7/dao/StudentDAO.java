package qin.sitc7.dao;

import qin.javaee7.core.exceptions.JavaEE7Exception;
import qin.javaee7.core.hibernate.dao.JavaEE7DAOSupport;
import qin.sitc7.domain.Student;

@SuppressWarnings("all")
public interface StudentDAO extends JavaEE7DAOSupport<Student, Integer>
{
    //region login
    String login(String stuName, String stuEmail, Integer stuId) throws JavaEE7Exception;
    //endregion
}