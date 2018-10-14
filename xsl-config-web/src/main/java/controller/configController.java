package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class configController {

    @RequestMapping("/")
    @ResponseBody
    String index(){
        return "xsl-config";
    }

}
