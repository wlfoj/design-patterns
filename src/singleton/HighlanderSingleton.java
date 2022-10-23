package singleton;

public class HighlanderSingleton {
    private String nome;
    private static HighlanderSingleton uniqueInstance;

    public String getNome(){
        return this.nome;
    }

    private HighlanderSingleton(String nome) {
        this.nome = nome;
    }

    public static synchronized HighlanderSingleton getInstance(String nome) {
        if (uniqueInstance == null) {
            uniqueInstance = new HighlanderSingleton(nome);
        }
        return uniqueInstance;
    }
}
