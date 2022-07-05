package visitor;

//O elemento interface declara um método `aceitar` que toma a
//interface do visitante base como um argumento.

public interface VeiculoComVisitor {
    String aceitar(Visitor visitor);
}