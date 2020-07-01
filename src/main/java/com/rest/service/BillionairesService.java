package com.rest.service;

import java.util.List;

import com.rest.domain.Billionaires;

public interface BillionairesService {
	
	public List<Billionaires> listAll() ;
	public int deleteBillionaire(Long bilionaireiD);
	public int createBillionaires(Billionaires billionaires);
	public boolean updateBillionaire(Billionaires billionaires);
}
