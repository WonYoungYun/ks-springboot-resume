package kr.ac.springboot.term.resume;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {

    @GetMapping("/")
    public String resumeIndex(Model model) {
        Resume resume = new Resume();
        resume.setName("YourName");
        model.addAttribute("resume", resume);
        return "index";
    }

    // experience


}
