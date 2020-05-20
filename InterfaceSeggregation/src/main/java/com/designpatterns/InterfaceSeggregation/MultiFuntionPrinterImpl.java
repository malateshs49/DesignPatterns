package com.designpatterns.InterfaceSeggregation;

public class MultiFuntionPrinterImpl implements MultiFunctionalPrinter {
	public static void main(String[] args) {

		MultiFunctionalPrinter printer = new MultiFuntionPrinterImpl();
		printer.Print("H://Mala.txt");
		printer.Scan("H://Mala.txt");
		printer.Fax("H://Mala.txt");
	}

	@Override
	public void Print(String file) {
		System.out.println("Printed file " + file + " successfully");

	}

	@Override
	public void Scan(String file) {
		System.out.println("Printed scanned " + file + " successfully");

	}

	@Override
	public void Fax(String file) {
		System.out.println("Printed faxed " + file + " successfully");

	}
}
