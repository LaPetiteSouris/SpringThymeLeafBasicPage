import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import user.User;

import javax.validation.Valid;

/**
 * Created by tung on 7/14/15.
 */
@Controller
public class EmailController {
    private User user = new User();

    @RequestMapping(value = "/email_form", method = RequestMethod.GET)
    public String showForm(User user) {
        return "email_form";
    }

    @RequestMapping(value = "/done", method = RequestMethod.GET)
    public ModelAndView showResult() {
        ModelAndView result = new ModelAndView("done");
        result.addObject("user", user);
        return result;
    }

    @RequestMapping(value = "/email_form", method = RequestMethod.POST)
    public ModelAndView checkUserInfo(@Valid User inputuser, BindingResult bindingresult) {
        ModelAndView mav = new ModelAndView();
        if (bindingresult.hasErrors()) {
            mav.setViewName("email_form");
            return mav;
        }
        user = inputuser;
        ModelAndView resultmodel = new ModelAndView("redirect:/done");
        return resultmodel;
    }
}
