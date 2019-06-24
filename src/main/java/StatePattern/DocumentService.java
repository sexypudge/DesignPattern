package state;

import state.enums.DocumentState;

@Deprecated
public class DocumentService {

    private DocumentState documentState;

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public void handleRequest() {
        switch (documentState) {
            case NEW:
                System.out.println("Create a new document");
                break;
            case SUBMITTED:
                System.out.println("Submitted");
                break;
            case APPROVED:
                System.out.println("Approved");
                break;
            case REJECTED:
                System.out.println("Rejected");
                break;

            default:
                break;
        }
    }
}
