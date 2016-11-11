package qin.sitc7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;
import qin.sitc7.domain.Student;
import qin.sitc7.service.StudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping(value = "showStudent") public ModelAndView showStudent(HttpServletRequest request, String studentName) {
        request.setAttribute("studentName", studentName);

        return new ModelAndView("/stdDetail/showStudent");
    }
    //endregion

    //region loginStudent
    /** loginStudent */
    @RequestMapping(value = "/loginStudent") public void loginStudent(HttpServletResponse response, Student student) {
        String stuName = "";
        String stuEmail = "";
        Integer stuId = 0;
        String h5_stuId = "";
        String msg = "";

        try {
            stuName = student.getStudentName();
            stuEmail = student.getStudentEmail();
            h5_stuId = student.getH5_stuId();

            //put in database to search
            if (h5_stuId.matches("[0-9]*") && stuEmail.contains("@")) {
                msg = studentService
                        .login(stuName.trim(), stuEmail.trim(), Integer.valueOf(h5_stuId.trim()));
                returnJson(msg + stuName, response);
            } else {
                returnJson("stuId neccessary be number!", response);
            }

            actionFlag = true;
        } catch(Exception ex) {
            actionFlag = false;
        } finally {
            doCheck(actionFlag);
        }
    }
    //endregion
}






































