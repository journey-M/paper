package com.mstatic.paper.domain;

public class MonthK {

    private String date;
    private String code;
    private Float open;
    private Float high;
    private Float low;
    private Float close;
    private Float preclose;
    private Long volume;
    private Double amount;
    private Integer adjustflag;
    private Float turn;
    private Float tradestatus;
    private Float pctChg;
    private Float peTTM;
    private Float psTTM;
    private Float pcfNcfTTM;
    private Float pbMRQ;
    private Float isST;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getClose() {
        return close;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public Float getPreclose() {
        return preclose;
    }

    public void setPreclose(Float preclose) {
        this.preclose = preclose;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getAdjustflag() {
        return adjustflag;
    }

    public void setAdjustflag(Integer adjustflag) {
        this.adjustflag = adjustflag;
    }

    public Float getTurn() {
        return turn;
    }

    public void setTurn(Float turn) {
        this.turn = turn;
    }

    public Float getTradestatus() {
        return tradestatus;
    }

    public void setTradestatus(Float tradestatus) {
        this.tradestatus = tradestatus;
    }

    public Float getPctChg() {
        return pctChg;
    }

    public void setPctChg(Float pctChg) {
        this.pctChg = pctChg;
    }

    public Float getPeTTM() {
        return peTTM;
    }

    public void setPeTTM(Float peTTM) {
        this.peTTM = peTTM;
    }

    public Float getPsTTM() {
        return psTTM;
    }

    public void setPsTTM(Float psTTM) {
        this.psTTM = psTTM;
    }

    public Float getPcfNcfTTM() {
        return pcfNcfTTM;
    }

    public void setPcfNcfTTM(Float pcfNcfTTM) {
        this.pcfNcfTTM = pcfNcfTTM;
    }

    public Float getPbMRQ() {
        return pbMRQ;
    }

    public void setPbMRQ(Float pbMRQ) {
        this.pbMRQ = pbMRQ;
    }

    public Float getIsST() {
        return isST;
    }

    public void setIsST(Float isST) {
        this.isST = isST;
    }


    //    参数名称	参数描述	说明
//    date	交易所行情日期	格式：YYYY-MM-DD
//    code	证券代码	格式：sh.600000。sh：上海，sz：深圳
//    open	今开盘价格	精度：小数点后4位；单位：人民币元
//    high	最高价	精度：小数点后4位；单位：人民币元
//    low	最低价	精度：小数点后4位；单位：人民币元
//    close	今收盘价	精度：小数点后4位；单位：人民币元
//    preclose	昨日收盘价	精度：小数点后4位；单位：人民币元
//    volume	成交数量	单位：股
//    amount	成交金额	精度：小数点后4位；单位：人民币元
//    adjustflag	复权状态	不复权、前复权、后复权
//    turn	换手率	精度：小数点后6位；单位：%
//    tradestatus	交易状态	1：正常交易 0：停牌
//    pctChg	涨跌幅（百分比）	精度：小数点后6位
//    peTTM	动态市盈率	精度：小数点后6位
//    psTTM	市销率	精度：小数点后6位
//    pcfNcfTTM	市现率	精度：小数点后6位
//    pbMRQ	市净率	精度：小数点后6位
//    isST	是否ST	1是，0否

}
