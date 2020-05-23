package com.designpatterns.builder;

public class HtmlMainClass {

	public static void main(String[] args) {

		// Approach 1
		HtmlBuilder builder = new HtmlBuilder("root");
		HtmlBuilder builder2 = new HtmlBuilder("body");
		HtmlBuilder builder3 = new HtmlBuilder("ul");
		builder3.addChildTagFluent("li", "malatesh").addChildTagFluent("li", "vanitha");
		builder2.addChildTag(builder3.getHtmlElement());
		builder.addChildTag(builder2.getHtmlElement());
		System.out.println("Approach 1");
		System.out.println("----------");
		System.out.println(builder);
		System.out.println();

		builder = new HtmlBuilder("root");
		builder.addChildTagFluent((new HtmlBuilder("body").addChildTagFluent(
				(new HtmlBuilder("ul").addChildTagFluent("li", "malatesh").addChildTagFluent("li", "vanitha"))
						.getHtmlElement())
				.getHtmlElement()));
		System.out.println("Approach 2");
		System.out.println("----------");
		System.out.println(builder);
	}

}
