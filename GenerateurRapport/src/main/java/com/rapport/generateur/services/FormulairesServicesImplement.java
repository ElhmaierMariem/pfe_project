package com.rapport.generateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.rapport.generateur.entities.Formulaires;
import com.rapport.generateur.repository.FormulairesRepo;
@Service("FormulairesSercices")
@Transactional
public class FormulairesServicesImplement implements FormulairesServices{
   
	@Autowired   
	private FormulairesRepo formulairesRepo;
	
    @Override
	public Iterable<Formulaires> findAll() {
		
		return formulairesRepo.findAll();
	}

	@Override
	public Formulaires find(Long formulairesId) {
		// TODO Auto-generated method stub
		return formulairesRepo.getOne(formulairesId);
	}

	


	

}
