# SES Patterns: Dependency Injection

Oefening voor https://kuleuven-diepenbeek.github.io/ses-course/patterns/di

## Technologie

Dit is een [gradle project](https://kuleuven-diepenbeek.github.io/ses-course/dependency-management/).

## Opgave

1. Er staan twee TODO items in de code: verwijder eerst de `new DBHandle()` vanuit de resource klasse, en injecteer het via een constructor argument. Pas dan de unit test aan om de compile fouten te fixen.
2. Gebruik een interface om de `DummyDBHandle` [uit de labo noties](https://kuleuven-diepenbeek.github.io/ses-course/patterns/di/) in het project te introduceren. Dat wil zeggen, hernoem `DBHandle` naar `DBHandleImplementation`, en maak een nieuwe interface genaamd `DBHandle`. Nu kan je de tweede unit test zoals hierboven toevoegen. 
3. In plaats van manueel te injecteren, kunnen we deze zaken ook overlaten aan gespecialiseerde frameworks, zoals Google Guice. Bovenstaand project heeft als Gradle dependency een link naar Guice. Neem een kijkje in de `ShoppingCartGuiceResource` klasse, en probeer dit principe toe te passen op de andere resouce klasse. `@Inject` verzogt het DI systeem, zonder zelf ergens objecten aan te maken, behalve in de config klasse. Zie ook [Google Guice: getting started](https://github.com/google/guice/wiki/GettingStarted). 