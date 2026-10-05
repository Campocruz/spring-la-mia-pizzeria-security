package org.lesson.java.spring_la_mia_pizzeria_security.services;

import java.util.List;
import java.util.Optional;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Pizza;
import org.lesson.java.spring_la_mia_pizzeria_security.repositorys.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzeriaService {

  @Autowired
  private PizzaRepository pizzaRepository;

  // Find all pizza
  public List<Pizza> findAllPizza() {
    return pizzaRepository.findAll();
  }

  // Find by Id
  public Optional<Pizza> findByIdPizza(Integer id) {
    return pizzaRepository.findById(id);
  }

  // Exist By id
  public boolean existPizzaById(Integer id) {
    if (pizzaRepository.findById(id).isEmpty()) {
      return false;
    }
    return true;
  }

  // Get by ID pizza
  public Pizza getByIdPizza(Integer id) {
    Optional<Pizza> pizza = findByIdPizza(id);
    return pizza.get();
  }

  // Save pizza
  public Pizza savePizza(Pizza formPizza) {
    return pizzaRepository.save(formPizza);
  }

  // Delete pizza
  public void deletePizza(Pizza deletePizza) {
    pizzaRepository.delete(deletePizza);
  }

  // Delete pizza by ID
  public void deleteByIdPizza(Integer id) {
    Optional<Pizza> deletePizza = findByIdPizza(id);
    pizzaRepository.delete(deletePizza.get());
  }

  // Metodi extra

  // Find pizza by containing ingore case
  public List<Pizza> getPizzeByContaining(String value) {
    return pizzaRepository.findByNameContainingIgnoreCase(value);
  }

}