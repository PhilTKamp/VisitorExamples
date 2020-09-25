// The basic interface required for an object to be visitable
interface Visitable {
    acceptVisitor(Visitor vis);
}