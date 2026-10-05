package org.lesson.java.spring_la_mia_pizzeria_security.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "offers")
public class Offer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank(message = "Title not blank")
  @Column(name = "title", nullable = false)
  private String title;

  @Size(max = 500, message = "Description max 500")
  @Column(name = "description")
  private String description;

  @NotNull
  @Min(value = 1, message = "Lo sconto deve essere almeno 1%")
  @Max(value = 50, message = "Lo sconto non può superare il 50%")
  @Column(name = "rate", nullable = false)
  private Integer rate;

  @NotNull(message = "Date cannot Null")
  @FutureOrPresent(message = "Date cannot in the past")
  @Column(name = "start_offer", nullable = false)
  private LocalDate startOffer;

  @NotNull(message = "Date cannot Null")
  @FutureOrPresent(message = "Date cannot in the past")
  @Column(name = "end_offer", nullable = false)
  private LocalDate endOffer;

  @ManyToOne
  @JoinColumn(name = "pizza_id", nullable = false)
  @JsonBackReference
  private Pizza pizza;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public LocalDate getStartOffer() {
    return startOffer;
  }

  public void setStartOffer(LocalDate startOffer) {
    this.startOffer = startOffer;
  }

  public LocalDate getEndOffer() {
    return endOffer;
  }

  public void setEndOffer(LocalDate endOffer) {
    this.endOffer = endOffer;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public Pizza getPizza() {
    return pizza;
  }

  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }
}
