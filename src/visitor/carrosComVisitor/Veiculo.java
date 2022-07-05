package visitor.carrosComVisitor;

//O elemento interface declara um método `aceitar` que toma a
//interface do visitante base como um argumento.

public interface Veiculo {
    String aceitar(Visitor visitor);
}