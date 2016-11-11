package qin.sitc7.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee7.core.exceptions.JavaEE7Exception;
import qin.sitc7.dao.StudentDAO;
import qin.sitc7.domain.Student;
import qin.sitc7.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService7")
@Transactional
@SuppressWarnings("all")
public class StudentServiceImpl implements StudentService
{
    private static final long serialVersionUID = -2301281970734801062L;

    //region studentDAO
    private StudentDAO studentDAO;

    @Override
    public StudentDAO getStudentDAO()
    {
        return studentDAO;
    }

    @Resource
    public void setStudentDAO(StudentDAO studentDAO)
    {
        this.studentDAO = studentDAO;
    }
    //endregion

    //region findAll
    @Override
    public List<Student> findAll()
    {
        return studentDAO.loadAll(Student.class);
    }
    //endregion

    //region login

    @Override
    public String login(String stuName, String stuEmail, Integer stuId) throws JavaEE7Exception
    {
        return studentDAO.login(stuName, stuEmail, stuId);
    }

    //endregion
}