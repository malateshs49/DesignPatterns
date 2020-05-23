package com.designpattern.ocp;

import java.util.List;
import java.util.stream.Stream;

public interface Filter {

	Stream<CreditCards> filterCardType(List<CreditCards> creditCards, Specification<CreditCards> cardSpecification);
	

}
