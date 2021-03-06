package ws.prova.esb2;

import ws.prova.kernel2.ProvaList;

/**
 * Basic contract on ESB Agent class.
 * <br>
 * It is the class that will
 * (1) create an asynchronous <code>ProvaCommunicator</code>;
 * (2) implement <code>send</code> to allow a Prova agent to send goals as messages via bus;
 * (3) accept messages from the bus and use <code>ProvaCommunicator.add()</code> to queue these messages on the agent.
 */
public interface ProvaAgent {

    public void receive( ProvaList terms ) throws Exception;

    public void send(String dest, ProvaList terms) throws Exception;

    public String getAgentName();

}
