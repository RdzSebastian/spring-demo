package com.main.beans;

import org.springframework.stereotype.Component;

import com.main.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		return "BarcelonaFC";
	}

	
}
