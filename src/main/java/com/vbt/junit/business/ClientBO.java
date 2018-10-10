package com.vbt.junit.business;

import java.util.List;

import com.vbt.junit.business.exception.DifferentCurrenciesException;
import com.vbt.junit.model.Amount;
import com.vbt.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}