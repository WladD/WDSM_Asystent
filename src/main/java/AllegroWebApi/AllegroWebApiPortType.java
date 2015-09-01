/**
 * AllegroWebApiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public interface AllegroWebApiPortType extends java.rmi.Remote {
    public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAddId, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException;
    public AllegroWebApi.PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(java.lang.String sessionId, long transactionId, AllegroWebApi.PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException;
    public AllegroWebApi.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, AllegroWebApi.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException;
    public AllegroWebApi.WatchListInfoStruct doAddToWatchList(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, AllegroWebApi.PharmacyRecipientDataStruct pharmacyRecipientData, java.lang.String variantId) throws java.rmi.RemoteException;
    public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder cancelledBids, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException;
    public int doCancelTransaction(java.lang.String sessionId, long transactionId) throws java.rmi.RemoteException;
    public AllegroWebApi.ChangedItemStruct doChangeItemFields(java.lang.String sessionId, long itemId, AllegroWebApi.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags) throws java.rmi.RemoteException;
    public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException;
    public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException;
    public AllegroWebApi.ItemDescriptionStruct doCheckItemDescription(java.lang.String sessionId, java.lang.String descriptionContent) throws java.rmi.RemoteException;
    public void doCheckNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;
    public AllegroWebApi.CreatedItemTemplateStruct doCreateItemTemplate(java.lang.String sessionId, java.lang.String itemTemplateName, AllegroWebApi.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException;
    public int doFeedback(java.lang.String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, AllegroWebApi.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException;
    public AllegroWebApi.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, AllegroWebApi.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException;
    public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException;
    public void doFinishItems(java.lang.String sessionHandle, AllegroWebApi.FinishItemsStruct[] finishItemsList, AllegroWebApi.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, AllegroWebApi.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException;
    public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException;
    public AllegroWebApi.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException;
    public AllegroWebApi.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public AllegroWebApi.CategoryData[] doGetCategoryPath(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException;
    public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public AllegroWebApi.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public AllegroWebApi.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException;
    public AllegroWebApi.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public AllegroWebApi.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, AllegroWebApi.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException;
    public AllegroWebApi.FilledPostBuyFormsStruct doGetFilledPostBuyForms(java.lang.String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException;
    public AllegroWebApi.FieldsValue[] doGetItemFields(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException;
    public AllegroWebApi.ItemTemplatesStruct doGetItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;
    public AllegroWebApi.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, AllegroWebApi.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException;
    public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException;
    public AllegroWebApi.MessageToBuyerStruct doGetMessageToBuyer(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException;
    public AllegroWebApi.AddressInfoStruct[] doGetMyAddresses(java.lang.String sessionId) throws java.rmi.RemoteException;
    public void doGetMyBidItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, AllegroWebApi.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException;
    public int doGetMyCurrentShipmentPriceType(java.lang.String sessionId) throws java.rmi.RemoteException;
    public void doGetMyData(java.lang.String sessionHandle, AllegroWebApi.holders.UserDataStructHolder userData, AllegroWebApi.holders.InvoiceDataStructHolder invoiceData, AllegroWebApi.holders.CompanyExtraDataStructHolder companyExtraData, AllegroWebApi.holders.CompanySecondAddressStructHolder companySecondAddress, AllegroWebApi.holders.PharmacyDataStructHolder pharmacyData, AllegroWebApi.holders.AlcoholDataStructHolder alcoholData, AllegroWebApi.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException;
    public void doGetMyFutureItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, AllegroWebApi.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException;
    public AllegroWebApi.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;
    public AllegroWebApi.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;
    public void doGetMyNotSoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.NotSoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, AllegroWebApi.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException;
    public void doGetMyNotWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, AllegroWebApi.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException;
    public AllegroWebApi.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber) throws java.rmi.RemoteException;
    public AllegroWebApi.PaymentsInfoStruct doGetMyPaymentsInfo(java.lang.String sessionId) throws java.rmi.RemoteException;
    public AllegroWebApi.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;
    public AllegroWebApi.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;
    public void doGetMySellItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SellFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, AllegroWebApi.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException;
    public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, AllegroWebApi.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, AllegroWebApi.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException;
    public void doGetMySoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, AllegroWebApi.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException;
    public void doGetMyWatchItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, AllegroWebApi.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException;
    public void doGetMyWatchedItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, AllegroWebApi.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException;
    public void doGetMyWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, AllegroWebApi.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException;
    public AllegroWebApi.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public AllegroWebApi.PaymentMethodStruct[] doGetPaymentMethods(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public AllegroWebApi.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, long[] itemsArray, long[] buyerFilterArray) throws java.rmi.RemoteException;
    public AllegroWebApi.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;
    public AllegroWebApi.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;
    public AllegroWebApi.PostBuyItemInfoStruct[] doGetPostBuyItemInfo(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public void doGetRefundsDeals(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, java.lang.String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, AllegroWebApi.holders.ArrayOfRefundsDealsListTypeHolder dealsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;
    public void doGetRefundsList(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, AllegroWebApi.holders.ArrayOfRefundListTypeHolder refundsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;
    public AllegroWebApi.RelatedItemsStruct doGetRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;
    public AllegroWebApi.SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(java.lang.String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;
    public AllegroWebApi.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException;
    public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doGetShipmentData(int countryId, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException;
    public AllegroWebApi.RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public AllegroWebApi.ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doGetShopsTags(java.lang.String sessionId, javax.xml.rpc.holders.IntHolder shopsTagsCount, AllegroWebApi.holders.ArrayOfShopsTagTypeStructHolder shopsTags) throws java.rmi.RemoteException;
    public AllegroWebApi.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;
    public AllegroWebApi.SiteJournalDealsStruct[] doGetSiteJournalDeals(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException;
    public AllegroWebApi.SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException;
    public AllegroWebApi.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;
    public AllegroWebApi.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException;
    public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public AllegroWebApi.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException;
    public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException;
    public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException;
    public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doLoginWithAccessToken(java.lang.String accessToken, int countryCode, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public AllegroWebApi.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException;
    public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, long[] itemsArray) throws java.rmi.RemoteException;
    public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public void doMyBillingItem(java.lang.String sessionHandle, long itemId, java.lang.String option, AllegroWebApi.holders.ItemBillingListHolder entryFees, AllegroWebApi.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException;
    public AllegroWebApi.MyContactList[] doMyContact(java.lang.String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException;
    public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException;
    public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException;
    public void doNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, int itemTemplateId, int localId, AllegroWebApi.ItemTemplateCreateStruct itemTemplateCreate, AllegroWebApi.VariantStruct[] variants, AllegroWebApi.TagNameStruct[] tags, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;
    public AllegroWebApi.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException;
    public AllegroWebApi.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException;
    public AllegroWebApi.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException;
    public AllegroWebApi.RemovedItemTemplatesStruct doRemoveItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;
    public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException;
    public AllegroWebApi.RequestPayoutStruct doRequestPayout(java.lang.String sessionId) throws java.rmi.RemoteException;
    public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException;
    public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, int sellProlongOptions, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;
    public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;
    public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException;
    public AllegroWebApi.PostBuyFormStruct doSendPostBuyForm(java.lang.String sessionId, AllegroWebApi.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, AllegroWebApi.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException;
    public int doSetShipmentPriceType(java.lang.String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException;
    public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException;
    public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ItemInfoExtHolder itemListInfoExt, AllegroWebApi.holders.ArrayOfItemCatListHolder itemCatPath, AllegroWebApi.holders.ArrayOfItemImageListHolder itemImgList, AllegroWebApi.holders.ArrayOfAttribStructHolder itemAttribList, AllegroWebApi.holders.ArrayOfPostageStructHolder itemPostageOptions, AllegroWebApi.holders.ItemPaymentOptionsHolder itemPaymentOptions, AllegroWebApi.holders.CompanyInfoStructHolder itemCompanyInfo, AllegroWebApi.holders.ProductStructHolder itemProductInfo, AllegroWebApi.holders.ArrayOfItemVariantStructHolder itemVariants) throws java.rmi.RemoteException;
    public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, AllegroWebApi.holders.ShowUserFeedbacksHolder userPositiveFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNegativeFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException;
    public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException;
    public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException;
}
