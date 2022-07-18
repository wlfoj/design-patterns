package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://refactoring.guru/pt-br/design-patterns/observer/python/example
public class PublishManager {
	// Uma lista de observadores para cada evento
	Map<String, List<IListener>> listeners = new HashMap<>();
	
	/**Criando na hash, os eventos passados nos parametros
	 * 
	 * @param operations
	 */
	public PublishManager(String... operations) {
		//Esses String.. indica que pode receber n parametros do tipo string
		//('oi,'ola') ou só ('oi') ou com 5,6...
		for (String event : operations) {
			//Percorro os n parametro e instancio as listas
			this.listeners.put(event, new ArrayList<IListener>());
		}
	}
	
	/** Metodo para adicionar mais um ouvinte na lista de determinado evento
	 * 
	 * @param event - Evento a ser observado
	 * @param listener - Observador do evento
	 */
	public void subscribe(String event, IListener listener) {
		List<IListener> users = listeners.get(event);
        users.add(listener);
	}
	
	/** Metodo para remover um ouvinte na lista de determinado evento
	 * 
	 * @param event - Evento observado
	 * @param listener - Observador a ser removido
	 */
	public void unsubscribe(String event, IListener listener) {
		List<IListener> users = listeners.get(event);
        users.remove(listener);
	}
	
	/**Notificador dos ouvintes sobre mudanças no tópicos
	 * 
	 * @param eventType
	 * @param file
	 */
    public void notify(String event, String newValue) {
    	// Obtendo os ouvintes de um evento
        List<IListener> users = listeners.get(event);
        // Percorrendo a lista de ouvintes e mandando atualizar para o novo valor
        for (IListener listener : users) {
            listener.update(newValue);
        }
    }

}
