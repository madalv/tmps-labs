## Repository for TMPS Labs

- Lab 1 - SOLID Principles
- Lab 2 - Creational Design Patterns 
  - Factory Method: NYPizzaFactory and CaliPizzaFactory implement Pizza Factory and create subclasses of abstract product Pizza;
  - Abstract Factory: Two related lines of ingredients with their factories: NYIngredientFactory and CaliIngredientFactory; used in Pizza to choose specific ingredients;
  - Singleton: NYPizzaFactory and CaliPizzaFactory are Singletons. Let's assume we only have 1 pizzeria in each city;
  - Builder: IngredientFactories use DoughBuilder to return a specific Dough.
- Lab 3 - Structural Design Patterns 
  - Composite: GenreComponent is the universal interface for Film (leaf), and Genre(branch, can contain other films);
  - Adapter: RetroTVAdapter adapts the RetroTV class to the (modern) TV interface.
  - Facade: HomeTheaterFacade simplifies using the Home Theater system by providing a higher-level interface;
  - Decorator: PopcornDecorators can be used to decorate Popcorn.
  - Bridge: The Remote can be though of as a "abstraction" to the TV. To bridge 
  the abstraction (Remote) and implementation (TV), the Remote class delegates all work to the actual implementation, of which it has a reference.
  Now both the variations of the "abstraction" (Remote) and implementation (TV) can work with each other.  