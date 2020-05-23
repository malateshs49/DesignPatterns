package com.designpatterns.InterfaceSeggregation;

public class NormalPrinterImpl implements NormalPrinter {

	public static void main(String[] args) {

		NormalPrinter printer = new NormalPrinterImpl();
		printer.Print("H://Mala.txt");
	}

	@Override
	public void Print(String file) {
		System.out.println("Printed file " + file + " successfully");

	}

}
