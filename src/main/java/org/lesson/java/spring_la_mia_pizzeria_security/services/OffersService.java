package org.lesson.java.spring_la_mia_pizzeria_security.services;

import java.util.List;

import org.lesson.java.spring_la_mia_pizzeria_security.model.Offer;
import org.lesson.java.spring_la_mia_pizzeria_security.repositorys.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersService {

  @Autowired
  private OfferRepository offerRepository;

  // Find all offers
  public List<Offer> findAllOffers() {
    return offerRepository.findAll();
  }

  // Find by ID offer
  public Offer getByIdOffer(Integer id) {
    return offerRepository.findById(id).get();
  }

  // Save offer
  public void saveOffer(Offer formOffer) {
    offerRepository.save(formOffer);
  }

  // Delete offer
  public void deleteOffer(Offer deleteOffer) {
    offerRepository.delete(deleteOffer);
  }

  // Delete offer by ID
  public void deleteByIdOffer(Integer id) {
    offerRepository.deleteById(id);
  }
}