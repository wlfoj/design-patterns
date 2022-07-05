package main;

import java.io.IOException;
import java.util.HashMap;

import proxy.IYouTube;
import proxy.YouTubeApiReal;
import proxy.YouTubeProxy;
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
//https://www.devmedia.com.br/conheca-o-pattern-proxy-gof-gang-of-four/4066
	public static void main(String[] args) throws IOException, InterruptedException {

	
	}
	
	
	public static void semProxy() {
		IYouTube service = new YouTubeApiReal();
		System.out.println(service.getVideo("final champions"));
		System.out.println(service.getVideo("final champions"));
		System.out.println(service.getVideo("final champions"));
	}
	
	public static void comProxy() {
		IYouTube service = new YouTubeProxy();
		System.out.println(service.getVideo("final champions"));
		System.out.println(service.getVideo("final champions"));
		System.out.println(service.getVideo("final champions"));
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
}
