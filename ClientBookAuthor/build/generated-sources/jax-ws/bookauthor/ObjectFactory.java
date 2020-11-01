
package bookauthor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bookauthor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeletelivreResponse_QNAME = new QName("http://auhorbook/", "deletelivreResponse");
    private final static QName _InsertlivreResponse_QNAME = new QName("http://auhorbook/", "insertlivreResponse");
    private final static QName _Updatelivre_QNAME = new QName("http://auhorbook/", "updatelivre");
    private final static QName _DeleteResponse_QNAME = new QName("http://auhorbook/", "deleteResponse");
    private final static QName _Deletelivre_QNAME = new QName("http://auhorbook/", "deletelivre");
    private final static QName _UpdatelivreResponse_QNAME = new QName("http://auhorbook/", "updatelivreResponse");
    private final static QName _Insert_QNAME = new QName("http://auhorbook/", "insert");
    private final static QName _Update_QNAME = new QName("http://auhorbook/", "update");
    private final static QName _Insertlivre_QNAME = new QName("http://auhorbook/", "insertlivre");
    private final static QName _InsertResponse_QNAME = new QName("http://auhorbook/", "insertResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://auhorbook/", "updateResponse");
    private final static QName _Delete_QNAME = new QName("http://auhorbook/", "delete");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bookauthor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletelivreResponse }
     * 
     */
    public DeletelivreResponse createDeletelivreResponse() {
        return new DeletelivreResponse();
    }

    /**
     * Create an instance of {@link InsertlivreResponse }
     * 
     */
    public InsertlivreResponse createInsertlivreResponse() {
        return new InsertlivreResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Deletelivre }
     * 
     */
    public Deletelivre createDeletelivre() {
        return new Deletelivre();
    }

    /**
     * Create an instance of {@link UpdatelivreResponse }
     * 
     */
    public UpdatelivreResponse createUpdatelivreResponse() {
        return new UpdatelivreResponse();
    }

    /**
     * Create an instance of {@link Updatelivre }
     * 
     */
    public Updatelivre createUpdatelivre() {
        return new Updatelivre();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Insertlivre }
     * 
     */
    public Insertlivre createInsertlivre() {
        return new Insertlivre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletelivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "deletelivreResponse")
    public JAXBElement<DeletelivreResponse> createDeletelivreResponse(DeletelivreResponse value) {
        return new JAXBElement<DeletelivreResponse>(_DeletelivreResponse_QNAME, DeletelivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertlivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "insertlivreResponse")
    public JAXBElement<InsertlivreResponse> createInsertlivreResponse(InsertlivreResponse value) {
        return new JAXBElement<InsertlivreResponse>(_InsertlivreResponse_QNAME, InsertlivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updatelivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "updatelivre")
    public JAXBElement<Updatelivre> createUpdatelivre(Updatelivre value) {
        return new JAXBElement<Updatelivre>(_Updatelivre_QNAME, Updatelivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletelivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "deletelivre")
    public JAXBElement<Deletelivre> createDeletelivre(Deletelivre value) {
        return new JAXBElement<Deletelivre>(_Deletelivre_QNAME, Deletelivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatelivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "updatelivreResponse")
    public JAXBElement<UpdatelivreResponse> createUpdatelivreResponse(UpdatelivreResponse value) {
        return new JAXBElement<UpdatelivreResponse>(_UpdatelivreResponse_QNAME, UpdatelivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertlivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "insertlivre")
    public JAXBElement<Insertlivre> createInsertlivre(Insertlivre value) {
        return new JAXBElement<Insertlivre>(_Insertlivre_QNAME, Insertlivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://auhorbook/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

}
