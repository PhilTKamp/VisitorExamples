// The object which holds all of the visitable objects
class Container {
    ArrayList<Visitable> myVisitableThings = new ArrayList<Visitable>();
    MutableVisitor mutableVisitor = new MutableVisitor();

    constructor() {
        // Just populating the list with random types
        for(int i = 0; i < 5; i++) {
            myVisitableThings.push(new TypeA());
            myVisitableThings.push(new TypeB());
        }

        mutableVisitor = new MutableVisitor()
    }

    // Personally prefer using an immutable state (may be due to doing a lot of functional recently)
    useImmutableVisitor(ClassVarType usedClassVar) {
        // Create the visitor we'll pass along
        var theVisitor = new DerivedVisitor(usedClassVar);

        for (var v : myVisitableThings) {
            v.acceptVisitor(theVisitor);
        }
    } 
    
    // Useful to use mutable state if for some reason this value will be changed elsewhere
    // (My thoughts, this leads to spaghetti code due to non-centralized updates)
    useMutableVisitor(ClassVarType usedClassVar) {
        // This can be set whenever
        mutableVisitor.classVar = usedClassVar;

        for (var v : myVisitableThings) {
            v.acceptVisitor(theVisitor);
        }
    } 


}