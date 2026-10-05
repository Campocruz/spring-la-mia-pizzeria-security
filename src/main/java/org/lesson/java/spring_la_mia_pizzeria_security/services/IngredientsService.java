package org.lesson.java.spring_la_mia_pizzeria_security.services;

import java.util.List;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Ingredient;
import org.lesson.java.spring_la_mia_pizzeria_security.repositorys.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientsService {

  @Autowired
  private IngredientRepository ingredientRepository;

  // Find all pizza
  public List<Ingredient> findAllIngredients() {
    return ingredientRepository.findAll();
  }

  // Find by ID pizza
  public Ingredient getByIdIngredinet(Integer id) {
    return ingredientRepository.findById(id).get();
  }

  // Save pizza
  public void saveIngredient(Ingredient formIngredient) {
    ingredientRepository.save(formIngredient);
  }

  // Delete pizza
  public void deleteIngredient(Ingredient deleteIngredient) {
    ingredientRepository.delete(deleteIngredient);
  }

  // Delete pizza by ID
  public void deleteByIdIngredient(Integer id) {
    ingredientRepository.deleteById(id);
  }
}