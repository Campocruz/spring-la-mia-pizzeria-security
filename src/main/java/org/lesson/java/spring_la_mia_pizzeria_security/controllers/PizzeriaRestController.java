package org.lesson.java.spring_la_mia_pizzeria_security.controllers;

import java.util.List;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Pizza;
import org.lesson.java.spring_la_mia_pizzeria_security.services.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pizze")
public class PizzeriaRestController {

  @Autowired
  private PizzeriaService pizzeriaService;

  @GetMapping
  public List<Pizza> index() {
    return pizzeriaService.findAllPizza();
  }

  @GetMapping("/find")
  public List<Pizza> find(@RequestParam(value = "find", defaultValue = "") String find) {
    return pizzeriaService.getPizzeByContaining(find);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Pizza> show(@PathVariable Integer id) {

    if (!pizzeriaService.existPizzaById(id)) {
      return new ResponseEntity<Pizza>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(pizzeriaService.getByIdPizza(id), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Pizza> store(@Valid @RequestBody Pizza pizza) {
    return new ResponseEntity<Pizza>(pizzeriaService.savePizza(pizza), HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Pizza> update(@Valid @RequestBody Pizza pizza, @PathVariable Integer id) {
    pizza.setId(id);
    if (!pizzeriaService.existPizzaById(id)) {
      return new ResponseEntity<Pizza>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<Pizza>(pizzeriaService.savePizza(pizza), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Pizza> delete(@PathVariable Integer id) {
    if (!pizzeriaService.existPizzaById(id)) {
      return new ResponseEntity<Pizza>(HttpStatus.NOT_FOUND);
    }
    pizzeriaService.deleteByIdPizza(id);
    return new ResponseEntity<Pizza>(HttpStatus.OK);
  }
}
