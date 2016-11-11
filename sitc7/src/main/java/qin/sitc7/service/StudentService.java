package qin.sitc7.service;

import qin.javaee7.core.JavaEE7BaseSupport;
import qin.javaee7.core.exceptions.JavaEE7Exception;
import qin.sitc7.dao.StudentDAO;
import qin.sitc7.domain.Student;

import java.util.List;

@SuppressWarnings("all")
public interface StudentService extends JavaEE7BaseSupport
{
    //region getStudentDAO
    StudentDAO getStudentDAO();
    //endregion

    //region findAll
    List<Student> findAll();
    //endregion

    //region login
    String login(String stuName, String stuEmail, Integer stuId) throws JavaEE7Exception;
    //endregion
}