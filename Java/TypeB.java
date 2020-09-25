class TypeB implements Visitable {
    ClassVarType myClassVar;

    public acceptVisitor(Visitor vis) {
        vis.acceptTypeB(this);
    }

    public doTypeBStuff(ClassVarType classVar) {
        // Do any type specific logic with private vars
        myClassVar = classVar;
    }
}