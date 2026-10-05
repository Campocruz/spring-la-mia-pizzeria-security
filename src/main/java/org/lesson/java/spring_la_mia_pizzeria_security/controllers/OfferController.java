package org.lesson.java.spring_la_mia_pizzeria_security.controllers;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Offer;
import org.lesson.java.spring_la_mia_pizzeria_security.services.OffersService;
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
@RequestMapping("/offers")
public class OfferController {

  @Autowired
  private OffersService offersService;

  @PostMapping("/create")
  public String store(@Valid @ModelAttribute("offer") Offer formOffer, BindingResult bindingResults, Model model) {

    if (bindingResults.hasErrors()) {
      return "offers/edit-or-create";
    }

    offersService.saveOffer(formOffer);
    ;
    return "redirect:/pizze/" + formOffer.getPizza().getId();
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable Integer id, Model model) {
    Offer offer = offersService.getByIdOffer(id);
    model.addAttribute("offer", offer);
    model.addAttribute("edit", true);

    return "offers/edit-or-create";
  }

  @PostMapping("/edit/{id}")
  public String update(@Valid @ModelAttribute("offer") Offer formOffer, BindingResult bindingResults, Model model) {

    if (bindingResults.hasErrors()) {
      return "offers/edit-or-create";
    }
    offersService.saveOffer(formOffer);
    return "redirect:/pizze/" + formOffer.getPizza().getId();
  }

  @PostMapping("/delete/{id}")
  public String delete(@PathVariable("id") Integer id) {

    Offer offer = offersService.getByIdOffer(id);
    offersService.deleteOffer(offer);

    return "redirect:/pizze/" + offer.getPizza().getId();
  }
}
