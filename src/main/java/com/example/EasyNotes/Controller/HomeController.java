package com.example.EasyNotes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @GetMapping("/addNotes")
    public String addNotes()
    {
        return "add_notes";
    }

    @GetMapping("/editNotes")
    public String editNotes()
    {
        return "edit_notes";
    }

    @GetMapping("/viewNotes")
    public String viewNotes()
    {
        return "view_notes";
    }
}
