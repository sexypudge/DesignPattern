package state;

import state.impl.NewState;
import state.impl.SubmittedState;

public class DocumentApp {

    public static void main(String[] args) {
//        DocumentService service = new DocumentService();
//
//        service.setDocumentState(DocumentState.NEW);
//        service.handleRequest();
//
//        service.setDocumentState(DocumentState.SUBMITTED);
//        service.handleRequest();
//
//        service.setDocumentState(DocumentState.APPROVED);
//        service.handleRequest();

        // ============= new ==============

        DocumentContext documentContext = new DocumentContext();
        documentContext.setState(new NewState());
        documentContext.applyState();

        documentContext.setState(new SubmittedState());
        documentContext.applyState();
    }
}
