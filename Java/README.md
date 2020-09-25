# Overall Layout

- Container.java: This is the class which will be holding or calling upon the visitable objects (Start here)
- Visitor.java: The interface which defines a base visitor
- ImmutableVisitor.java: The visitor implementation which has an immutable state
- MutableVisitor.java: The visitor implementation which has a mutable state
- TypeA.java: A visitable object of some type (Significance is it's unique to TypeB)
- TypeB.java: A visitable object of some type (Significance is it's unique to TypeA)
- Visitable.java: The interface which defines something as visitable

(Each class contains comments indicating my personal preferences for structure)
