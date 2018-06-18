/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.epa.stormwater.model.bls;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.stormwater.model.BaseModel;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author UYEN.TRAN
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)    //do not output null values
//public class BlsCenterModel extends BaseModel implements Comparable<BlsCenterModel> {
public class BlsCenterModel extends BaseModel {

    private Integer dataYear;
    private Double inflationFactor;
    private Double regModel2014Index;
    private String blsSeriesID;
    private String state;
    private String blsCity;
    private Double regionalFactor;
    private Double latitude;
    private Double longitude;
    private Double distToCurrentPoint;
    private String geoID;
    private String blsReadyMixConcID;
    private String blsTractorShovelLoadersID;
    private String blsEnergyID;
    private String blsFuelsUtilitiesID;
    private String selectString;

    /*
    @Override
    public int compareTo(BlsCenterModel o) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain        
        //return toString().compareTo(o.toString());int compareQuantity = ((Fruit) compareFruit).getQuantity();
        double compareDistToCurrentPoint = ((BlsCenterModel) o).getDistToCurrentPoint();

        //ascending order
        return (int) (this.distToCurrentPoint - compareDistToCurrentPoint);

        //descending order
        //return compareQuantity - this.quantity;
    }
     */
    public Integer getDataYear() {
        return dataYear;
    }

    public void setDataYear(Integer dataYear) {
        this.dataYear = dataYear;
    }

    public Double getInflationFactor() {
        return inflationFactor;
    }

    public void setInflationFactor(Double inflationFactor) {
        this.inflationFactor = inflationFactor;
    }

    @JsonProperty("regModel2014Index")
    public Double getRegModel2014Index() {
        return regModel2014Index;
    }

    public void setRegModel2014Index(Double regModel2014Index) {
        this.regModel2014Index = regModel2014Index;
    }

    @JsonProperty("BLSSeriesID")
    public String getBlsSeriesID() {
        return blsSeriesID;
    }

    public void setBlsSeriesID(String blsSeriesID) {
        this.blsSeriesID = blsSeriesID;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("blsCity")
    public String getBlsCity() {
        return blsCity;
    }

    public void setBlsCity(String blsCity) {
        this.blsCity = blsCity;
    }

    @JsonProperty("regionalFactor")
    public Double getRegionalFactor() {
        return regionalFactor;
    }

    public void setRegionalFactor(Double regionalFactor) {
        this.regionalFactor = regionalFactor;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getDistToCurrentPoint() {
        return distToCurrentPoint;
    }

    public void setDistToCurrentPoint(Double distToCurrentPoint) {
        this.distToCurrentPoint = distToCurrentPoint;
    }

    @JsonProperty("GEOID")
    public String getGeoID() {
        return geoID;
    }

    public void setGeoID(String geoID) {
        this.geoID = geoID;
    }

    @JsonProperty("blsReadyMixConcID")
    public String getBlsReadyMixConcID() {
        return blsReadyMixConcID;
    }

    public void setBlsReadyMixConcID(String blsReadyMixConcID) {
        this.blsReadyMixConcID = blsReadyMixConcID;
    }

    @JsonProperty("blsTractorShovelLoadersID")
    public String getBlsTractorShovelLoadersID() {
        return blsTractorShovelLoadersID;
    }

    public void setBlsTractorShovelLoadersID(String blsTractorShovelLoadersID) {
        this.blsTractorShovelLoadersID = blsTractorShovelLoadersID;
    }

    @JsonProperty("blsEnergyID")
    public String getBlsEnergyID() {
        return blsEnergyID;
    }

    public void setBlsEnergyID(String blsEnergyID) {
        this.blsEnergyID = blsEnergyID;
    }

    @JsonProperty("blsFuelsUtilitiesID")
    public String getBlsFuelsUtilitiesID() {
        return blsFuelsUtilitiesID;
    }

    public void setBlsFuelsUtilitiesID(String blsFuelsUtilitiesID) {
        this.blsFuelsUtilitiesID = blsFuelsUtilitiesID;
    }

    public String getSelectString() {
        return selectString;
    }

    public void setSelectString(String selectString) {
        this.selectString = selectString;
    }

}
