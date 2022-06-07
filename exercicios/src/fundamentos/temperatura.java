package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		// (ºF - 32)* 5/9 = ºC
		// (12 °C × 9/5) + 32 = 53,6 °F

		int fahrenheit = 86;
		double celcius = 29;
		final int fator = 32;
		final double divison = 5 / 9.0;

		double finalCelcius = (fahrenheit - fator) * divison;
		double finalFahrenheit = (celcius * divison) + fator;

		System.out.println(finalCelcius);
		System.out.println(finalFahrenheit);

	}
}
