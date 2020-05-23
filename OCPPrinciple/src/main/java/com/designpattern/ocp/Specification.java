package com.designpattern.ocp;

public interface Specification<T> {

	boolean isSame(T t);

}
