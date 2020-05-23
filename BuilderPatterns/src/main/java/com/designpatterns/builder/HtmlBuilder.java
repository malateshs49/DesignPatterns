package com.designpatterns.builder;

public class HtmlBuilder {

	private HtmlElement htmlElement;

	public HtmlElement getHtmlElement() {
		return htmlElement;
	}

	public HtmlBuilder(String rootTag) {
		htmlElement = new HtmlElement();
		htmlElement.tagName = rootTag;
	}

	public void addChildTag(String tagName, String tagText) {
		htmlElement.elements.add(new HtmlElement(tagName, tagText));
	}

	public void addChildTag(HtmlElement element) {
		htmlElement.elements.add(element);
	}

	public HtmlBuilder addChildTagFluent(String tagName, String tagText) {
		htmlElement.elements.add(new HtmlElement(tagName, tagText));
		return this;
	}

	public HtmlBuilder addChildTagFluent(HtmlElement element) {
		htmlElement.elements.add(element);
		return this;
	}

	@Override
	public String toString() {
		return htmlElement.toString();
	}
}
