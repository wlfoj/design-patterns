package main;

import java.io.IOException;

import adapter.AdapterCar;
import adapter.CarEV;
import adapter.CarICE;
import adapter.ICar;
import factoryMethod.FactoryVehicle;
import factoryMethod.TypeVehicle;
import factoryMethod.VehicleProd;
import observer.AuntListener;
import observer.GrandmaListener;
import observer.PublishManager;
import proxy.IYouTube;
import proxy.YouTubeApiReal;
import proxy.YouTubeProxy;
import singleton.HighlanderSingleton;
import strategy.CalculadoraDeImpostoStrategy;
import strategy.CalculadoraDeImpostosSemPadrao;
import strategy.IcmsStrategy;
import strategy.IpiStrategy;
import visitor.AcessoriosComVisitor;
import visitor.AcessoriosSemVisitor;
import visitor.CarroComVisitor;
import visitor.CarroSemVisitor;
import visitor.VeiculoVisitor;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		//semProxy();
		//comProxy();
		//semVisitor();
		//comVisitor();
		//semStrategy();
		//comStrategy();
		//comObserver();
		//comSingleton();
		comAdapter();
	}
	
	public static void comSingleton(){
		// Só pode haver um High Lander
		HighlanderSingleton highL1 = HighlanderSingleton.getInstance("Josimar");
		HighlanderSingleton highL2 = HighlanderSingleton.getInstance("Emanuel");
		System.out.println("O nome de HighLander 1 "+ highL1.getNome());
		System.out.println("O nome de HighLander 2 "+ highL2.getNome());
	}
	public static void semProxy() {
		IYouTube service = new YouTubeApiReal();
		System.out.println(service.getVideo("final champions"));
		System.out.println("");
		System.out.println(service.getVideo("final champions"));
		System.out.println("");
		System.out.println(service.getVideo("final champions"));
	}
	
	public static void comProxy() {
		IYouTube service = new YouTubeProxy();
		System.out.println(service.getVideo("final champions"));
		System.out.println("");
		System.out.println(service.getVideo("final champions"));
		System.out.println("");
		System.out.println(service.getVideo("final champions"));
		System.out.println("");
		System.out.println(service.getVideo("rock lee x gaara - link park"));
		System.out.println("");
		System.out.println(service.getVideo("rock lee x gaara - link park"));
	}

	public static void semVisitor() {
		CarroSemVisitor carro = new CarroSemVisitor("Fiat", "Toro");
	
	    AcessoriosSemVisitor acessorios = new AcessoriosSemVisitor("Black", "Pionner");
	
	    System.out.println("\n"+carro+"\n"+acessorios);
	}

	public static void comVisitor() {
		CarroComVisitor carro = new CarroComVisitor("Fiat", "Toro");
        VeiculoVisitor visitor = new VeiculoVisitor();

        AcessoriosComVisitor acessorios = new AcessoriosComVisitor("Black", "Pionner");

        System.out.println("\n"+visitor.exibirCarro(carro)+"\n"+visitor.exibirAcessorios(acessorios));
	}
	
	public static void comStrategy() {
		CalculadoraDeImpostoStrategy calculadora = new CalculadoraDeImpostoStrategy(); 
	    IcmsStrategy icms = new IcmsStrategy(100.0); 
	    IpiStrategy ipi = new IpiStrategy(100.0); 
	    System.out.println("\nICMS com padrão => " + calculadora.calcularStrategy(icms)); 
	    System.out.println("IPI com padrão => " + calculadora.calcularStrategy(ipi)); 
		
	}

	public static void semStrategy() {
		CalculadoraDeImpostosSemPadrao calculadora = new CalculadoraDeImpostosSemPadrao();
		System.out.println("\nICMS sem padrão => " + calculadora.calcular("ICMS", 100));
		System.out.println("IPI sem padrão => " + calculadora.calcular("IPI", 100));
	}
	
	public static void comObserver() {
		AuntListener tia = new AuntListener();
		GrandmaListener avo = new GrandmaListener();
		
		PublishManager pub = new PublishManager("nascimentos", "aniversarios", "festas");
		
		//vov� e titia querem saber quem anda nascendo
		pub.subscribe("nascimentos", avo);
		pub.subscribe("nascimentos", tia);
		//s� titia quer saber das festas
		pub.subscribe("festas", tia);
		
		pub.notify("nascimentos", "O bb de joana nasceu");
		System.out.println();
		pub.notify("festas", "amanha tem festa na Manu");
		System.out.println();
		pub.notify("nascimentos", "O filho de carlos nasceu");
		System.out.println();
		//titia n�o quer mais saber quem nasceu
		pub.unsubscribe("nascimentos", tia);
		
		pub.notify("nascimentos", "tem gemeos vindo a�");
	}

	public static void comAdapter(){
		// Na situação, o cliente possui robôs que recebem comandos
		// O cliente só sabe dar comando para abastecer carro ICE
		ICar car1 = new AdapterCar(new CarEV());// Tratando carro EV como se fosse ICE
		ICar car2 = new CarICE();
		System.out.println("ABASTECENDO CARRO - COMBUSTÃO");
		car2.abastecer();
		System.out.println("RECARREGANDO CARRO - EV");
		car1.abastecer();
	}

	public static void comFactoryMethod() {
		FactoryVehicle factoryVehicle = new FactoryVehicle();
		VehicleProd vehicle1 = factoryVehicle.getVehicle('A', "34BR", TypeVehicle.CAR);
		VehicleProd vehicle2 = factoryVehicle.getVehicle('B', "77BR", TypeVehicle.TRUCK);
		vehicle1.rodar(10);
		vehicle2.rodar(14);
		System.out.println("Para o carro: -> "+ vehicle1.detail());
		System.out.println("Para o caminhão: -> "+ vehicle2.detail());
	}
}
