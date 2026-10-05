package org.lesson.java.spring_la_mia_pizzeria_security.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.lesson.java.spring_la_mia_pizzeria_security.model.Offer;
import org.lesson.java.spring_la_mia_pizzeria_security.model.Pizza;
import org.lesson.java.spring_la_mia_pizzeria_security.services.IngredientsService;
import org.lesson.java.spring_la_mia_pizzeria_security.services.OffersService;
import org.lesson.java.spring_la_mia_pizzeria_security.services.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/pizze")
public class PizzeriaController {

  @Autowired
  private PizzeriaService pizzeriaService;

  @Autowired
  private OffersService offersService;

  @Autowired
  private IngredientsService ingredientsService;

  @GetMapping
  public String index(Model model) {

    List<Pizza> pizze = pizzeriaService.findAllPizza();
    model.addAttribute("pizze", pizze);

    return "pizzeria/index";
  }

  @GetMapping("/cerca")
  public String cerca(@RequestParam(value = "value", defaultValue = "") String value, Model model) {

    List<Pizza> pizze = pizzeriaService.getPizzeByContaining(value);
    model.addAttribute("pizze", pizze);
    return "pizzeria/index";
  }

  @GetMapping("/{id}")
  public String show(@PathVariable String id, Model model) {

    int index = Integer.parseInt(id);
    model.addAttribute("pizza", pizzeriaService.getByIdPizza(index));

    return "pizzeria/detail";
  }

  @GetMapping("/create")
  public String create(Model model) {

    model.addAttribute("pizza", new Pizza());
    model.addAttribute("ingredients", ingredientsService.findAllIngredients());
    return "pizzeria/create";
  }

  @PostMapping("/create")
  public String store(@Valid @ModelAttribute("pizza") Pizza formPizza, BindingResult bindingResults, Model model) {

    if (bindingResults.hasErrors()) {
      model.addAttribute("ingredients", ingredientsService.findAllIngredients());
      return "pizzeria/create";
    }

    pizzeriaService.savePizza(formPizza);
    return "redirect:/pizze";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable("id") Integer id, Model model) {

    model.addAttribute("ingredients", ingredientsService.findAllIngredients());
    model.addAttribute("pizza", pizzeriaService.getByIdPizza(id));
    return "pizzeria/edit";
  }

  @PostMapping("/edit/{id}")
  public String update(@Valid @ModelAttribute("pizza") Pizza formPizza, BindingResult bindingResults, Model model) {

    if (bindingResults.hasErrors()) {
      model.addAttribute("ingredients", ingredientsService.findAllIngredients());
      return "pizzeria/edit";
    }

    pizzeriaService.savePizza(formPizza);
    return "redirect:/pizze";
  }

  @PostMapping("/delete/{id}")
  public String delete(@PathVariable("id") Integer id) {

    Pizza pizza = pizzeriaService.getByIdPizza(id);

    for (Offer offerToDelete : pizza.getOffers()) {
      offersService.deleteOffer(offerToDelete);
    }

    pizzeriaService.deleteByIdPizza(id);

    return "redirect:/pizze";
  }

  @GetMapping("/{id}/offers")
  public String offer(@PathVariable("id") Integer id, Model model) {
    Offer offer = new Offer();
    offer.setPizza(pizzeriaService.getByIdPizza(id));
    model.addAttribute("offer", offer);

    return "offers/edit-or-create";
  }

}