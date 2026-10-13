package Learnings.Java;

public class Films {
    public static String categorieDeFilm(final String film) {
        var resultat = switch (film) {
            case "Star Wars" -> "Science fiction";
            case "Blanche neige", "La petite sirène" -> "Disney";
            case "Indiana Jones" -> {
                String categorie = "Aventure";
                yield categorie;
            }
            default -> "Inconnu";
        };
        return resultat;
    }
}
