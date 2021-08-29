package com.bl.birdsanctuary;

import java.util.Objects;

abstract public class Bird {
	
	enum Color {
		RED, BLACK_WHITE, GREY, WHITE, BLACK, BLUE, GREEN
	}
	
	String id;
	Color color;
	String name;
	
	@Override
	public String toString() {
		return "Bird [id=" + id + ", color=" + color + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	abstract void eat();
	
	
}

