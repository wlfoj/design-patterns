package proxy;

import java.util.HashMap;

/** Serviço real do YouTube
 * 
 */
public class YouTubeApiReal implements IYouTube {
	// Banco de dados ficticio
	private HashMap<String, String> bancoDados = new HashMap<String, String>();
	
	public YouTubeApiReal() {
		this.bancoDados.put("rock lee x gaara - link park", "tururuduuuu du");
		this.bancoDados.put("som max bagulho sinistro", "be running no problemmmm so if i cooll");
		this.bancoDados.put("final champions", "the champioooooooonnnnss");
	}
	

    
    @Override
    public String getVideo(String videoId) {
    	System.out.println("");
    	System.out.println("--Entrei no real service--");
    	System.out.println("--Demorei 5 horas :( --");
		return this.bancoDados.get(videoId);
    }
    
}
