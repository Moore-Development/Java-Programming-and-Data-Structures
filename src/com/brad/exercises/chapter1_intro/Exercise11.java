package com.brad.exercises.chapter1_intro;

public class Exercise11 {

	public static void main(String[] args) {
		int currentPopulation = 312032486;
		int birthsPerYear = 365 * 24 * (60 / 7);
		int deathsPerYear = 365 * 24 * (60 / 13);
		int immigrantsPerYear = 365 * 24 * (60 / 45);
		int populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

		System.out.println("Current Population: " + currentPopulation);
		System.out.println("Births per year: " + birthsPerYear);
		System.out.println("Deaths per year: " + deathsPerYear);
		System.out.println("New immigrants per year: " + immigrantsPerYear);
		System.out.println("The change in population per year: " + populationChangePerYear);
		System.out.println("Current population after 1 year: " 
				+ (currentPopulation = currentPopulation + populationChangePerYear));
		System.out.println("Current population after 2 years: " 
				+ (currentPopulation = currentPopulation + populationChangePerYear));
		System.out.println("Current population after 3 years: " 
				+ (currentPopulation = currentPopulation + populationChangePerYear));
		System.out.println("Current population after 4 years: " 
				+ (currentPopulation = currentPopulation + populationChangePerYear));
		System.out.println("Current population after 5 years: " 
				+ (currentPopulation = currentPopulation + populationChangePerYear));
		System.out.println("Total increase after 5 years: " + (currentPopulation - 312032486));
	}

}
