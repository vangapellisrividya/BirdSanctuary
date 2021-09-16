package com.bl.birdsantuary;

public class Bird {
	enum Colour {
		WHITE, BLACK, GREEN, GRAY };

	protected String id;
	protected Colour colour;
	protected boolean isFlyable;
	protected boolean isSwimmable;
	protected String name;

	public void eat() {
		System.out.println(name + " is eating ");
	}

	public void fly() {
		System.out.println(name + " is flying ");
	}

	public void swim() {
		System.out.println(name + " is swimming ");
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", colour=" + colour + ", isFlyable=" + isFlyable + ", isSwimmable=" + isSwimmable
				+ ", name=" + name + "]";
	}
}
