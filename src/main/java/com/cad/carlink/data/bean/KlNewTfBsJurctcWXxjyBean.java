package com.cad.carlink.data.bean;

import com.cad.carlink.data.utils.StringUtils;

public class KlNewTfBsJurctcWXxjyBean {
    /**
     * SYSOPERTIME : 20180730092913861
     * START_DATE : 2018-07-30
     * OWNER_ID : 65C5DF2022434FF79B059A1F34C06E5E
     * OWNER_NAME : 海汽运输集团股份有限公司万宁分公司汽车维修厂
     * GRADATE : 2018-07-30
     * SCOPE_BUSINESS : 04201
     * END_DATE : 2024-07-29
     * ADDRESS : 万宁市万城镇万州大道东侧
     * RID : AAAdQiAAMAAHG5AAAE
     * SYN_DATE : 2018-12-17.16.2. 56. 0
     * LICENSE_NUMBER : 469006025089
     */

    private String SYSOPERTIME;
    private String START_DATE;
    private String OWNER_ID;
    private String OWNER_NAME;
    private String GRADATE;
    private String SCOPE_BUSINESS;
    private String END_DATE;
    private String ADDRESS;
    private String RID;
    private String SYN_DATE;
    private String LICENSE_NUMBER;
    private String FIRST_GRADATE;

    public String getSYSOPERTIME() {
        return SYSOPERTIME;
    }

    public void setSYSOPERTIME(String SYSOPERTIME) {
        this.SYSOPERTIME = SYSOPERTIME;
    }

    public String getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getOWNER_ID() {
        return OWNER_ID;
    }

    public void setOWNER_ID(String OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }

    public String getOWNER_NAME() {
        return OWNER_NAME;
    }

    public void setOWNER_NAME(String OWNER_NAME) {
        this.OWNER_NAME = OWNER_NAME;
    }

    public String getGRADATE() {
        return GRADATE;
    }

    public void setGRADATE(String GRADATE) {
        this.GRADATE = GRADATE;
    }

    public String getSCOPE_BUSINESS() {
        return SCOPE_BUSINESS;
    }

    public void setSCOPE_BUSINESS(String SCOPE_BUSINESS) {
        this.SCOPE_BUSINESS = SCOPE_BUSINESS;
    }

    public String getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(String END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getRID() {
        return RID;
    }

    public void setRID(String RID) {
        this.RID = RID;
    }

    public String getSYN_DATE() {
        return SYN_DATE;
    }

    public void setSYN_DATE(String SYN_DATE) {
        this.SYN_DATE = SYN_DATE;
    }

    public String getLICENSE_NUMBER() {
        return LICENSE_NUMBER;
    }

    public void setLICENSE_NUMBER(String LICENSE_NUMBER) {
        this.LICENSE_NUMBER = LICENSE_NUMBER;
    }

    public String getFIRST_GRADATE() {
        return FIRST_GRADATE;
    }

    public void setFIRST_GRADATE(String FIRST_GRADATE) {
        this.FIRST_GRADATE = FIRST_GRADATE;
    }

    public String getContext() {
        return StringUtils.replacefieldDelimiter ( SYSOPERTIME ) +
                "|" + StringUtils.replacefieldDelimiter ( START_DATE ) +
                "|" + StringUtils.replacefieldDelimiter ( OWNER_ID ) +
                "|" + StringUtils.replacefieldDelimiter ( OWNER_NAME ) +
                "|" + StringUtils.replacefieldDelimiter ( GRADATE ) +
                "|" + StringUtils.replacefieldDelimiter ( SCOPE_BUSINESS ) +
                "|" + StringUtils.replacefieldDelimiter ( END_DATE ) +
                "|" + StringUtils.replacefieldDelimiter ( ADDRESS ) +
                "|" + StringUtils.replacefieldDelimiter ( RID ) +
                "|" + StringUtils.replacefieldDelimiter ( SYN_DATE ) +
                "|" + StringUtils.replacefieldDelimiter ( LICENSE_NUMBER ) +
                "|" + StringUtils.replacefieldDelimiter ( FIRST_GRADATE );
    }


    @Override
    public String toString() {
        return "KlNewTfBsJurctcWXxjyBean{" +
                "SYSOPERTIME='" + SYSOPERTIME + '\'' +
                ", START_DATE='" + START_DATE + '\'' +
                ", OWNER_ID='" + OWNER_ID + '\'' +
                ", OWNER_NAME='" + OWNER_NAME + '\'' +
                ", GRADATE='" + GRADATE + '\'' +
                ", SCOPE_BUSINESS='" + SCOPE_BUSINESS + '\'' +
                ", END_DATE='" + END_DATE + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", RID='" + RID + '\'' +
                ", SYN_DATE='" + SYN_DATE + '\'' +
                ", LICENSE_NUMBER='" + LICENSE_NUMBER + '\'' +
                ", FIRST_GRADATE='" + FIRST_GRADATE + '\'' +
                '}';
    }
}
