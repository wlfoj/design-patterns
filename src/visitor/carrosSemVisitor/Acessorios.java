package visitor.carrosSemVisitor;

public class Acessorios{

    private String roda;
    private String multimidia;

    public Acessorios(String roda,String multimidia){
        this.roda = roda;
        this.multimidia = multimidia;
    }

    public String getRoda(){
        return roda;
    }

    public String getMultimidia(){
        return multimidia;
    }
    
    @Override
	public String toString() {
		return "Acessorios: "+ roda + " " + multimidia;
	}

}
