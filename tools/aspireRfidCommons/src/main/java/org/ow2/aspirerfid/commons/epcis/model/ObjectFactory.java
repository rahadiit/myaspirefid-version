
package org.ow2.aspirerfid.commons.epcis.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ow2.aspirerfid.commons.epcis.model package. 
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

    private final static QName _QueryParameterException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "QueryParameterException");
    private final static QName _EPCISException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "EPCISException");
    private final static QName _SubscribeNotPermittedException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "SubscribeNotPermittedException");
    private final static QName _InvalidURIException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "InvalidURIException");
    private final static QName _SubscriptionControlsException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "SubscriptionControlsException");
    private final static QName _EPCISDocument_QNAME = new QName("urn:epcglobal:epcis:xsd:1", "EPCISDocument");
    private final static QName _SecurityException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "SecurityException");
    private final static QName _NoSuchNameException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchNameException");
    private final static QName _StandardBusinessDocument_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "StandardBusinessDocument");
    private final static QName _VoidHolder_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "VoidHolder");
    private final static QName _Subscribe_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "Subscribe");
    private final static QName _DuplicateSubscriptionException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateSubscriptionException");
    private final static QName _QueryTooLargeException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooLargeException");
    private final static QName _GetSubscriptionIDs_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetSubscriptionIDs");
    private final static QName _UnsubscribeResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "UnsubscribeResult");
    private final static QName _EPCISQueryDocument_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "EPCISQueryDocument");
    private final static QName _ScopeInformation_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "ScopeInformation");
    private final static QName _CorrelationInformation_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "CorrelationInformation");
    private final static QName _GetQueryNamesResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetQueryNamesResult");
    private final static QName _QueryTooComplexException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooComplexException");
    private final static QName _EPCISMasterDataDocument_QNAME = new QName("urn:epcglobal:epcis-masterdata:xsd:1", "EPCISMasterDataDocument");
    private final static QName _GetSubscriptionIDsResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetSubscriptionIDsResult");
    private final static QName _GetVendorVersionResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetVendorVersionResult");
    private final static QName _ValidationException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "ValidationException");
    private final static QName _StandardBusinessDocumentHeader_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "StandardBusinessDocumentHeader");
    private final static QName _SubscribeResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "SubscribeResult");
    private final static QName _GetVendorVersion_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetVendorVersion");
    private final static QName _Unsubscribe_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "Unsubscribe");
    private final static QName _GetQueryNames_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetQueryNames");
    private final static QName _QueryResults_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "QueryResults");
    private final static QName _Poll_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "Poll");
    private final static QName _GetStandardVersion_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetStandardVersion");
    private final static QName _BusinessService_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "BusinessService");
    private final static QName _DuplicateNameException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateNameException");
    private final static QName _GetStandardVersionResult_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "GetStandardVersionResult");
    private final static QName _ImplementationException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "ImplementationException");
    private final static QName _NoSuchSubscriptionException_QNAME = new QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchSubscriptionException");
    private final static QName _EventListTypeExtension_QNAME = new QName("", "extension");
    private final static QName _EventListTypeObjectEvent_QNAME = new QName("", "ObjectEvent");
    private final static QName _EventListTypeTransactionEvent_QNAME = new QName("", "TransactionEvent");
    private final static QName _EventListTypeQuantityEvent_QNAME = new QName("", "QuantityEvent");
    private final static QName _EventListTypeAggregationEvent_QNAME = new QName("", "AggregationEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ow2.aspirerfid.commons.epcis.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryResultsExtensionType }
     * 
     */
    public QueryResultsExtensionType createQueryResultsExtensionType() {
        return new QueryResultsExtensionType();
    }

    /**
     * Create an instance of {@link DuplicateNameException }
     * 
     */
    public DuplicateNameException createDuplicateNameException() {
        return new DuplicateNameException();
    }

    /**
     * Create an instance of {@link EPCISQueryBodyType }
     * 
     */
    public EPCISQueryBodyType createEPCISQueryBodyType() {
        return new EPCISQueryBodyType();
    }

    /**
     * Create an instance of {@link EPCISQueryDocumentExtensionType }
     * 
     */
    public EPCISQueryDocumentExtensionType createEPCISQueryDocumentExtensionType() {
        return new EPCISQueryDocumentExtensionType();
    }

    /**
     * Create an instance of {@link EPCISEventExtensionType }
     * 
     */
    public EPCISEventExtensionType createEPCISEventExtensionType() {
        return new EPCISEventExtensionType();
    }

    /**
     * Create an instance of {@link QueryParameterException }
     * 
     */
    public QueryParameterException createQueryParameterException() {
        return new QueryParameterException();
    }

    /**
     * Create an instance of {@link EPCISBodyExtensionType }
     * 
     */
    public EPCISBodyExtensionType createEPCISBodyExtensionType() {
        return new EPCISBodyExtensionType();
    }

    /**
     * Create an instance of {@link VocabularyElementListType }
     * 
     */
    public VocabularyElementListType createVocabularyElementListType() {
        return new VocabularyElementListType();
    }

    /**
     * Create an instance of {@link NoSuchNameException }
     * 
     */
    public NoSuchNameException createNoSuchNameException() {
        return new NoSuchNameException();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link StandardBusinessDocument }
     * 
     */
    public StandardBusinessDocument createStandardBusinessDocument() {
        return new StandardBusinessDocument();
    }

    /**
     * Create an instance of {@link EPCISException }
     * 
     */
    public EPCISException createEPCISException() {
        return new EPCISException();
    }

    /**
     * Create an instance of {@link ObjectEventType }
     * 
     */
    public ObjectEventType createObjectEventType() {
        return new ObjectEventType();
    }

    /**
     * Create an instance of {@link BusinessScope }
     * 
     */
    public BusinessScope createBusinessScope() {
        return new BusinessScope();
    }

    /**
     * Create an instance of {@link EPCISBodyType }
     * 
     */
    public EPCISBodyType createEPCISBodyType() {
        return new EPCISBodyType();
    }

    /**
     * Create an instance of {@link EPCISQueryDocumentType }
     * 
     */
    public EPCISQueryDocumentType createEPCISQueryDocumentType() {
        return new EPCISQueryDocumentType();
    }

    /**
     * Create an instance of {@link GetSubscriptionIDs }
     * 
     */
    public GetSubscriptionIDs createGetSubscriptionIDs() {
        return new GetSubscriptionIDs();
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     */
    public ContactInformation createContactInformation() {
        return new ContactInformation();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link SubscriptionControlsExtensionType }
     * 
     */
    public SubscriptionControlsExtensionType createSubscriptionControlsExtensionType() {
        return new SubscriptionControlsExtensionType();
    }

    /**
     * Create an instance of {@link DuplicateSubscriptionException }
     * 
     */
    public DuplicateSubscriptionException createDuplicateSubscriptionException() {
        return new DuplicateSubscriptionException();
    }

    /**
     * Create an instance of {@link BusinessLocationType }
     * 
     */
    public BusinessLocationType createBusinessLocationType() {
        return new BusinessLocationType();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link SubscriptionControlsException }
     * 
     */
    public SubscriptionControlsException createSubscriptionControlsException() {
        return new SubscriptionControlsException();
    }

    /**
     * Create an instance of {@link BusinessTransactionType }
     * 
     */
    public BusinessTransactionType createBusinessTransactionType() {
        return new BusinessTransactionType();
    }

    /**
     * Create an instance of {@link ObjectEventExtensionType }
     * 
     */
    public ObjectEventExtensionType createObjectEventExtensionType() {
        return new ObjectEventExtensionType();
    }

    /**
     * Create an instance of {@link DocumentIdentification }
     * 
     */
    public DocumentIdentification createDocumentIdentification() {
        return new DocumentIdentification();
    }

    /**
     * Create an instance of {@link EPCISDocumentType }
     * 
     */
    public EPCISDocumentType createEPCISDocumentType() {
        return new EPCISDocumentType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataHeaderExtensionType }
     * 
     */
    public EPCISMasterDataHeaderExtensionType createEPCISMasterDataHeaderExtensionType() {
        return new EPCISMasterDataHeaderExtensionType();
    }

    /**
     * Create an instance of {@link QueryParam }
     * 
     */
    public QueryParam createQueryParam() {
        return new QueryParam();
    }

    /**
     * Create an instance of {@link EventListType }
     * 
     */
    public EventListType createEventListType() {
        return new EventListType();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader }
     * 
     */
    public StandardBusinessDocumentHeader createStandardBusinessDocumentHeader() {
        return new StandardBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link NoSuchSubscriptionException }
     * 
     */
    public NoSuchSubscriptionException createNoSuchSubscriptionException() {
        return new NoSuchSubscriptionException();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link EPCISDocumentExtensionType }
     * 
     */
    public EPCISDocumentExtensionType createEPCISDocumentExtensionType() {
        return new EPCISDocumentExtensionType();
    }

    /**
     * Create an instance of {@link ReadPointExtensionType }
     * 
     */
    public ReadPointExtensionType createReadPointExtensionType() {
        return new ReadPointExtensionType();
    }

    /**
     * Create an instance of {@link Scope }
     * 
     */
    public Scope createScope() {
        return new Scope();
    }

    /**
     * Create an instance of {@link QueryTooLargeException }
     * 
     */
    public QueryTooLargeException createQueryTooLargeException() {
        return new QueryTooLargeException();
    }

    /**
     * Create an instance of {@link AggregationEventExtensionType }
     * 
     */
    public AggregationEventExtensionType createAggregationEventExtensionType() {
        return new AggregationEventExtensionType();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link TransactionEventExtensionType }
     * 
     */
    public TransactionEventExtensionType createTransactionEventExtensionType() {
        return new TransactionEventExtensionType();
    }

    /**
     * Create an instance of {@link BusinessLocationExtensionType }
     * 
     */
    public BusinessLocationExtensionType createBusinessLocationExtensionType() {
        return new BusinessLocationExtensionType();
    }

    /**
     * Create an instance of {@link QuantityEventType }
     * 
     */
    public QuantityEventType createQuantityEventType() {
        return new QuantityEventType();
    }

    /**
     * Create an instance of {@link QueryScheduleExtensionType }
     * 
     */
    public QueryScheduleExtensionType createQueryScheduleExtensionType() {
        return new QueryScheduleExtensionType();
    }

    /**
     * Create an instance of {@link SecurityException }
     * 
     */
    public SecurityException createSecurityException() {
        return new SecurityException();
    }

    /**
     * Create an instance of {@link SubscriptionControls }
     * 
     */
    public SubscriptionControls createSubscriptionControls() {
        return new SubscriptionControls();
    }

    /**
     * Create an instance of {@link BusinessTransactionListType }
     * 
     */
    public BusinessTransactionListType createBusinessTransactionListType() {
        return new BusinessTransactionListType();
    }

    /**
     * Create an instance of {@link ManifestItem }
     * 
     */
    public ManifestItem createManifestItem() {
        return new ManifestItem();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link EPCListType }
     * 
     */
    public EPCListType createEPCListType() {
        return new EPCListType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataDocumentType }
     * 
     */
    public EPCISMasterDataDocumentType createEPCISMasterDataDocumentType() {
        return new EPCISMasterDataDocumentType();
    }

    /**
     * Create an instance of {@link InvalidURIException }
     * 
     */
    public InvalidURIException createInvalidURIException() {
        return new InvalidURIException();
    }

    /**
     * Create an instance of {@link QueryParams }
     * 
     */
    public QueryParams createQueryParams() {
        return new QueryParams();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link IDListType }
     * 
     */
    public IDListType createIDListType() {
        return new IDListType();
    }

    /**
     * Create an instance of {@link VocabularyType }
     * 
     */
    public VocabularyType createVocabularyType() {
        return new VocabularyType();
    }

    /**
     * Create an instance of {@link QueryResultsBody }
     * 
     */
    public QueryResultsBody createQueryResultsBody() {
        return new QueryResultsBody();
    }

    /**
     * Create an instance of {@link BusinessService }
     * 
     */
    public BusinessService createBusinessService() {
        return new BusinessService();
    }

    /**
     * Create an instance of {@link EPCISEventListExtensionType }
     * 
     */
    public EPCISEventListExtensionType createEPCISEventListExtensionType() {
        return new EPCISEventListExtensionType();
    }

    /**
     * Create an instance of {@link EPCISHeaderExtensionType }
     * 
     */
    public EPCISHeaderExtensionType createEPCISHeaderExtensionType() {
        return new EPCISHeaderExtensionType();
    }

    /**
     * Create an instance of {@link QueryTooComplexException }
     * 
     */
    public QueryTooComplexException createQueryTooComplexException() {
        return new QueryTooComplexException();
    }

    /**
     * Create an instance of {@link VocabularyElementExtensionType }
     * 
     */
    public VocabularyElementExtensionType createVocabularyElementExtensionType() {
        return new VocabularyElementExtensionType();
    }

    /**
     * Create an instance of {@link QuerySchedule }
     * 
     */
    public QuerySchedule createQuerySchedule() {
        return new QuerySchedule();
    }

    /**
     * Create an instance of {@link AggregationEventType }
     * 
     */
    public AggregationEventType createAggregationEventType() {
        return new AggregationEventType();
    }

    /**
     * Create an instance of {@link CorrelationInformation }
     * 
     */
    public CorrelationInformation createCorrelationInformation() {
        return new CorrelationInformation();
    }

    /**
     * Create an instance of {@link EPCISMasterDataDocumentExtensionType }
     * 
     */
    public EPCISMasterDataDocumentExtensionType createEPCISMasterDataDocumentExtensionType() {
        return new EPCISMasterDataDocumentExtensionType();
    }

    /**
     * Create an instance of {@link EPCISHeaderType }
     * 
     */
    public EPCISHeaderType createEPCISHeaderType() {
        return new EPCISHeaderType();
    }

    /**
     * Create an instance of {@link EmptyParms }
     * 
     */
    public EmptyParms createEmptyParms() {
        return new EmptyParms();
    }

    /**
     * Create an instance of {@link VocabularyExtensionType }
     * 
     */
    public VocabularyExtensionType createVocabularyExtensionType() {
        return new VocabularyExtensionType();
    }

    /**
     * Create an instance of {@link VocabularyElementType }
     * 
     */
    public VocabularyElementType createVocabularyElementType() {
        return new VocabularyElementType();
    }

    /**
     * Create an instance of {@link QueryResults }
     * 
     */
    public QueryResults createQueryResults() {
        return new QueryResults();
    }

    /**
     * Create an instance of {@link SubscribeNotPermittedException }
     * 
     */
    public SubscribeNotPermittedException createSubscribeNotPermittedException() {
        return new SubscribeNotPermittedException();
    }

    /**
     * Create an instance of {@link VoidHolder }
     * 
     */
    public VoidHolder createVoidHolder() {
        return new VoidHolder();
    }

    /**
     * Create an instance of {@link Poll }
     * 
     */
    public Poll createPoll() {
        return new Poll();
    }

    /**
     * Create an instance of {@link ServiceTransaction }
     * 
     */
    public ServiceTransaction createServiceTransaction() {
        return new ServiceTransaction();
    }

    /**
     * Create an instance of {@link VocabularyListType }
     * 
     */
    public VocabularyListType createVocabularyListType() {
        return new VocabularyListType();
    }

    /**
     * Create an instance of {@link QuantityEventExtensionType }
     * 
     */
    public QuantityEventExtensionType createQuantityEventExtensionType() {
        return new QuantityEventExtensionType();
    }

    /**
     * Create an instance of {@link ReadPointType }
     * 
     */
    public ReadPointType createReadPointType() {
        return new ReadPointType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataBodyType }
     * 
     */
    public EPCISMasterDataBodyType createEPCISMasterDataBodyType() {
        return new EPCISMasterDataBodyType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataBodyExtensionType }
     * 
     */
    public EPCISMasterDataBodyExtensionType createEPCISMasterDataBodyExtensionType() {
        return new EPCISMasterDataBodyExtensionType();
    }

    /**
     * Create an instance of {@link PartnerIdentification }
     * 
     */
    public PartnerIdentification createPartnerIdentification() {
        return new PartnerIdentification();
    }

    /**
     * Create an instance of {@link ImplementationException }
     * 
     */
    public ImplementationException createImplementationException() {
        return new ImplementationException();
    }

    /**
     * Create an instance of {@link TransactionEventType }
     * 
     */
    public TransactionEventType createTransactionEventType() {
        return new TransactionEventType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryParameterException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "QueryParameterException")
    public JAXBElement<QueryParameterException> createQueryParameterException(QueryParameterException value) {
        return new JAXBElement<QueryParameterException>(_QueryParameterException_QNAME, QueryParameterException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPCISException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "EPCISException")
    public JAXBElement<EPCISException> createEPCISException(EPCISException value) {
        return new JAXBElement<EPCISException>(_EPCISException_QNAME, EPCISException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeNotPermittedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "SubscribeNotPermittedException")
    public JAXBElement<SubscribeNotPermittedException> createSubscribeNotPermittedException(SubscribeNotPermittedException value) {
        return new JAXBElement<SubscribeNotPermittedException>(_SubscribeNotPermittedException_QNAME, SubscribeNotPermittedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidURIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "InvalidURIException")
    public JAXBElement<InvalidURIException> createInvalidURIException(InvalidURIException value) {
        return new JAXBElement<InvalidURIException>(_InvalidURIException_QNAME, InvalidURIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionControlsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "SubscriptionControlsException")
    public JAXBElement<SubscriptionControlsException> createSubscriptionControlsException(SubscriptionControlsException value) {
        return new JAXBElement<SubscriptionControlsException>(_SubscriptionControlsException_QNAME, SubscriptionControlsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPCISDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis:xsd:1", name = "EPCISDocument")
    public JAXBElement<EPCISDocumentType> createEPCISDocument(EPCISDocumentType value) {
        return new JAXBElement<EPCISDocumentType>(_EPCISDocument_QNAME, EPCISDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "SecurityException")
    public JAXBElement<SecurityException> createSecurityException(SecurityException value) {
        return new JAXBElement<SecurityException>(_SecurityException_QNAME, SecurityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchNameException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "NoSuchNameException")
    public JAXBElement<NoSuchNameException> createNoSuchNameException(NoSuchNameException value) {
        return new JAXBElement<NoSuchNameException>(_NoSuchNameException_QNAME, NoSuchNameException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardBusinessDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", name = "StandardBusinessDocument")
    public JAXBElement<StandardBusinessDocument> createStandardBusinessDocument(StandardBusinessDocument value) {
        return new JAXBElement<StandardBusinessDocument>(_StandardBusinessDocument_QNAME, StandardBusinessDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "VoidHolder")
    public JAXBElement<VoidHolder> createVoidHolder(VoidHolder value) {
        return new JAXBElement<VoidHolder>(_VoidHolder_QNAME, VoidHolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "Subscribe")
    public JAXBElement<Subscribe> createSubscribe(Subscribe value) {
        return new JAXBElement<Subscribe>(_Subscribe_QNAME, Subscribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateSubscriptionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "DuplicateSubscriptionException")
    public JAXBElement<DuplicateSubscriptionException> createDuplicateSubscriptionException(DuplicateSubscriptionException value) {
        return new JAXBElement<DuplicateSubscriptionException>(_DuplicateSubscriptionException_QNAME, DuplicateSubscriptionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTooLargeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "QueryTooLargeException")
    public JAXBElement<QueryTooLargeException> createQueryTooLargeException(QueryTooLargeException value) {
        return new JAXBElement<QueryTooLargeException>(_QueryTooLargeException_QNAME, QueryTooLargeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionIDs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetSubscriptionIDs")
    public JAXBElement<GetSubscriptionIDs> createGetSubscriptionIDs(GetSubscriptionIDs value) {
        return new JAXBElement<GetSubscriptionIDs>(_GetSubscriptionIDs_QNAME, GetSubscriptionIDs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "UnsubscribeResult")
    public JAXBElement<VoidHolder> createUnsubscribeResult(VoidHolder value) {
        return new JAXBElement<VoidHolder>(_UnsubscribeResult_QNAME, VoidHolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPCISQueryDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "EPCISQueryDocument")
    public JAXBElement<EPCISQueryDocumentType> createEPCISQueryDocument(EPCISQueryDocumentType value) {
        return new JAXBElement<EPCISQueryDocumentType>(_EPCISQueryDocument_QNAME, EPCISQueryDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", name = "ScopeInformation")
    public JAXBElement<Object> createScopeInformation(Object value) {
        return new JAXBElement<Object>(_ScopeInformation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrelationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", name = "CorrelationInformation", substitutionHeadNamespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", substitutionHeadName = "ScopeInformation")
    public JAXBElement<CorrelationInformation> createCorrelationInformation(CorrelationInformation value) {
        return new JAXBElement<CorrelationInformation>(_CorrelationInformation_QNAME, CorrelationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetQueryNamesResult")
    public JAXBElement<ArrayOfString> createGetQueryNamesResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetQueryNamesResult_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTooComplexException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "QueryTooComplexException")
    public JAXBElement<QueryTooComplexException> createQueryTooComplexException(QueryTooComplexException value) {
        return new JAXBElement<QueryTooComplexException>(_QueryTooComplexException_QNAME, QueryTooComplexException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPCISMasterDataDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-masterdata:xsd:1", name = "EPCISMasterDataDocument")
    public JAXBElement<EPCISMasterDataDocumentType> createEPCISMasterDataDocument(EPCISMasterDataDocumentType value) {
        return new JAXBElement<EPCISMasterDataDocumentType>(_EPCISMasterDataDocument_QNAME, EPCISMasterDataDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetSubscriptionIDsResult")
    public JAXBElement<ArrayOfString> createGetSubscriptionIDsResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetSubscriptionIDsResult_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetVendorVersionResult")
    public JAXBElement<String> createGetVendorVersionResult(String value) {
        return new JAXBElement<String>(_GetVendorVersionResult_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardBusinessDocumentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", name = "StandardBusinessDocumentHeader")
    public JAXBElement<StandardBusinessDocumentHeader> createStandardBusinessDocumentHeader(StandardBusinessDocumentHeader value) {
        return new JAXBElement<StandardBusinessDocumentHeader>(_StandardBusinessDocumentHeader_QNAME, StandardBusinessDocumentHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "SubscribeResult")
    public JAXBElement<VoidHolder> createSubscribeResult(VoidHolder value) {
        return new JAXBElement<VoidHolder>(_SubscribeResult_QNAME, VoidHolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyParms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetVendorVersion")
    public JAXBElement<EmptyParms> createGetVendorVersion(EmptyParms value) {
        return new JAXBElement<EmptyParms>(_GetVendorVersion_QNAME, EmptyParms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unsubscribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "Unsubscribe")
    public JAXBElement<Unsubscribe> createUnsubscribe(Unsubscribe value) {
        return new JAXBElement<Unsubscribe>(_Unsubscribe_QNAME, Unsubscribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyParms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetQueryNames")
    public JAXBElement<EmptyParms> createGetQueryNames(EmptyParms value) {
        return new JAXBElement<EmptyParms>(_GetQueryNames_QNAME, EmptyParms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "QueryResults")
    public JAXBElement<QueryResults> createQueryResults(QueryResults value) {
        return new JAXBElement<QueryResults>(_QueryResults_QNAME, QueryResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Poll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "Poll")
    public JAXBElement<Poll> createPoll(Poll value) {
        return new JAXBElement<Poll>(_Poll_QNAME, Poll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyParms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetStandardVersion")
    public JAXBElement<EmptyParms> createGetStandardVersion(EmptyParms value) {
        return new JAXBElement<EmptyParms>(_GetStandardVersion_QNAME, EmptyParms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", name = "BusinessService", substitutionHeadNamespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", substitutionHeadName = "ScopeInformation")
    public JAXBElement<BusinessService> createBusinessService(BusinessService value) {
        return new JAXBElement<BusinessService>(_BusinessService_QNAME, BusinessService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateNameException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "DuplicateNameException")
    public JAXBElement<DuplicateNameException> createDuplicateNameException(DuplicateNameException value) {
        return new JAXBElement<DuplicateNameException>(_DuplicateNameException_QNAME, DuplicateNameException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "GetStandardVersionResult")
    public JAXBElement<String> createGetStandardVersionResult(String value) {
        return new JAXBElement<String>(_GetStandardVersionResult_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImplementationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "ImplementationException")
    public JAXBElement<ImplementationException> createImplementationException(ImplementationException value) {
        return new JAXBElement<ImplementationException>(_ImplementationException_QNAME, ImplementationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchSubscriptionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epcglobal:epcis-query:xsd:1", name = "NoSuchSubscriptionException")
    public JAXBElement<NoSuchSubscriptionException> createNoSuchSubscriptionException(NoSuchSubscriptionException value) {
        return new JAXBElement<NoSuchSubscriptionException>(_NoSuchSubscriptionException_QNAME, NoSuchSubscriptionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPCISEventListExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extension", scope = EventListType.class)
    public JAXBElement<EPCISEventListExtensionType> createEventListTypeExtension(EPCISEventListExtensionType value) {
        return new JAXBElement<EPCISEventListExtensionType>(_EventListTypeExtension_QNAME, EPCISEventListExtensionType.class, EventListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ObjectEvent", scope = EventListType.class)
    public JAXBElement<ObjectEventType> createEventListTypeObjectEvent(ObjectEventType value) {
        return new JAXBElement<ObjectEventType>(_EventListTypeObjectEvent_QNAME, ObjectEventType.class, EventListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransactionEvent", scope = EventListType.class)
    public JAXBElement<TransactionEventType> createEventListTypeTransactionEvent(TransactionEventType value) {
        return new JAXBElement<TransactionEventType>(_EventListTypeTransactionEvent_QNAME, TransactionEventType.class, EventListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QuantityEvent", scope = EventListType.class)
    public JAXBElement<QuantityEventType> createEventListTypeQuantityEvent(QuantityEventType value) {
        return new JAXBElement<QuantityEventType>(_EventListTypeQuantityEvent_QNAME, QuantityEventType.class, EventListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregationEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AggregationEvent", scope = EventListType.class)
    public JAXBElement<AggregationEventType> createEventListTypeAggregationEvent(AggregationEventType value) {
        return new JAXBElement<AggregationEventType>(_EventListTypeAggregationEvent_QNAME, AggregationEventType.class, EventListType.class, value);
    }

}
