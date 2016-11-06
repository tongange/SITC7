package qin.sitc7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;
import qin.sitc7.domain.Student;
import qin.sitc7.service.StudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping(value = "/stdDetail")
@SuppressWarnings("all")
public class StdDetailController extends JavaEE7BaseController
{
    private static final long serialVersionUID = 66838503104859456L;

    //region service
    private StudentService studentService;

    public StudentService getStudentService()
    {
        return studentService;
    }

    @Resource
    public void setStudentService(StudentService studentService)
    {
        this.studentService = studentService;
    }
    //endregion

    //region Action Base Path
    private final String basePath = "/stdDetail/";
    //endregion

    //region doMainView
    @RequestMapping(value = "/doMainView")
    @Override
    public ModelAndView doMainView()
    {
        return new ModelAndView(basePath + "doMainView");
    }
    //endregion

    //region showStudent
    @RequestMapping(value = "showStudent") public void showStudent(HttpServletResponse response) {
        List<Student> studentList = null;

        try {
            studentList = studentService.findAll();

                      actionFlag = true;
                  } catch(Exception ex) {
                      actionFlag =false;
                  } finally {
                      doCheck(actionFlag);
                  }
    }
    //endregion
}






































