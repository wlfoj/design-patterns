package main;

import java.io.IOException;
import java.util.HashMap;

import proxy.IYouTube;
import proxy.YouTubeApiReal;
import proxy.YouTubeProxy;

public class Main {
//https://www.devmedia.com.br/conheca-o-pattern-proxy-gof-gang-of-four/4066
	public static void main(String[] args) throws IOException, InterruptedException {

		semProxy();
		//comProxy();
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

}
