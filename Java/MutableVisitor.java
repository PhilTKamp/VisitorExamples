// A visitor which uses a mutable state for visitation
class MutableVisitor implements Visitor {
    ClassVarType classVar = "Default Value"
    
    acceptTypeA(TypeA typeA) {
        // Do anything type specific in this method which doesn't require
        // private access (Personal thoughts would be keep this to calling other methods)
        typeA.doTypeAStuff(classVar)
        
    }

    acceptTypeB(TypeB typeB) {
        // Do anything type specific in this method which doesn't require
        // private access (Personal thoughts would be keep this to calling other methods)
        typeB.doTypeBStuff(classVar)
    }
}