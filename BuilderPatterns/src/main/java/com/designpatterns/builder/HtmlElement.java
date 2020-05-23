package com.designpatterns.builder;

import java.util.ArrayList;

public class HtmlElement {

	String tagName, tagText;
	ArrayList<HtmlElement> elements = new ArrayList<HtmlElement>();
	private StringBuilder sb = new StringBuilder();

	public HtmlElement() {
		// TODO Auto-generated constructor stub
	}

	public HtmlElement(String tagName, String tagText) {
		this.tagName = tagName;
		this.tagText = tagText;
	}

	@Override
	public String toString() {
		return toStringImpl();
	}

	private String toStringImpl() {
		sb.append(String.format("<%s>\n", this.tagName));
		buildElement(this.elements, 1);
		sb.append(String.format("</%s>", this.tagName));

		return sb.toString();
	}

	private void buildElement(ArrayList<HtmlElement> elements, int indent) {
		for (HtmlElement element : elements) {
			if (element.elements != null && !element.elements.isEmpty()) {
				sb.append(String.format("<%s>\n".indent(indent), element.tagName));
				indent++;
				buildElement(element.elements, indent);
				sb.append(String.format("</%s>\n".indent(indent - 1), element.tagName));
			} else {
				sb.append(String.format("<%s>%s</%s>\n".indent(indent), element.tagName, element.tagText,
						element.tagName));
			}
		}
	}

}
