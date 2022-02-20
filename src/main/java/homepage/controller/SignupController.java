package homepage.controller;

import homepage.dto.MembersDTO;
import homepage.service.SignupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
@Log4j2
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class SignupController {
    private final SignupService service; //final로 선언

    @GetMapping("/signup")
    public String signup(MembersDTO dto, Model model) {
        return "signup";
    }

    @PostMapping("/signup")
    public String signupPost(MembersDTO dto, RedirectAttributes redirectAttributes) {
        try
        {
            service.registerMembers(dto);
        }
        catch(Exception e)
        {

        }
        return "redirect:/signin";
    }
}
