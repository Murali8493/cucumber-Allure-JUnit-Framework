package utils;

import io.cucumber.java.hu.Ha;
import io.cucumber.java.sl.In;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.List;

public class TestParam {

    String DataType;

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    String BrowserType;

    public String getBrowserType() {
        return BrowserType;
    }

    public void setBrowserType(String browserType) {
        BrowserType = browserType;
    }

    String Environment;

    public String getEnvironment() {
        return Environment;
    }

    public void setEnvironment(String env) {
        this.Environment = env;
    }

    JSONObject RequestBody;

    public JSONObject getRequestBody() {
        return RequestBody;
    }

    public void setRequestBody(JSONObject requestBody) {
        RequestBody = requestBody;
    }

    String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    String Body;

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    String UserId;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    HashMap<String, String> Headers;

    public HashMap getHeaders() {
        return Headers;
    }

    public void setHeaders(HashMap headers) {
        Headers = headers;
    }

    Response ApiResponse;

    public Response getApiResponse() {
        return ApiResponse;
    }

    public void setApiResponse(Response response) {
        ApiResponse = response;
    }

    String DivisionNumber;

    public String getDivisionNumber() {
        return DivisionNumber;
    }

    public void setDivisionNumber(String divNumber) {
        DivisionNumber = divNumber;
    }

    Integer TotalDivisions = 0;

    public Integer getTotalDivisions() {
        return TotalDivisions;
    }

    public void setTotalDivisions(Integer divisions) {
        TotalDivisions = divisions;
    }

    Integer DivisionIndex;

    public Integer getDivisionIndex() {
        return DivisionIndex;
    }

    public void setDivisionIndex(Integer divisions) {
        DivisionIndex = divisions;
    }

    String DivisionType;

    public String getDivisionType() {
        return DivisionType;
    }

    public void setDivisionType(String divType) {
        DivisionType = divType;
    }

    Integer ProductionCodes;

    public Integer getProductionCodes() {
        return ProductionCodes;
    }

    public void setProductionCodes(Integer codes) {
        ProductionCodes = codes;
    }

    Integer ProductionIndex;

    public Integer getProductionCodeIndex() {
        return ProductionIndex;
    }

    public void setProductionCodeIndex(Integer prodIndex) {
        ProductionIndex = prodIndex;
    }

    String AddedItemCode;

    public String getAddedItemCode() {
        return AddedItemCode;
    }

    public void setAddedItemCode(String itemCode) {
        AddedItemCode = itemCode;
    }

    String RemovedItemCode;

    public String getRemovedItemCode() {
        return RemovedItemCode;
    }

    public void setRemovedItemCode(String itemCode) {
        RemovedItemCode = itemCode;
    }

    String ProductionCodeSelected;

    public String getProductionCodeSelected() {
        return ProductionCodeSelected;
    }

    public void setProductionCodeSelected(String itemCode) {
        ProductionCodeSelected = itemCode;
    }

    Integer ShippingBakeryIndex;

    public Integer getShippingBakeryIndex() {
        return ShippingBakeryIndex;
    }

    public void setShippingBakeryIndex(Integer index) {
        ShippingBakeryIndex = index;
    }

    String ShippingBakeryNumber;

    public String getShippingBakeryNumber() {
        return ShippingBakeryNumber;
    }

    public void setShippingBakeryNumber(String bakeryNumber) {
        ShippingBakeryNumber = bakeryNumber;
    }

    String SatelliteBakeryNumber;

    public String getSatelliteBakeryNumber() {
        return SatelliteBakeryNumber;
    }

    public void setSatelliteBakeryNumber(String bakeryNumber) {
        SatelliteBakeryNumber = bakeryNumber;
    }

    Integer SatelliteBakeryIndex;

    public Integer getSatelliteBakeryIndex() {
        return SatelliteBakeryIndex;
    }

    public void setSatelliteBakeryIndex(Integer index) {
        SatelliteBakeryIndex = index;
    }

    String LevelType;

    public String getLevelType() {
        return LevelType;
    }

    public void setLevelType(String levelType) {
        LevelType = levelType;
    }

    String UserType;

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    List<String> ItemNames;

    public List<String> getItemNames() {
        return ItemNames;
    }

    public void setItemNames(List<String> items) {
        ItemNames = items;
    }

    List<String> ShortedItems;

    public List<String> getShortedItems() {
        return ShortedItems;
    }

    public void setShortedItems(List<String> items) {
        ShortedItems = items;
    }

    String SpecialOrderStatus;

    public String getSpecialOrderStatus() {
        return SpecialOrderStatus;
    }

    public void setSpecialOrderStatus(String bakeryNumber) {
        SpecialOrderStatus = bakeryNumber;
    }

}
