package io.khasang.restaurant.controller;

import io.khasang.restaurant.model.Cat;
import io.khasang.restaurant.model.Document;
import io.khasang.restaurant.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    private Message message;
    @Autowired
    private Cat cat;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("text1","Мой первый текст без bean");
        model.addAttribute("text2",message.getName());
        model.addAttribute("numChar",message.getVal());
        return "index";
    }

    @RequestMapping("/create")
    public String createTable(Model model){
        model.addAttribute("create",cat.createCatTable());
        return "create";
    }


    @RequestMapping("/list")
    public String getList(Model model){
        List<Document> documentList = new ArrayList<>();
        documentList.add(new Document(3, "Cat"));
        documentList.add(new Document(2, "Dog"));
        model.addAttribute("list", documentList);
        return "list";
    }
}
