package site.nfox.jh.jhproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @GetMapping({"","/"})
    public String home(){
        return "redirect:/main";
    }

    @GetMapping("main")
    public void main(){
    }

}
