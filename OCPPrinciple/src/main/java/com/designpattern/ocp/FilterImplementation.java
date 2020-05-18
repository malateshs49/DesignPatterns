package com.designpattern.ocp;

import java.util.List;
import java.util.stream.Stream;

public class FilterImplementation implements Filter {

	@Override
	public Stream<CreditCards> filterCardType(List<CreditCards> creditCards,
			final Specification<CreditCards> cardSpecification) {

		return creditCards.stream().filter(p -> cardSpecification.isSame(p) == true);
	}

}
