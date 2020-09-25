// A dependency injected Visitor for immutable state
class ImmutableVisitor implements Visitor {
    ClassVarType classVar;

    constructor(ClassVarType classVar) {
        this.classVar = classVar;
    }

    public acceptTypeA(TypeA typeA) {
        // Do anything type specific in this method which doesn't require
        // private access (Personal thoughts would be keep this to calling other methods)
        typeA.doTypeAStuff(classVar)
    }

    public acceptTypeB(TypeB typeB) {
        // Do anything type specific in this method which doesn't require
        // private access (Personal thoughts would be keep this to calling other methods)

        typeB.doTypeBStuff(classVar)
    }
}