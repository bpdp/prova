package ws.prova.reference2;

import ws.prova.kernel2.ProvaObject;

public abstract class ProvaTermImpl implements ProvaObject {

    private static final long serialVersionUID = 2003275980786151251L;

    public String uniqueName() {
        String objectString = super.toString();
        return objectString.substring(objectString.indexOf('@'));
    }
    
}
