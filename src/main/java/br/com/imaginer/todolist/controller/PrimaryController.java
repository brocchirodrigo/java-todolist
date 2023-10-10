package br.com.imaginer.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class PrimaryController {

  @GetMapping("/")
  public String Message() {
    return "Funcionou";
  }
}
