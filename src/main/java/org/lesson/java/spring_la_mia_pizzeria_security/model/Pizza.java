package org.lesson.java.spring_la_mia_pizzeria_security.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pizzas")
public class Pizza {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank(message = "Il nome è obbligatorio")
  @Column(name = "nome_pizza", nullable = false)
  private String name;

  @Size(max = 500, message = "La descrizione non può superare 500 caratteri")
  @Column(name = "descrizione")
  private String description;

  @Column(name = "url_foto")
  private String img;

  @NotNull
  @DecimalMin(value = "0.01", message = "Il prezzo deve essere maggiore di 0")
  @DecimalMax(value = "99.99", message = "Il prezzo non può eccedere 999999.99")
  @Column(name = "prezzo", nullable = false)
  private float price;

  @OneToMany(mappedBy = "pizza")
  @JsonManagedReference
  private List<Offer> offers;

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  @ManyToMany()
  @JoinTable(name = "pizza_ingredient", joinColumns = @JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
  @JsonIgnoreProperties("pizze")
  private List<Ingredient> ingredients;

  public boolean hasOffers() {
    return offers != null && !offers.isEmpty();
  }

  public float getDiscountedPrice() {
    if (!hasOffers()) {
      return price;
    }
    int maxRate = offers.stream()
        .mapToInt(offer -> offer.getRate())
        .max()
        .orElse(0);
    return price - (price * maxRate / 100f); // 100f → divisione decimale
  }

  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImg() {
    return this.img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public float getPrice() {
    return this.price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %.2f Euro", this.name, this.description, this.price);
  }

}