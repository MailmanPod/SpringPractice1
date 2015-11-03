package web.sph.prc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.sph.prc1.entity.User;

/**
 * Created by Paradox on 28/10/2015.
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getEntryPointGeneral(Model model){
        ModelAndView mvn = new ModelAndView();
        mvn.addObject("message", "Hello World from general Mapping");
        mvn.setViewName("entrypoint");

        return mvn;
    }

    @RequestMapping(value = "/SpringWeb1", method = RequestMethod.GET)
    public ModelAndView getEntryPointView(Model model){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World from controller!!!");
        mv.setViewName("entrypoint");

        return mv;
    }

    @RequestMapping(value = "/SpringWeb2", method = RequestMethod.GET)
    public ModelAndView getEntryPointViewWeb2(Model model){
        ModelAndView mvn = new ModelAndView();
        mvn.addObject("message", "Hello world from " + this.getClass().getCanonicalName());
        mvn.setViewName("entrypoint");

        return mvn;
    }

    @RequestMapping(value = "/Registration", method = RequestMethod.GET)
    public ModelAndView getUserForm(Model model){
        ModelAndView mvn = new ModelAndView("userForm", "user", new User());
        mvn.addObject("title", "User Registration Form");

        return mvn;
    }

    @RequestMapping(value="/result", method = RequestMethod.POST)
    public ModelAndView processUser(User user){
        ModelAndView mvn = new ModelAndView();
        mvn.addObject("title", "User Data");
        mvn.addObject("u", user);
        mvn.setViewName("userData");

        return mvn;
    }
}
