package com.example.newadmin.admincontroller;

import com.example.newadmin.domain.PtFuwu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Controller
public class logincontroller {

    @GetMapping("/admin")
    public String list()
    {
        return "login.html";
    }
}
