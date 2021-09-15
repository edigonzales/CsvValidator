# CsvValidator

Demo für Zusatzprüfungen mit (GRETL-)CsvValidator.

Modell und Testdaten unter `src/test/data/csv/`:

- CsvModel.ili: Einfaches Modell für Prüfungen ohne Zusatzfunktionen
- CsvModelFunction.ili: Modell mit Funktionsdefinition und Modell für Prüfungen _mit_ Zusatzfunktion.
- data1-3.csv: Testdaten

Zusatzfunktionen werden vom Validator zur Laufzeit aus einer Jar-Datei geladen (Änderungen mit Version x.y.z, noch nicht getestet). Aus diesem Grund muss zuerst die Jar-Datei mit der INTERLIS-Funktion gebuildet werden:

```
./gradlew jar -x test
```

Anschliessend können die verschiedenen Tests durchgeführt werden:

```
./gradlew app:test
```

Konkret prüft die Zusatzfunktionen, ob in einem Attributwert ein spezifischer Buchstaben vorkommt (bissle gaga...).


