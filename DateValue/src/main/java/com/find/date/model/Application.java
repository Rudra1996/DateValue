package com.find.date.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private Dataprovider[] dataproviders;

	public Dataprovider[] getDataproviders() {
		return dataproviders;
	}

	public void setDataproviders(Dataprovider[] dataproviders) {
		this.dataproviders = dataproviders;
	}

	

	

	
	

}
