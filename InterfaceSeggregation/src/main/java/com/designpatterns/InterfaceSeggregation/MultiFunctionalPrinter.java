package com.designpatterns.InterfaceSeggregation;

public interface MultiFunctionalPrinter extends NormalPrinter {
	
	void Scan(String file);
	
	void Fax(String file);

}
