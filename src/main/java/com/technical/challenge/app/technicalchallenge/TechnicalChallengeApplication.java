package com.technical.challenge.app.technicalchallenge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.technical.challenge.app.technicalchallenge.model.entity.Moneda;
import com.technical.challenge.app.technicalchallenge.model.entity.TipoCambio;
import com.technical.challenge.app.technicalchallenge.model.repository.MonedaDao;
import com.technical.challenge.app.technicalchallenge.model.repository.TipoCambioDao;

@SpringBootApplication
public class TechnicalChallengeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TechnicalChallengeApplication.class, args);
		
		MonedaDao monedaRepository = configurableApplicationContext.getBean(MonedaDao.class);
		
		List<Moneda> monedaList = new ArrayList();
		monedaList.add(new Moneda("PEN", "Perú", "S/", "USER1"));
		monedaList.add(new Moneda("DOL", "USA", "$", "USER1"));
				
		monedaRepository.saveAll(monedaList);
		
		TipoCambioDao tipoCambioRepository = configurableApplicationContext.getBean(TipoCambioDao.class);
		
		List<TipoCambio> tipoCambioList = new ArrayList();
		tipoCambioList.add(new TipoCambio(1L,"PEN", "DOL", "O", 3.5, "USER2"));
		tipoCambioList.add(new TipoCambio(2L,"PEN", "DOL", "M", 3.3, "USER2"));
				
		tipoCambioRepository.saveAll(tipoCambioList);
	}

}
