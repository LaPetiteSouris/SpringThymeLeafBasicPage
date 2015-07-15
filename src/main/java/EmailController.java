import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import user.User;

import javax.validation.Valid;

/**
 * Created by tung on 7/14/15.
 */
@Controller
public class EmailController {
    @RequestMapping(value="/email_form", method=RequestMethod.GET)
    public String showForm(User user) {
        return "email_form";
    }
    @RequestMapping(value="/email_form", method= RequestMethod.POST)
    public String checkUserInfo(@Valid User user, BindingResult bindingresult)
    {
        if(bindingresult.hasErrors())
        {
            return "email_form";
        }
        return "redirect:/done";
    }
}
