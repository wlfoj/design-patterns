package proxy;

import java.util.HashMap;

/** Proxy para o serviço do YouTube
 * 
 */
public class YouTubeProxy implements IYouTube {
	IYouTube service;// Referência ao objeto real
	private HashMap<String, String> cache = new HashMap<String, String>();
	 
	public YouTubeProxy() {
		// Colocando a referência
		this.service = new YouTubeApiReal();
		
		this.cache.put("rock lee x gaara - link park", "tururuduuuu du");
		this.cache.put("som max bagulho sinistro", "be running no problemmmm so if i cooll");
		
	}
	
	
	@Override
	public String getVideo(String videoId) {
		//
		String inCache = cache.get(videoId);
		
		// Se não houver cache para essa request
		if (inCache == null) {
			// Chama o real Service e salva em cache
			String response = this.service.getVideo(videoId);
			this.cache.put(videoId, response);
			return response;
		}
		// Tendo em cache, retorna sem chamar o real service
		else {
			System.out.println("Retornando em cache");
			return inCache;
		}
	}

}
