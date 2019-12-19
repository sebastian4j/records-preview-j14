package com.sebastian.recordspreviewj14;

/**
 * usando el nuevo tipo Record.
 *
 * @author Sebastián Ávila A.
 */

record Persona(int edad, String nombre) {}

public class RecordsPreview {
	public static void main(String[] args) {
		final var p1 = new Persona(12, "Persona 1");
		final var p2 = new Persona(12, "Persona 1");
		System.out.println(p1.edad());
		System.out.println(p1.nombre());
		System.out.println(p1.equals(p2));
		System.out.println(p1);
	}
}
