package org.lesson.java.spring_la_mia_pizzeria_security.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "ingredients")
public class Ingredient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank(message = "The ingredient's name cannot blank")
  @Column(name = "name")
  private String name;

  @ManyToMany(mappedBy = "ingredients")
  @JsonIgnoreProperties("ingredients")
  private List<Pizza> pizze;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Pizza> getPizze() {
    return pizze;
  }

  public void setPizze(List<Pizza> pizze) {
    this.pizze = pizze;
  }

}
