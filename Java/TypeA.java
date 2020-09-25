// The TypeA visitable object

class TypeA implements Visitable {
    ClassVarType myClassVar;

    public acceptVisitor(Visitor vis) {
        vis.acceptTypeA(this);
    }

    public doTypeAStuff(ClassVarType classVar) {
        // Do any type specific logic that's related to private variables
        myClassVar = classVar;
    }
}