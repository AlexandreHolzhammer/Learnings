# A faire demain 17:15 JAVA
https://openclassrooms.com/fr/courses/8383791-apprenez-a-programmer-en-java/exercises/5100?set-locale=fr-FR
3
1
2
1
3
2
1
2
# Évolution de Java : de Java 8 à Java 25

Entre **Java 8 (2014)** et **Java 25 (2025)**, Java a énormément évolué. Si Java 8 a introduit la programmation fonctionnelle moderne, les versions suivantes ont surtout apporté :

- moins de code boilerplate ;
- un meilleur système de modules ;
- les records et le pattern matching ;
- une concurrence révolutionnée avec les virtual threads ;
- de nombreuses améliorations de performance et de productivité. 【1-437a2f】【2-aeec34】

---

## Java 8 (2014)

Version fondatrice de la Java moderne.

### Nouveautés majeures

- Expressions Lambda (`->`)
- API Stream
- `Optional`
- Nouvelle API Date/Time (`java.time`)
- Méthodes par défaut dans les interfaces (`default`) 【3-4b28e5】【1-437a2f】

### Exemple

```java
List<String> names = List.of("Alex", "Bob");

names.stream()
     .filter(n -> n.startsWith("A"))
     .forEach(System.out::println);
```

---

## Java 9 (2017)

### Project Jigsaw : le système de modules

```java
module com.monapp {
    requires java.sql;
}
```

### Autres nouveautés

- JShell (REPL Java)
- `List.of()`, `Set.of()`, `Map.of()`
- Méthodes privées dans les interfaces 【1-437a2f】【3-4b28e5】

---

## Java 10 (2018)

### Inférence de type locale avec `var`

```java
var nom = "Alex";
```

Le compilateur déduit automatiquement le type. 【1-437a2f】

---

## Java 11 (2018) - LTS

Première version LTS importante après Java 8.

### Nouveautés

- API `HttpClient`
- Nouvelles méthodes sur `String`
- Exécution directe de fichiers Java

```bash
java Hello.java
```

【1-437a2f】

---

## Java 14 - Java 15

### Text Blocks

Écriture simplifiée des chaînes multilignes :

```java
String json = """
{
  "nom": "Alex"
}
""";
```

---

## Java 16

### Records

Les records permettent de créer facilement des objets de données immuables.

```java
public record User(String name, int age) {}
```

Le compilateur génère automatiquement :

- le constructeur ;
- les accesseurs ;
- `equals()` ;
- `hashCode()` ;
- `toString()` ; 【4-3f3aaf】

---

## Java 17 (2021) - LTS

Version LTS très adoptée par les entreprises.

### Sealed Classes

Contrôle des classes pouvant hériter d'une autre.

```java
public sealed class Shape
    permits Circle, Rectangle {}
```

### Pattern Matching pour `instanceof`

#### Avant

```java
if (obj instanceof User) {
    User u = (User) obj;
}
```

#### Après

```java
if (obj instanceof User u) {
    System.out.println(u.name());
}
```

【4-3f3aaf】【5-f4a36f】

---

## Java 21 (2023) - LTS

Probablement la plus importante évolution depuis Java 8.

### Virtual Threads (Project Loom)

Des millions de threads légers peuvent être créés par la JVM.

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    executor.submit(() -> traiterRequete());
}
```

Avantages :

- meilleure scalabilité ;
- moins de consommation mémoire ;
- programmation concurrente simplifiée. 【6-88484d】【7-5bebc2】

### Pattern Matching pour `switch`

```java
switch(obj) {
    case String s -> System.out.println(s);
    case Integer i -> System.out.println(i);
    default -> {}
}
```

### Record Patterns

Déconstruction automatique des records.

```java
if (point instanceof Point(int x, int y)) {
    System.out.println(x + y);
}
```

【5-f4a36f】【6-88484d】

---

## Java 25 (2025) - LTS

Dernière version LTS.

### Principales nouveautés

- Scoped Values
- Module Import Declarations
- Compact Source Files
- Flexible Constructor Bodies
- Amélioration du pattern matching sur les types primitifs
- Structured Concurrency (évolution de Project Loom) 【8-dd199a】【9-908e3a】【2-aeec34】

### Exemple de programme compact

```java
void main() {
    System.out.println("Hello Java 25");
}
```

【9-908e3a】【8-dd199a】

---

# Les évolutions les plus importantes pour un développeur Java 8

Si tu passes directement de Java 8 à Java 25, les changements qui impactent le plus le développement quotidien sont :

1. `var` (Java 10)
2. Modules (Java 9)
3. Text Blocks (Java 15)
4. Records (Java 16)
5. Sealed Classes (Java 17)
6. Pattern Matching (Java 17 → 21)
7. Virtual Threads (Java 21)
8. Scoped Values (Java 25) 【1-437a2f】【6-88484d】【8-dd199a】

---

# Exemple : Java 8 vs Java moderne

## Java 8

```java
public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

## Java 25

```java
public record User(String name) {}
```

Ou encore :

```java
switch (obj) {
    case User(String name) -> System.out.println(name);
    default -> {}
}
```

---

# Conclusion

Java est passé d'un langage souvent considéré comme verbeux à un langage beaucoup plus expressif, moderne et performant.

Les innovations majeures depuis Java 8 sont :

- **Records** pour réduire le boilerplate ;
- **Pattern Matching** pour simplifier le traitement des objets ;
- **Virtual Threads** pour transformer la concurrence ;
- **Scoped Values** et **Structured Concurrency** pour moderniser davantage le développement multi-thread.

Pour un développeur Java 8, les versions **17**, **21** et **25** représentent aujourd'hui les étapes les plus intéressantes à étudier après les bases introduites en Java 8.