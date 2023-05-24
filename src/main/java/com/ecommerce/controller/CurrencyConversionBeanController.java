package com.velocity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.service.CurrencyConversionBeanService;


@RestController
@RequestMapping("/CurrencyConversion")
public class CurrencyConversionBeanController {
	
	@Autowired
	CurrencyConversionBeanService currencyConversionBeanService;
	
	// RestAPI to get CurrencyConversionBean Details
	
		@GetMapping("/get/{id}")
		public ResponseEntity<CurrencyConversionBean> getCurrencyConversionBeanDetails(@PathVariable("id") Long id) {
			CurrencyConversionBean currencyConversionBean = currencyConversionBeanService.getCurrentConverterDetails(id);

			return ResponseEntity.ok().body(currencyConversionBean);

}
		// RestAPI to Delete CurrencyConversionBean Details
		
		@DeleteMapping("/delete/{id}")
		public void deleteCurrencyConversionBeanById(@PathVariable("id") Long id) { 
		
			currencyConversionBeanService.deleteCurrentConverterDetails(id);
			//id-2 path variable name pass here
		}
}
