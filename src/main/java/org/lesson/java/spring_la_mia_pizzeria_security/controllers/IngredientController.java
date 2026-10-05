package org.lesson.java.spring_la_mia_pizzeria_security.controllers;

import java.util.List;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Ingredient;
import org.lesson.java.spring_la_mia_pizzeria_security.services.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

  @Autowired
  IngredientsService ingredientsService;

  @GetMapping
  public String index(Model model) {

    List<Ingredient> ingredients = ingredientsService.findAllIngredients();
    model.addAttribute("ingredients", ingredients);

    return "ingredients/index";
  }

  @GetMapping("/create")
  public String create(Model model) {

    model.addAttribute("ingredient", new Ingredient());
    return "ingredients/edit-or-create";
  }

  @PostMapping("/create")
  public String store(@Valid @ModelAttribute("ingredient") Ingredient formIngredient, BindingResult bindingResults,
      Model model) {

    if (bindingResults.hasErrors()) {
      return "ingredients/edit-or-create";
    }

    ingredientsService.saveIngredient(formIngredient);
    return "redirect:/ingredients";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable Integer id, Model model) {
    Ingredient ingredient = ingredientsService.getByIdIngredinet(id);
    model.addAttribute("ingredient", ingredient);
    model.addAttribute("edit", true);

    return "ingredients/edit-or-create";
  }

  @PostMapping("/edit/{id}")
  public String update(@Valid @ModelAttribute("ingredient") Ingredient formIngredient, BindingResult bindingResults,
      Model model) {

    if (bindingResults.hasErrors()) {
      return "ingredients/edit-or-create";
    }
    ingredientsService.saveIngredient(formIngredient);
    return "redirect:/ingredients";
  }

  @PostMapping("/delete/{id}")
  public String delete(@PathVariable("id") Integer id) {

    // Ingredient ingredient = ingredientRepository.findById(id).get();
    ingredientsService.deleteByIdIngredient(id);

    return "redirect:/ingredients";
  }
}
