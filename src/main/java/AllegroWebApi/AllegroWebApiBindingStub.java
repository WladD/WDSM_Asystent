/**
 * AllegroWebApiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class AllegroWebApiBindingStub extends org.apache.axis.client.Stub implements AllegroWebApi.AllegroWebApiPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[118];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "it-description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-add-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-desc-to-long"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageInfoStruct"), AllegroWebApi.PackageInfoStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormPackageInfoStruct"));
        oper.setReturnClass(AllegroWebApi.PostBuyFormPackageInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-package-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-black-list-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct"), AllegroWebApi.UserBlackListStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct"));
        oper.setReturnClass(AllegroWebApi.UserBlackListAddResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-black-list-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchListInfoStruct"));
        oper.setReturnClass(AllegroWebApi.WatchListInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watch-list-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-it-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-user-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-buy-now"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pharmacy-recipient-data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyRecipientDataStruct"), AllegroWebApi.PharmacyRecipientDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variant-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bid-price"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-add-to-black-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bid-value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancellation-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields-to-modify"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), AllegroWebApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields-to-remove"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsId"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preview-only"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), AllegroWebApi.VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), AllegroWebApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ChangedItemStruct"));
        oper.setReturnClass(AllegroWebApi.ChangedItemStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changed-item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-starting-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-reserve-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-buy-now-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-item-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-left"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-sold"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description-content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemDescriptionStruct"));
        oper.setReturnClass(AllegroWebApi.ItemDescriptionStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-description"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), AllegroWebApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), AllegroWebApi.VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), AllegroWebApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price-desc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), AllegroWebApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CreatedItemTemplateStruct"));
        oper.setReturnClass(AllegroWebApi.CreatedItemTemplateStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "created-item-template"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-use-comment-template"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-to-user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-op"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-rating"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct"), AllegroWebApi.SellRatingEstimationStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedbacks-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct"), AllegroWebApi.FeedbackManyStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult"));
        oper.setReturnClass(AllegroWebApi.FeedbackResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-all-bids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "finish-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct"), AllegroWebApi.FinishItemsStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-succeed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct"), AllegroWebApi.FinishFailureStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2"));
        oper.setReturnClass(AllegroWebApi.BidListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "biditem-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct"));
        oper.setReturnClass(AllegroWebApi.BlackListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-users"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCategoryData"));
        oper.setReturnClass(AllegroWebApi.CategoryData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "category-path"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), AllegroWebApi.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), AllegroWebApi.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries"));
        oper.setReturnClass(AllegroWebApi.CountryInfoType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "country-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct"));
        oper.setReturnClass(AllegroWebApi.DealsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deals-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories"));
        oper.setReturnClass(AllegroWebApi.FavouritesCategoriesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-categories-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers"));
        oper.setReturnClass(AllegroWebApi.FavouritesSellersStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-sellers-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-kind-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList"), AllegroWebApi.FeedbackList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filling-time-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filling-time-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FilledPostBuyFormsStruct"));
        oper.setReturnClass(AllegroWebApi.FilledPostBuyFormsStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "filled-post-buy-forms"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"));
        oper.setReturnClass(AllegroWebApi.FieldsValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-fields"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplatesStruct"));
        oper.setReturnClass(AllegroWebApi.ItemTemplatesStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-templates"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage"), AllegroWebApi.ItemGetImage[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "image-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct"));
        oper.setReturnClass(AllegroWebApi.ItemImagesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get_items_images_result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-product-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-item-list-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList"), AllegroWebApi.ItemInfoStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-admin-killed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "MessageToBuyerStruct"));
        oper.setReturnClass(AllegroWebApi.MessageToBuyerStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message-to-buyer"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressesInfoStruct"));
        oper.setReturnClass(AllegroWebApi.AddressInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addresses-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidItemStruct"), AllegroWebApi.BidItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "shipment-price-type-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct"), AllegroWebApi.UserDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct"), AllegroWebApi.InvoiceDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-extra-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct"), AllegroWebApi.CompanyExtraDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-second-address"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct"), AllegroWebApi.CompanySecondAddressStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pharmacy-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct"), AllegroWebApi.PharmacyDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "alcohol-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct"), AllegroWebApi.AlcoholDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "related-persons"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedPersonsStruct"), AllegroWebApi.RelatedPersonsStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureFilterOptionsStruct"), AllegroWebApi.FutureFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "future-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "future-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFutureItemStruct"), AllegroWebApi.FutureItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct"));
        oper.setReturnClass(AllegroWebApi.UserIncomingPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct"));
        oper.setReturnClass(AllegroWebApi.UserIncomingPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldFilterOptionsStruct"), AllegroWebApi.NotSoldFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-sold-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-sold-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotSoldItemStruct"), AllegroWebApi.NotSoldItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-won-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-won-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotWonItemStruct"), AllegroWebApi.NotWonItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-time-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-time-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct"));
        oper.setReturnClass(AllegroWebApi.UserPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsInfoStruct"));
        oper.setReturnClass(AllegroWebApi.PaymentsInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payments-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct"));
        oper.setReturnClass(AllegroWebApi.UserPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct"));
        oper.setReturnClass(AllegroWebApi.UserPayoutStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payout"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFilterOptionsStruct"), AllegroWebApi.SellFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellItemStruct"), AllegroWebApi.SellItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-total-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), AllegroWebApi.SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-details"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct"), AllegroWebApi.SellRatingDetailStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth"), AllegroWebApi.SellRatingAveragePerMonthStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldFilterOptionsStruct"), AllegroWebApi.SoldFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sold-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sold-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSoldItemStruct"), AllegroWebApi.SoldItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watch-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watch-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchItemStruct"), AllegroWebApi.WatchItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watched-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watched-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchedItemStruct"), AllegroWebApi.WatchedItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), AllegroWebApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "won-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "won-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWonItemStruct"), AllegroWebApi.WonItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling"));
        oper.setReturnClass(AllegroWebApi.BillingDataType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payment-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentMethodStruct"));
        oper.setReturnClass(AllegroWebApi.PaymentMethodStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payment-methods"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-filter-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBuyerId"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData"));
        oper.setReturnClass(AllegroWebApi.ItemPostBuyDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "items-post-buy-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactions-ids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormForBuyersDataStruct"));
        oper.setReturnClass(AllegroWebApi.PostBuyFormForBuyersDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-data-for-buyers"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactions-ids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct"));
        oper.setReturnClass(AllegroWebApi.PostBuyFormDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyItemInfoStruct"));
        oper.setReturnClass(AllegroWebApi.PostBuyItemInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-post-buy-form-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType"), AllegroWebApi.FilterOptionsType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deals-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deals-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundsDealsListType"), AllegroWebApi.RefundsDealsListType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType"), AllegroWebApi.FiltersListType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType"), AllegroWebApi.FilterOptionsType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refunds-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refunds-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundListType"), AllegroWebApi.RefundListType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType"), AllegroWebApi.FiltersListType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsStruct"));
        oper.setReturnClass(AllegroWebApi.RelatedItemsStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "related-items"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), AllegroWebApi.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), AllegroWebApi.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), AllegroWebApi.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), AllegroWebApi.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormFieldsForCategoryStruct"));
        oper.setReturnClass(AllegroWebApi.SellFormFieldsForCategoryStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sell-form-fields-for-category"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), AllegroWebApi.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct"));
        oper.setReturnClass(AllegroWebApi.SellRatingInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sell-rating-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-data-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct"), AllegroWebApi.ShipmentDataStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsShipmentDataStruct"));
        oper.setReturnClass(AllegroWebApi.RelatedItemsShipmentDataStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "related-items-shipment-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPriceTypeStruct"));
        oper.setReturnClass(AllegroWebApi.ShipmentPriceTypeStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "shipment-price-types"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopsTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shops-tags-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shops-tags"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShopsTagTypeStruct"), AllegroWebApi.ShopsTagTypeStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray"));
        oper.setReturnClass(AllegroWebApi.SiteJournal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "journal-start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSiteJournalDealsStruct"));
        oper.setReturnClass(AllegroWebApi.SiteJournalDealsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-deals"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "journal-start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsInfoStruct"));
        oper.setReturnClass(AllegroWebApi.SiteJournalDealsInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-deals-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo"));
        oper.setReturnClass(AllegroWebApi.SiteJournalInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct"));
        oper.setReturnClass(AllegroWebApi.StateInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "states-info-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "server-time"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentIds"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "transactions-ids-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-login"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct"));
        oper.setReturnClass(AllegroWebApi.WaitFeedbackStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-wait-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalIStoreChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "istore-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valid-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalSendMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail_template_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-of-additional-data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAdditionalData"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-hash-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "access-token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2"));
        oper.setReturnClass(AllegroWebApi.MyAccountStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-items-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "my-billing"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entry-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), AllegroWebApi.ItemBilling[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ending-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), AllegroWebApi.ItemBilling[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auction-id-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList"));
        oper.setReturnClass(AllegroWebApi.MyContactList[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mycontact-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(AllegroWebApi.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(AllegroWebApi.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), AllegroWebApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-create"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateCreateStruct"), AllegroWebApi.ItemTemplateCreateStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), AllegroWebApi.VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), AllegroWebApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus"));
        oper.setReturnClass(AllegroWebApi.SysStatusType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sys-country-status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sysvar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct"));
        oper.setReturnClass(AllegroWebApi.BlackListResStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct"));
        oper.setReturnClass(AllegroWebApi.ItemRemoveWatchStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watch-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RemovedItemTemplatesStruct"));
        oper.setReturnClass(AllegroWebApi.RemovedItemTemplatesStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removed-item-templates"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RequestPayoutStruct"));
        oper.setReturnClass(AllegroWebApi.RequestPayoutStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request-payout"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-message-to-buyer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "surcharge-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-auction-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-prolong-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), AllegroWebApi.StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), AllegroWebApi.StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-prolong-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), AllegroWebApi.StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), AllegroWebApi.StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-subject-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mail-to-user-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-post-buy-form-seller"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNewPostBuyFormSellerStruct"), AllegroWebApi.NewPostBuyFormSellerStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-post-buy-form-common"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormCommonStruct"), AllegroWebApi.NewPostBuyFormCommonStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormStruct"));
        oper.setReturnClass(AllegroWebApi.PostBuyFormStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-price-type-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "operation-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "set-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-product-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-list-info-ext"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt"), AllegroWebApi.ItemInfoExt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-cat-path"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList"), AllegroWebApi.ItemCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-img-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList"), AllegroWebApi.ItemImageList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-attrib-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct"), AllegroWebApi.AttribStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-postage-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct"), AllegroWebApi.PostageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-payment-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions"), AllegroWebApi.ItemPaymentOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-company-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct"), AllegroWebApi.CompanyInfoStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-product-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct"), AllegroWebApi.ProductStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-variants"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantStruct"), AllegroWebApi.ItemVariantStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-country"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-create-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-rating"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-new-user"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-not-activated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-closed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-blocked"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-terminated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-page"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-sseller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-eco"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-positive-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), AllegroWebApi.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-negative-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), AllegroWebApi.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-neutral-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), AllegroWebApi.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-junior-status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-shop"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-company-icon"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), AllegroWebApi.SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-b2c-seller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUserPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-content"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-pharmacy-permit"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-alcohol-permit"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-listed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-starting-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

    }

    public AllegroWebApiBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AllegroWebApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AllegroWebApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressesInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AddressInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfActionDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ActionDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ActionDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAdditionalData");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AttribStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBankAccounts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BidItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BidListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BillingDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BlackListResStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBuyerId");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCategoryData");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CategoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CategoryData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CatInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CountryInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.DealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FavouritesCategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FavouritesSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackManyStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsId");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FieldsValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterOptionsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterOptionsType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FiltersListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FiltersListType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterValueType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterValueType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FinishFailureStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FinishItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFutureItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FutureItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemGetImage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemImageList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemImagesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemPriceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPriceStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemReminderStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemReminderStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemRemoveWatchStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsAdded");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemsNotAddedStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemSurchargeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemSurchargeStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemTemplateListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateListStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemVariantAttributeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantAttributeStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemVariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyAccountStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyContactList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyFeedbackListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NewPostBuyFormSellerStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormSellerStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NotSoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NotWonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotWonItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageIds");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PackageInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PackageInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentDetailsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentItemsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentMethodStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentMethodStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentSellersStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormForBuyersDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormForBuyersDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormItemDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormSellersStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormShipmentTrackingStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormSurcharges");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyItemInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductImagesList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ProductParametersGroupStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersGroupStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ProductParametersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParameterValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RefundListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundListType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RefundsDealsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundsDealsListType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RelatedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationAnd");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationExclude");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationOr");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellerShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerShipmentDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellFormType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingAveragePerMonthStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingAverageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingDetailStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingEstimationStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingReasonStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingReasonSumStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingStatsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentIds");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentPaymentInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentPriceTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPriceTypeStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShopsTagTypeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShopsTagTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShopsTagTypeStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournalDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StateInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StructSellAgain[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StructSellFailed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SysStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.TagNameStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TagNameStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserBlackListAddResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserBlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserIncomingPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserIncomingPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPayoutStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersPostBuyData");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.VariantQuantityStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantQuantityStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.VariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WaitFeedbackStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WatchedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchedItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WatchItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWonItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WonItemStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidList2");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CategoryData");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemBilling[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemGetImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemImagesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemReminderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemRemoveWatchStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemsNotAddedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemVariantAttributeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ItemVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountList2");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackList2");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsVariantStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormItemDealsVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShopsTagTypeStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShopsTagTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TagNameStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.TagNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WatchedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WatchItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchListInfoStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WatchListInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = AllegroWebApi.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAddId, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doadddesctoitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsIdArray, itDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                arrayItemsAddId.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-add-id"));
            } catch (java.lang.Exception _exception) {
                arrayItemsAddId.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-add-id")), long[].class);
            }
            try {
                arrayItemsDescToLong.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long"));
            } catch (java.lang.Exception _exception) {
                arrayItemsDescToLong.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long")), long[].class);
            }
            try {
                arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
            } catch (java.lang.Exception _exception) {
                arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(java.lang.String sessionId, long transactionId, AllegroWebApi.PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddpackageinfotopostbuyform");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(transactionId), packageInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PostBuyFormPackageInfoStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PostBuyFormPackageInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PostBuyFormPackageInfoStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, AllegroWebApi.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddtoblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, usersBlackListArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserBlackListAddResultStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserBlackListAddResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserBlackListAddResultStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.WatchListInfoStruct doAddToWatchList(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddtowatchlist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.WatchListInfoStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.WatchListInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.WatchListInfoStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, AllegroWebApi.PharmacyRecipientDataStruct pharmacyRecipientData, java.lang.String variantId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dobiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(bidItId), new java.lang.Float(bidUserPrice), new java.lang.Long(bidQuantity), new java.lang.Long(bidBuyNow), pharmacyRecipientData, variantId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder cancelledBids, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docancelbiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(cancelItemId), cancelBidsArray, cancelBidsReason, new java.lang.Long(cancelAddToBlackList)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                cancelBidValue.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cancel-bid-value"))).intValue();
            } catch (java.lang.Exception _exception) {
                cancelBidValue.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancel-bid-value")), int.class)).intValue();
            }
            try {
                cancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "cancelled-bids"));
            } catch (java.lang.Exception _exception) {
                cancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancelled-bids")), int[].class);
            }
            try {
                notCancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "not-cancelled-bids"));
            } catch (java.lang.Exception _exception) {
                notCancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-cancelled-bids")), int[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doCancelTransaction(java.lang.String sessionId, long transactionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docanceltransaction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(transactionId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ChangedItemStruct doChangeItemFields(java.lang.String sessionId, long itemId, AllegroWebApi.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangeitemfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(itemId), fieldsToModify, fieldsToRemove, new java.lang.Integer(previewOnly), variants, tags});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ChangedItemStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ChangedItemStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ChangedItemStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangepriceitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId.value), new java.lang.Float(newStartingPrice), new java.lang.Float(newReservePrice), new java.lang.Float(newBuyNowPrice)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangequantityitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId.value), new java.lang.Integer(newItemQuantity)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
            }
            try {
                itemInfo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-info"));
            } catch (java.lang.Exception _exception) {
                itemInfo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), java.lang.String.class);
            }
            try {
                itemQuantityLeft.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-left"))).intValue();
            } catch (java.lang.Exception _exception) {
                itemQuantityLeft.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-left")), int.class)).intValue();
            }
            try {
                itemQuantitySold.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-sold"))).intValue();
            } catch (java.lang.Exception _exception) {
                itemQuantitySold.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-sold")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ItemDescriptionStruct doCheckItemDescription(java.lang.String sessionId, java.lang.String descriptionContent) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docheckitemdescription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, descriptionContent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ItemDescriptionStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ItemDescriptionStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ItemDescriptionStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doCheckNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochecknewauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, fields, variants, tags});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemPrice.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price"));
            } catch (java.lang.Exception _exception) {
                itemPrice.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price")), java.lang.String.class);
            }
            try {
                itemPriceDesc.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price-desc"));
            } catch (java.lang.Exception _exception) {
                itemPriceDesc.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price-desc")), java.lang.String.class);
            }
            try {
                itemIsAllegroStandard.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard"))).intValue();
            } catch (java.lang.Exception _exception) {
                itemIsAllegroStandard.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.CreatedItemTemplateStruct doCreateItemTemplate(java.lang.String sessionId, java.lang.String itemTemplateName, AllegroWebApi.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docreateitemtemplate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemTemplateName, itemTemplateFields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.CreatedItemTemplateStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.CreatedItemTemplateStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.CreatedItemTemplateStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doFeedback(java.lang.String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, AllegroWebApi.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(feItemId), new java.lang.Integer(feUseCommentTemplate), new java.lang.Integer(feToUserId), feComment, feCommentType, new java.lang.Integer(feOp), feRating});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, AllegroWebApi.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofeedbackmany");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, feedbacksList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.FeedbackResultStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.FeedbackResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.FeedbackResultStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofinishitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(finishItemId), new java.lang.Integer(finishCancelAllBids), finishCancelReason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doFinishItems(java.lang.String sessionHandle, AllegroWebApi.FinishItemsStruct[] finishItemsList, AllegroWebApi.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, AllegroWebApi.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofinishitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, finishItemsList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                finishItemsSucceed.value = (long[]) _output.get(new javax.xml.namespace.QName("", "finish-items-succeed"));
            } catch (java.lang.Exception _exception) {
                finishItemsSucceed.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-succeed")), long[].class);
            }
            try {
                finishItemsFailed.value = (AllegroWebApi.FinishFailureStruct[]) _output.get(new javax.xml.namespace.QName("", "finish-items-failed"));
            } catch (java.lang.Exception _exception) {
                finishItemsFailed.value = (AllegroWebApi.FinishFailureStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-failed")), AllegroWebApi.FinishFailureStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetadminuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {adminSessionHandle, userLicLogin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Float) _resp).floatValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetbiditem2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.BidListStruct2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.BidListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.BidListStruct2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetblacklistusers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.BlackListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.BlackListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.BlackListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.CategoryData[] doGetCategoryPath(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcategorypath");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(categoryId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.CategoryData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.CategoryData[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.CategoryData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                catsList.value = (AllegroWebApi.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
            } catch (java.lang.Exception _exception) {
                catsList.value = (AllegroWebApi.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), AllegroWebApi.CatInfoType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdatacount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                catsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cats-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                catsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-count")), int.class)).intValue();
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdatalimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                catsList.value = (AllegroWebApi.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
            } catch (java.lang.Exception _exception) {
                catsList.value = (AllegroWebApi.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), AllegroWebApi.CatInfoType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcountries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.CountryInfoType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.CountryInfoType[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.CountryInfoType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetdeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId), new java.lang.Integer(buyerId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.DealsStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.DealsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.DealsStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritecategories");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.FavouritesCategoriesStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.FavouritesCategoriesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.FavouritesCategoriesStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritesellers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.FavouritesSellersStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.FavouritesSellersStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.FavouritesSellersStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, AllegroWebApi.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(feedbackFrom), new java.lang.Integer(feedbackTo), new java.lang.Integer(feedbackOffset), feedbackKindList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                feedbackList.value = (AllegroWebApi.FeedbackList[]) _output.get(new javax.xml.namespace.QName("", "feedback-list"));
            } catch (java.lang.Exception _exception) {
                feedbackList.value = (AllegroWebApi.FeedbackList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-list")), AllegroWebApi.FeedbackList[].class);
            }
            try {
                feedbackCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "feedback-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                feedbackCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-count")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.FilledPostBuyFormsStruct doGetFilledPostBuyForms(java.lang.String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfilledpostbuyforms");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(paymentType), new java.lang.Integer(userRole), new java.lang.Long(fillingTimeFrom), new java.lang.Long(fillingTimeTo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.FilledPostBuyFormsStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.FilledPostBuyFormsStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.FilledPostBuyFormsStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.FieldsValue[] doGetItemFields(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(itemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.FieldsValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.FieldsValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.FieldsValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ItemTemplatesStruct doGetItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemtemplates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemTemplateIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ItemTemplatesStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ItemTemplatesStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ItemTemplatesStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, AllegroWebApi.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemsimages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsArray, new java.lang.Integer(imageType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ItemImagesStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ItemImagesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ItemImagesStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsIdArray, new java.lang.Integer(getDesc), new java.lang.Integer(getImageUrl), new java.lang.Integer(getAttribs), new java.lang.Integer(getPostageOptions), new java.lang.Integer(getCompanyInfo), new java.lang.Integer(getProductInfo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                arrayItemListInfo.value = (AllegroWebApi.ItemInfoStruct[]) _output.get(new javax.xml.namespace.QName("", "array-item-list-info"));
            } catch (java.lang.Exception _exception) {
                arrayItemListInfo.value = (AllegroWebApi.ItemInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-item-list-info")), AllegroWebApi.ItemInfoStruct[].class);
            }
            try {
                arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
            } catch (java.lang.Exception _exception) {
                arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
            }
            try {
                arrayItemsAdminKilled.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-admin-killed"));
            } catch (java.lang.Exception _exception) {
                arrayItemsAdminKilled.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-admin-killed")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.MessageToBuyerStruct doGetMessageToBuyer(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmessagetobuyer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(itemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.MessageToBuyerStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.MessageToBuyerStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.MessageToBuyerStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.AddressInfoStruct[] doGetMyAddresses(java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyaddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.AddressInfoStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.AddressInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.AddressInfoStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyBidItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, AllegroWebApi.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmybiditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                bidItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "bid-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                bidItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "bid-items-counter")), int.class)).intValue();
            }
            try {
                bidItemsList.value = (AllegroWebApi.BidItemStruct[]) _output.get(new javax.xml.namespace.QName("", "bid-items-list"));
            } catch (java.lang.Exception _exception) {
                bidItemsList.value = (AllegroWebApi.BidItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "bid-items-list")), AllegroWebApi.BidItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doGetMyCurrentShipmentPriceType(java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmycurrentshipmentpricetype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyData(java.lang.String sessionHandle, AllegroWebApi.holders.UserDataStructHolder userData, AllegroWebApi.holders.InvoiceDataStructHolder invoiceData, AllegroWebApi.holders.CompanyExtraDataStructHolder companyExtraData, AllegroWebApi.holders.CompanySecondAddressStructHolder companySecondAddress, AllegroWebApi.holders.PharmacyDataStructHolder pharmacyData, AllegroWebApi.holders.AlcoholDataStructHolder alcoholData, AllegroWebApi.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                userData.value = (AllegroWebApi.UserDataStruct) _output.get(new javax.xml.namespace.QName("", "user-data"));
            } catch (java.lang.Exception _exception) {
                userData.value = (AllegroWebApi.UserDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-data")), AllegroWebApi.UserDataStruct.class);
            }
            try {
                invoiceData.value = (AllegroWebApi.InvoiceDataStruct) _output.get(new javax.xml.namespace.QName("", "invoice-data"));
            } catch (java.lang.Exception _exception) {
                invoiceData.value = (AllegroWebApi.InvoiceDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "invoice-data")), AllegroWebApi.InvoiceDataStruct.class);
            }
            try {
                companyExtraData.value = (AllegroWebApi.CompanyExtraDataStruct) _output.get(new javax.xml.namespace.QName("", "company-extra-data"));
            } catch (java.lang.Exception _exception) {
                companyExtraData.value = (AllegroWebApi.CompanyExtraDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-extra-data")), AllegroWebApi.CompanyExtraDataStruct.class);
            }
            try {
                companySecondAddress.value = (AllegroWebApi.CompanySecondAddressStruct) _output.get(new javax.xml.namespace.QName("", "company-second-address"));
            } catch (java.lang.Exception _exception) {
                companySecondAddress.value = (AllegroWebApi.CompanySecondAddressStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-second-address")), AllegroWebApi.CompanySecondAddressStruct.class);
            }
            try {
                pharmacyData.value = (AllegroWebApi.PharmacyDataStruct) _output.get(new javax.xml.namespace.QName("", "pharmacy-data"));
            } catch (java.lang.Exception _exception) {
                pharmacyData.value = (AllegroWebApi.PharmacyDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "pharmacy-data")), AllegroWebApi.PharmacyDataStruct.class);
            }
            try {
                alcoholData.value = (AllegroWebApi.AlcoholDataStruct) _output.get(new javax.xml.namespace.QName("", "alcohol-data"));
            } catch (java.lang.Exception _exception) {
                alcoholData.value = (AllegroWebApi.AlcoholDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "alcohol-data")), AllegroWebApi.AlcoholDataStruct.class);
            }
            try {
                relatedPersons.value = (AllegroWebApi.RelatedPersonsStruct) _output.get(new javax.xml.namespace.QName("", "related-persons"));
            } catch (java.lang.Exception _exception) {
                relatedPersons.value = (AllegroWebApi.RelatedPersonsStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "related-persons")), AllegroWebApi.RelatedPersonsStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyFutureItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, AllegroWebApi.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyfutureitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, filterOptions, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                futureItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "future-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                futureItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "future-items-counter")), int.class)).intValue();
            }
            try {
                futureItemsList.value = (AllegroWebApi.FutureItemStruct[]) _output.get(new javax.xml.namespace.QName("", "future-items-list"));
            } catch (java.lang.Exception _exception) {
                futureItemsList.value = (AllegroWebApi.FutureItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "future-items-list")), AllegroWebApi.FutureItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyincomingpayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(buyerId), new java.lang.Long(itemId), new java.lang.Long(transRecvDateFrom), new java.lang.Long(transRecvDateTo), new java.lang.Integer(transPageLimit), new java.lang.Integer(transOffset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserIncomingPaymentStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserIncomingPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserIncomingPaymentStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyincomingpaymentsrefunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(buyerId), new java.lang.Long(itemId), new java.lang.Integer(limit), new java.lang.Integer(offset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserIncomingPaymentRefundsStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserIncomingPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserIncomingPaymentRefundsStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyNotSoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.NotSoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, AllegroWebApi.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmynotsolditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, filterOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                notSoldItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "not-sold-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                notSoldItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-sold-items-counter")), int.class)).intValue();
            }
            try {
                notSoldItemsList.value = (AllegroWebApi.NotSoldItemStruct[]) _output.get(new javax.xml.namespace.QName("", "not-sold-items-list"));
            } catch (java.lang.Exception _exception) {
                notSoldItemsList.value = (AllegroWebApi.NotSoldItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-sold-items-list")), AllegroWebApi.NotSoldItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyNotWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, AllegroWebApi.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmynotwonitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                notWonItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "not-won-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                notWonItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-won-items-counter")), int.class)).intValue();
            }
            try {
                notWonItemsList.value = (AllegroWebApi.NotWonItemStruct[]) _output.get(new javax.xml.namespace.QName("", "not-won-items-list"));
            } catch (java.lang.Exception _exception) {
                notWonItemsList.value = (AllegroWebApi.NotWonItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-won-items-list")), AllegroWebApi.NotWonItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(sellerId), new java.lang.Long(itemId), new java.lang.Long(paymentTimeFrom), new java.lang.Long(paymentTimeTo), new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserPaymentStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserPaymentStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PaymentsInfoStruct doGetMyPaymentsInfo(java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypaymentsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PaymentsInfoStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PaymentsInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PaymentsInfoStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypaymentsrefunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(sellerId), new java.lang.Long(itemId), new java.lang.Integer(limit), new java.lang.Integer(offset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserPaymentRefundsStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserPaymentRefundsStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypayouts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(transCreateDateFrom), new java.lang.Long(transCreateDateTo), new java.lang.Integer(transPageLimit), new java.lang.Integer(transOffset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.UserPayoutStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.UserPayoutStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.UserPayoutStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMySellItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SellFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, AllegroWebApi.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysellitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, filterOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "sell-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                sellItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-items-counter")), int.class)).intValue();
            }
            try {
                sellItemsList.value = (AllegroWebApi.SellItemStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-items-list"));
            } catch (java.lang.Exception _exception) {
                sellItemsList.value = (AllegroWebApi.SellItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-items-list")), AllegroWebApi.SellItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, AllegroWebApi.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, AllegroWebApi.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysellrating");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellRatingTotalCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "sell-rating-total-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                sellRatingTotalCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-total-count")), int.class)).intValue();
            }
            try {
                sellRatingAverage.value = (AllegroWebApi.SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-average"));
            } catch (java.lang.Exception _exception) {
                sellRatingAverage.value = (AllegroWebApi.SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-average")), AllegroWebApi.SellRatingAverageStruct[].class);
            }
            try {
                sellRatingDetails.value = (AllegroWebApi.SellRatingDetailStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-details"));
            } catch (java.lang.Exception _exception) {
                sellRatingDetails.value = (AllegroWebApi.SellRatingDetailStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-details")), AllegroWebApi.SellRatingDetailStruct[].class);
            }
            try {
                sellRatingStatsPerMonth.value = (AllegroWebApi.SellRatingAveragePerMonthStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"));
            } catch (java.lang.Exception _exception) {
                sellRatingStatsPerMonth.value = (AllegroWebApi.SellRatingAveragePerMonthStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month")), AllegroWebApi.SellRatingAveragePerMonthStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMySoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, AllegroWebApi.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysolditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, filterOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soldItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "sold-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                soldItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sold-items-counter")), int.class)).intValue();
            }
            try {
                soldItemsList.value = (AllegroWebApi.SoldItemStruct[]) _output.get(new javax.xml.namespace.QName("", "sold-items-list"));
            } catch (java.lang.Exception _exception) {
                soldItemsList.value = (AllegroWebApi.SoldItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sold-items-list")), AllegroWebApi.SoldItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyWatchItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, AllegroWebApi.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywatchitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                watchItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "watch-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                watchItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watch-items-counter")), int.class)).intValue();
            }
            try {
                watchItemsList.value = (AllegroWebApi.WatchItemStruct[]) _output.get(new javax.xml.namespace.QName("", "watch-items-list"));
            } catch (java.lang.Exception _exception) {
                watchItemsList.value = (AllegroWebApi.WatchItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watch-items-list")), AllegroWebApi.WatchItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyWatchedItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, AllegroWebApi.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywatcheditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                watchedItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "watched-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                watchedItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watched-items-counter")), int.class)).intValue();
            }
            try {
                watchedItemsList.value = (AllegroWebApi.WatchedItemStruct[]) _output.get(new javax.xml.namespace.QName("", "watched-items-list"));
            } catch (java.lang.Exception _exception) {
                watchedItemsList.value = (AllegroWebApi.WatchedItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watched-items-list")), AllegroWebApi.WatchedItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetMyWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, AllegroWebApi.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywonitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sortOptions, searchValue, new java.lang.Integer(categoryId), itemIds, new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                wonItemsCounter.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "won-items-counter"))).intValue();
            } catch (java.lang.Exception _exception) {
                wonItemsCounter.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "won-items-counter")), int.class)).intValue();
            }
            try {
                wonItemsList.value = (AllegroWebApi.WonItemStruct[]) _output.get(new javax.xml.namespace.QName("", "won-items-list"));
            } catch (java.lang.Exception _exception) {
                wonItemsList.value = (AllegroWebApi.WonItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "won-items-list")), AllegroWebApi.WonItemStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpaymentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.BillingDataType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.BillingDataType[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.BillingDataType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PaymentMethodStruct[] doGetPaymentMethods(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpaymentmethods");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PaymentMethodStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PaymentMethodStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PaymentMethodStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, long[] itemsArray, long[] buyerFilterArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsArray, buyerFilterArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ItemPostBuyDataStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ItemPostBuyDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ItemPostBuyDataStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyformsdataforbuyers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, transactionsIdsArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PostBuyFormForBuyersDataStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PostBuyFormForBuyersDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PostBuyFormForBuyersDataStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyformsdataforsellers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, transactionsIdsArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PostBuyFormDataStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PostBuyFormDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PostBuyFormDataStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PostBuyItemInfoStruct[] doGetPostBuyItemInfo(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyiteminfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PostBuyItemInfoStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PostBuyItemInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PostBuyItemInfoStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetRefundsDeals(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, java.lang.String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, AllegroWebApi.holders.ArrayOfRefundsDealsListTypeHolder dealsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrefundsdeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, filterOptions, sortOrder, new java.lang.Integer(resultSize), new java.lang.Integer(resultOffset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                dealsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "deals-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                dealsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "deals-count")), int.class)).intValue();
            }
            try {
                dealsList.value = (AllegroWebApi.RefundsDealsListType[]) _output.get(new javax.xml.namespace.QName("", "deals-list"));
            } catch (java.lang.Exception _exception) {
                dealsList.value = (AllegroWebApi.RefundsDealsListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "deals-list")), AllegroWebApi.RefundsDealsListType[].class);
            }
            try {
                filtersList.value = (AllegroWebApi.FiltersListType[]) _output.get(new javax.xml.namespace.QName("", "filters-list"));
            } catch (java.lang.Exception _exception) {
                filtersList.value = (AllegroWebApi.FiltersListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "filters-list")), AllegroWebApi.FiltersListType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetRefundsList(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, AllegroWebApi.holders.ArrayOfRefundListTypeHolder refundsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrefundslist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, filterOptions, new java.lang.Integer(resultSize), new java.lang.Integer(resultOffset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                refundsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "refunds-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                refundsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refunds-count")), int.class)).intValue();
            }
            try {
                refundsList.value = (AllegroWebApi.RefundListType[]) _output.get(new javax.xml.namespace.QName("", "refunds-list"));
            } catch (java.lang.Exception _exception) {
                refundsList.value = (AllegroWebApi.RefundListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refunds-list")), AllegroWebApi.RefundListType[].class);
            }
            try {
                filtersList.value = (AllegroWebApi.FiltersListType[]) _output.get(new javax.xml.namespace.QName("", "filters-list"));
            } catch (java.lang.Exception _exception) {
                filtersList.value = (AllegroWebApi.FiltersListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "filters-list")), AllegroWebApi.FiltersListType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.RelatedItemsStruct doGetRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrelateditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.RelatedItemsStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.RelatedItemsStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.RelatedItemsStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformattribs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey, new java.lang.Long(localVersion), new java.lang.Integer(catId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
            } catch (java.lang.Exception _exception) {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), AllegroWebApi.SellFormType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
            } catch (java.lang.Exception _exception) {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), AllegroWebApi.SellFormType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
            } catch (java.lang.Exception _exception) {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), AllegroWebApi.SellFormType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsextlimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
            } catch (java.lang.Exception _exception) {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), AllegroWebApi.SellFormType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
            try {
                formFieldsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                formFieldsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(java.lang.String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsforcategory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Integer(countryId), new java.lang.Integer(categoryId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SellFormFieldsForCategoryStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SellFormFieldsForCategoryStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SellFormFieldsForCategoryStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldslimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
            } catch (java.lang.Exception _exception) {
                sellFormFields.value = (AllegroWebApi.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), AllegroWebApi.SellFormType[].class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
            try {
                verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
            } catch (java.lang.Exception _exception) {
                verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
            }
            try {
                formFieldsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                formFieldsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellratingreasons");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Integer(countryCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SellRatingInfoStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SellRatingInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SellRatingInfoStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsessionhandleforwidget");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Integer(countryCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionHandle.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle"));
            } catch (java.lang.Exception _exception) {
                sessionHandle.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle")), java.lang.String.class);
            }
            try {
                serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
            } catch (java.lang.Exception _exception) {
                serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetShipmentData(int countryId, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                shipmentDataList.value = (AllegroWebApi.ShipmentDataStruct[]) _output.get(new javax.xml.namespace.QName("", "shipment-data-list"));
            } catch (java.lang.Exception _exception) {
                shipmentDataList.value = (AllegroWebApi.ShipmentDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shipment-data-list")), AllegroWebApi.ShipmentDataStruct[].class);
            }
            try {
                localVersion.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "local-version"))).longValue();
            } catch (java.lang.Exception _exception) {
                localVersion.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "local-version")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentdataforrelateditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.RelatedItemsShipmentDataStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.RelatedItemsShipmentDataStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.RelatedItemsShipmentDataStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentpricetypes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ShipmentPriceTypeStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ShipmentPriceTypeStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ShipmentPriceTypeStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doGetShopsTags(java.lang.String sessionId, javax.xml.rpc.holders.IntHolder shopsTagsCount, AllegroWebApi.holders.ArrayOfShopsTagTypeStructHolder shopsTags) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshopstags");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShopsTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                shopsTagsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "shops-tags-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                shopsTagsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shops-tags-count")), int.class)).intValue();
            }
            try {
                shopsTags.value = (AllegroWebApi.ShopsTagTypeStruct[]) _output.get(new javax.xml.namespace.QName("", "shops-tags"));
            } catch (java.lang.Exception _exception) {
                shopsTags.value = (AllegroWebApi.ShopsTagTypeStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shops-tags")), AllegroWebApi.ShopsTagTypeStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(startingPoint), new java.lang.Integer(infoType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SiteJournal[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SiteJournal[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SiteJournal[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SiteJournalDealsStruct[] doGetSiteJournalDeals(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournaldeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(journalStart)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SiteJournalDealsStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SiteJournalDealsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SiteJournalDealsStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournaldealsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Long(journalStart)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SiteJournalDealsInfoStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SiteJournalDealsInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SiteJournalDealsInfoStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournalinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(startingPoint), new java.lang.Integer(infoType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SiteJournalInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SiteJournalInfo) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SiteJournalInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetstatesinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryCode), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.StateInfoStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.StateInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.StateInfoStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsystemtime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogettransactionsids");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsIdArray, userRole, shipmentIdArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), userLogin, userEmail, webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Float) _resp).floatValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserlogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), new java.lang.Integer(userId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetwaitingfeedbacks");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(offset), new java.lang.Integer(packageSize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.WaitFeedbackStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.WaitFeedbackStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.WaitFeedbackStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetwaitingfeedbackscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dointernalistorechange");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doInternalIStoreChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Long(userId), new java.lang.Long(istoreId), actionType, new java.lang.Long(actionDate), new java.lang.Long(validDate)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dointernalsendmessage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doInternalSendMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(userId), new java.lang.Integer(mail_template_id), arrayOfAdditionalData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userLogin, userPassword, new java.lang.Integer(countryCode), webapiKey, new java.lang.Long(localVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionHandlePart.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
            } catch (java.lang.Exception _exception) {
                sessionHandlePart.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), java.lang.String.class);
            }
            try {
                userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
            }
            try {
                serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
            } catch (java.lang.Exception _exception) {
                serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologinenc");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userLogin, userHashPassword, new java.lang.Integer(countryCode), webapiKey, new java.lang.Long(localVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionHandlePart.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
            } catch (java.lang.Exception _exception) {
                sessionHandlePart.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), java.lang.String.class);
            }
            try {
                userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
            }
            try {
                serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
            } catch (java.lang.Exception _exception) {
                serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doLoginWithAccessToken(java.lang.String accessToken, int countryCode, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologinwithaccesstoken");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessToken, new java.lang.Integer(countryCode), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionHandlePart.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
            } catch (java.lang.Exception _exception) {
                sessionHandlePart.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), java.lang.String.class);
            }
            try {
                userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
            }
            try {
                serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
            } catch (java.lang.Exception _exception) {
                serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyaccount2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, accountType, new java.lang.Integer(offset), itemsArray, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.MyAccountStruct2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.MyAccountStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.MyAccountStruct2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, long[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyaccountitemscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, accountType, itemsArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domybilling");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doMyBillingItem(java.lang.String sessionHandle, long itemId, java.lang.String option, AllegroWebApi.holders.ItemBillingListHolder entryFees, AllegroWebApi.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domybillingitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId), option});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                entryFees.value = (AllegroWebApi.ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "entry-fees"));
            } catch (java.lang.Exception _exception) {
                entryFees.value = (AllegroWebApi.ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "entry-fees")), AllegroWebApi.ItemBilling[].class);
            }
            try {
                endingFees.value = (AllegroWebApi.ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "ending-fees"));
            } catch (java.lang.Exception _exception) {
                endingFees.value = (AllegroWebApi.ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ending-fees")), AllegroWebApi.ItemBilling[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.MyContactList[] doMyContact(java.lang.String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domycontact");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, auctionIdList, new java.lang.Integer(offset), new java.lang.Integer(desc)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.MyContactList[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.MyContactList[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.MyContactList[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyfeedback2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, feedbackType, new java.lang.Integer(offset), new java.lang.Integer(desc), itemsArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.MyFeedbackListStruct2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.MyFeedbackListStruct2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyfeedback2limit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, feedbackType, new java.lang.Integer(offset), new java.lang.Integer(desc), itemsArray, new java.lang.Integer(packageElement)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.MyFeedbackListStruct2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.MyFeedbackListStruct2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, int itemTemplateId, int localId, AllegroWebApi.ItemTemplateCreateStruct itemTemplateCreate, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#donewauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, fields, new java.lang.Integer(itemTemplateId), new java.lang.Integer(localId), itemTemplateCreate, variants, tags});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
            }
            try {
                itemInfo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-info"));
            } catch (java.lang.Exception _exception) {
                itemInfo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), java.lang.String.class);
            }
            try {
                itemIsAllegroStandard.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard"))).intValue();
            } catch (java.lang.Exception _exception) {
                itemIsAllegroStandard.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doqueryallsysstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.SysStatusType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.SysStatusType[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.SysStatusType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doquerysysstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(sysvar), new java.lang.Integer(countryId), webapiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                info.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "info"));
            } catch (java.lang.Exception _exception) {
                info.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "info")), java.lang.String.class);
            }
            try {
                verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
            } catch (java.lang.Exception _exception) {
                verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremovefromblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, usersIdArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.BlackListResStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.BlackListResStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.BlackListResStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremovefromwatchlist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, itemsIdArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.ItemRemoveWatchStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.ItemRemoveWatchStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.ItemRemoveWatchStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.RemovedItemTemplatesStruct doRemoveItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremoveitemtemplates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, itemTemplateIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.RemovedItemTemplatesStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.RemovedItemTemplatesStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.RemovedItemTemplatesStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestcancelbid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(requestItemId), requestCancelReason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.RequestPayoutStruct doRequestPayout(java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestpayout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.RequestPayoutStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.RequestPayoutStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.RequestPayoutStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestsurcharge");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(transactionId), new java.lang.Float(surchargeValue), surchargeMessageToBuyer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, int sellProlongOptions, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosellsomeagain");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, sellItemsArray, new java.lang.Long(sellStartingTime), new java.lang.Integer(sellAuctionDuration), new java.lang.Integer(sellOptions), localIds, new java.lang.Integer(sellProlongOptions)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemsSellAgain.value = (AllegroWebApi.StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
            } catch (java.lang.Exception _exception) {
                itemsSellAgain.value = (AllegroWebApi.StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), AllegroWebApi.StructSellAgain[].class);
            }
            try {
                itemsSellFailed.value = (AllegroWebApi.StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
            } catch (java.lang.Exception _exception) {
                itemsSellFailed.value = (AllegroWebApi.StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), AllegroWebApi.StructSellFailed[].class);
            }
            try {
                itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
            } catch (java.lang.Exception _exception) {
                itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosellsomeagaininshop");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, sellItemsArray, new java.lang.Long(sellStartingTime), new java.lang.Integer(sellShopDuration), new java.lang.Integer(sellShopOptions), new java.lang.Integer(sellProlongOptions), new java.lang.Long(sellShopCategory), localIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemsSellAgain.value = (AllegroWebApi.StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
            } catch (java.lang.Exception _exception) {
                itemsSellAgain.value = (AllegroWebApi.StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), AllegroWebApi.StructSellAgain[].class);
            }
            try {
                itemsSellFailed.value = (AllegroWebApi.StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
            } catch (java.lang.Exception _exception) {
                itemsSellFailed.value = (AllegroWebApi.StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), AllegroWebApi.StructSellFailed[].class);
            }
            try {
                itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
            } catch (java.lang.Exception _exception) {
                itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosendemailtouser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(mailToUserItemId), new java.lang.Long(mailToUserReceiverId.value), new java.lang.Integer(mailToUserSubjectId), new java.lang.Integer(mailToUserOption), mailToUserMessage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                mailToUserReceiverId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                mailToUserReceiverId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id")), long.class)).longValue();
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllegroWebApi.PostBuyFormStruct doSendPostBuyForm(java.lang.String sessionId, AllegroWebApi.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, AllegroWebApi.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosendpostbuyform");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, newPostBuyFormSeller, newPostBuyFormCommon});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllegroWebApi.PostBuyFormStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllegroWebApi.PostBuyFormStruct) org.apache.axis.utils.JavaUtils.convert(_resp, AllegroWebApi.PostBuyFormStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doSetShipmentPriceType(java.lang.String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosetshipmentpricetype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(shipmentPriceTypeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosetuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {adminSessionHandle, userLicLogin, new java.lang.Integer(userLicCountry), new java.lang.Float(userLicDate)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ItemInfoExtHolder itemListInfoExt, AllegroWebApi.holders.ArrayOfItemCatListHolder itemCatPath, AllegroWebApi.holders.ArrayOfItemImageListHolder itemImgList, AllegroWebApi.holders.ArrayOfAttribStructHolder itemAttribList, AllegroWebApi.holders.ArrayOfPostageStructHolder itemPostageOptions, AllegroWebApi.holders.ItemPaymentOptionsHolder itemPaymentOptions, AllegroWebApi.holders.CompanyInfoStructHolder itemCompanyInfo, AllegroWebApi.holders.ProductStructHolder itemProductInfo, AllegroWebApi.holders.ArrayOfItemVariantStructHolder itemVariants) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doshowiteminfoext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Long(itemId), new java.lang.Integer(getDesc), new java.lang.Integer(getImageUrl), new java.lang.Integer(getAttribs), new java.lang.Integer(getPostageOptions), new java.lang.Integer(getCompanyInfo), new java.lang.Integer(getProductInfo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemListInfoExt.value = (AllegroWebApi.ItemInfoExt) _output.get(new javax.xml.namespace.QName("", "item-list-info-ext"));
            } catch (java.lang.Exception _exception) {
                itemListInfoExt.value = (AllegroWebApi.ItemInfoExt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-list-info-ext")), AllegroWebApi.ItemInfoExt.class);
            }
            try {
                itemCatPath.value = (AllegroWebApi.ItemCatList[]) _output.get(new javax.xml.namespace.QName("", "item-cat-path"));
            } catch (java.lang.Exception _exception) {
                itemCatPath.value = (AllegroWebApi.ItemCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-cat-path")), AllegroWebApi.ItemCatList[].class);
            }
            try {
                itemImgList.value = (AllegroWebApi.ItemImageList[]) _output.get(new javax.xml.namespace.QName("", "item-img-list"));
            } catch (java.lang.Exception _exception) {
                itemImgList.value = (AllegroWebApi.ItemImageList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-img-list")), AllegroWebApi.ItemImageList[].class);
            }
            try {
                itemAttribList.value = (AllegroWebApi.AttribStruct[]) _output.get(new javax.xml.namespace.QName("", "item-attrib-list"));
            } catch (java.lang.Exception _exception) {
                itemAttribList.value = (AllegroWebApi.AttribStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-attrib-list")), AllegroWebApi.AttribStruct[].class);
            }
            try {
                itemPostageOptions.value = (AllegroWebApi.PostageStruct[]) _output.get(new javax.xml.namespace.QName("", "item-postage-options"));
            } catch (java.lang.Exception _exception) {
                itemPostageOptions.value = (AllegroWebApi.PostageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-postage-options")), AllegroWebApi.PostageStruct[].class);
            }
            try {
                itemPaymentOptions.value = (AllegroWebApi.ItemPaymentOptions) _output.get(new javax.xml.namespace.QName("", "item-payment-options"));
            } catch (java.lang.Exception _exception) {
                itemPaymentOptions.value = (AllegroWebApi.ItemPaymentOptions) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-payment-options")), AllegroWebApi.ItemPaymentOptions.class);
            }
            try {
                itemCompanyInfo.value = (AllegroWebApi.CompanyInfoStruct) _output.get(new javax.xml.namespace.QName("", "item-company-info"));
            } catch (java.lang.Exception _exception) {
                itemCompanyInfo.value = (AllegroWebApi.CompanyInfoStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-company-info")), AllegroWebApi.CompanyInfoStruct.class);
            }
            try {
                itemProductInfo.value = (AllegroWebApi.ProductStruct) _output.get(new javax.xml.namespace.QName("", "item-product-info"));
            } catch (java.lang.Exception _exception) {
                itemProductInfo.value = (AllegroWebApi.ProductStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-product-info")), AllegroWebApi.ProductStruct.class);
            }
            try {
                itemVariants.value = (AllegroWebApi.ItemVariantStruct[]) _output.get(new javax.xml.namespace.QName("", "item-variants"));
            } catch (java.lang.Exception _exception) {
                itemVariants.value = (AllegroWebApi.ItemVariantStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-variants")), AllegroWebApi.ItemVariantStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, AllegroWebApi.holders.ShowUserFeedbacksHolder userPositiveFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNegativeFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doshowuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Integer(countryId), new java.lang.Long(userId.value), userLogin.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
            }
            try {
                userLogin.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-login"));
            } catch (java.lang.Exception _exception) {
                userLogin.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login")), java.lang.String.class);
            }
            try {
                userCountry.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-country"))).intValue();
            } catch (java.lang.Exception _exception) {
                userCountry.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-country")), int.class)).intValue();
            }
            try {
                userCreateDate.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-create-date"))).longValue();
            } catch (java.lang.Exception _exception) {
                userCreateDate.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-create-date")), long.class)).longValue();
            }
            try {
                userLoginDate.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-login-date"))).longValue();
            } catch (java.lang.Exception _exception) {
                userLoginDate.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login-date")), long.class)).longValue();
            }
            try {
                userRating.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-rating"))).intValue();
            } catch (java.lang.Exception _exception) {
                userRating.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-rating")), int.class)).intValue();
            }
            try {
                userIsNewUser.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-new-user"))).intValue();
            } catch (java.lang.Exception _exception) {
                userIsNewUser.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-new-user")), int.class)).intValue();
            }
            try {
                userNotActivated.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-not-activated"))).intValue();
            } catch (java.lang.Exception _exception) {
                userNotActivated.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-not-activated")), int.class)).intValue();
            }
            try {
                userClosed.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-closed"))).intValue();
            } catch (java.lang.Exception _exception) {
                userClosed.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-closed")), int.class)).intValue();
            }
            try {
                userBlocked.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-blocked"))).intValue();
            } catch (java.lang.Exception _exception) {
                userBlocked.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-blocked")), int.class)).intValue();
            }
            try {
                userTerminated.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-terminated"))).intValue();
            } catch (java.lang.Exception _exception) {
                userTerminated.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-terminated")), int.class)).intValue();
            }
            try {
                userHasPage.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-has-page"))).intValue();
            } catch (java.lang.Exception _exception) {
                userHasPage.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-page")), int.class)).intValue();
            }
            try {
                userIsSseller.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-sseller"))).intValue();
            } catch (java.lang.Exception _exception) {
                userIsSseller.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-sseller")), int.class)).intValue();
            }
            try {
                userIsEco.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-eco"))).intValue();
            } catch (java.lang.Exception _exception) {
                userIsEco.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-eco")), int.class)).intValue();
            }
            try {
                userPositiveFeedback.value = (AllegroWebApi.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-positive-feedback"));
            } catch (java.lang.Exception _exception) {
                userPositiveFeedback.value = (AllegroWebApi.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-positive-feedback")), AllegroWebApi.ShowUserFeedbacks.class);
            }
            try {
                userNegativeFeedback.value = (AllegroWebApi.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-negative-feedback"));
            } catch (java.lang.Exception _exception) {
                userNegativeFeedback.value = (AllegroWebApi.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-negative-feedback")), AllegroWebApi.ShowUserFeedbacks.class);
            }
            try {
                userNeutralFeedback.value = (AllegroWebApi.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-neutral-feedback"));
            } catch (java.lang.Exception _exception) {
                userNeutralFeedback.value = (AllegroWebApi.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-neutral-feedback")), AllegroWebApi.ShowUserFeedbacks.class);
            }
            try {
                userJuniorStatus.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-junior-status"))).intValue();
            } catch (java.lang.Exception _exception) {
                userJuniorStatus.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-junior-status")), int.class)).intValue();
            }
            try {
                userHasShop.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-has-shop"))).intValue();
            } catch (java.lang.Exception _exception) {
                userHasShop.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-shop")), int.class)).intValue();
            }
            try {
                userCompanyIcon.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-company-icon"))).intValue();
            } catch (java.lang.Exception _exception) {
                userCompanyIcon.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-company-icon")), int.class)).intValue();
            }
            try {
                userSellRatingCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-count"))).intValue();
            } catch (java.lang.Exception _exception) {
                userSellRatingCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-count")), int.class)).intValue();
            }
            try {
                userSellRatingAverage.value = (AllegroWebApi.SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-average"));
            } catch (java.lang.Exception _exception) {
                userSellRatingAverage.value = (AllegroWebApi.SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-average")), AllegroWebApi.SellRatingAverageStruct[].class);
            }
            try {
                userIsAllegroStandard.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard"))).intValue();
            } catch (java.lang.Exception _exception) {
                userIsAllegroStandard.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard")), int.class)).intValue();
            }
            try {
                userIsB2CSeller.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller"))).intValue();
            } catch (java.lang.Exception _exception) {
                userIsB2CSeller.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doshowuserpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowUserPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webapiKey, new java.lang.Integer(countryId), new java.lang.Long(userId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                userPageContent.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-content"));
            } catch (java.lang.Exception _exception) {
                userPageContent.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-content")), java.lang.String.class);
            }
            try {
                userPagePharmacyPermit.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-pharmacy-permit"));
            } catch (java.lang.Exception _exception) {
                userPagePharmacyPermit.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-pharmacy-permit")), java.lang.String.class);
            }
            try {
                userPageAlcoholPermit.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-alcohol-permit"));
            } catch (java.lang.Exception _exception) {
                userPageAlcoholPermit.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-alcohol-permit")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doverifyitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionHandle, new java.lang.Integer(localId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
            } catch (java.lang.Exception _exception) {
                itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
            }
            try {
                itemListed.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-listed"))).intValue();
            } catch (java.lang.Exception _exception) {
                itemListed.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-listed")), int.class)).intValue();
            }
            try {
                itemStartingTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-starting-time"))).longValue();
            } catch (java.lang.Exception _exception) {
                itemStartingTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-starting-time")), long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
