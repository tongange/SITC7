package qin.sitc7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;

@Controller
@Scope("prototype")
@RequestMapping(value = "/personGrade")
@SuppressWarnings("all")
public class PersonGradeController extends JavaEE7BaseController
{
    private static final long serialVersionUID = 66838503104859456L;

    private final String basePath = "/personGrade/";

    //region doMainView
    @RequestMapping(value = "/doMainView")
    @Override
    public ModelAndView doMainView()
    {
        return new ModelAndView(basePath + "doMainView");
    }
    //endregion
}