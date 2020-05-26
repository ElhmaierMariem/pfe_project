package com.rapport.generateur.services;

import com.rapport.generateur.entities.Formulaires;

public interface FormulairesServices {
   public Iterable<Formulaires> findAll();
   public Formulaires find(Long formulairesId);
}
