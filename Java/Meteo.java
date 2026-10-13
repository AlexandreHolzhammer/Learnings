package Learnings.Java;

public class Meteo {
    public static void meteo(final boolean beauTemps) {
        if(beauTemps) {
            System.out.println("Je vais à la plage");
        } else {
            System.out.println("Je vais au cinéma");
        }
    }
    public static void meteo2(final boolean beauTemps) {
        if(!beauTemps) {
            System.out.println("Le temps n'est pas beau.");
        }
    }
    public static void meteo3(final String temps) {
        if(temps.equals("soleil")) {
            System.out.println("Je vais à la plage");
        }
    }

    public static void commenteLaMeteo(final String meteo) {
        switch (meteo) {
            case "soleil" -> System.out.println("Beau temps");
            case "nuage" -> System.out.println("Couvert");
            case "pluie" -> System.out.println("Mauvais temps");
            default -> System.out.println("Je ne sais pas.");
        }
    }
}
