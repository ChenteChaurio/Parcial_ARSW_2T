package edu.eci.arsw.myrestaurant.beans;

import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import org.springframework.context.annotation.Bean;

public interface TaxesCalculator {

	public float getProductTaxes(RestaurantProduct p);
	
}
