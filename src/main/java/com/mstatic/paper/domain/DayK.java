package com.mstatic.paper.domain;

import java.text.SimpleDateFormat;

public class DayK {

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public int dateTime; // 自定义时间类型

    private String date;
    private String code;
    private String open;
    private String high;
    private String low;
    private String close;
    private String preclose;
    private String volume;
    private String amount;
    private String adjustflag;
    private String turn;
    private String tradestatus;
    private String pctChg;
    private String peTTM;
    private String psTTM;
    private String pcfNcfTTM;
    private String pbMRQ;
    private String isST;

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

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getPreclose() {
        return preclose;
    }

    public void setPreclose(String preclose) {
        this.preclose = preclose;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAdjustflag() {
        return adjustflag;
    }

    public void setAdjustflag(String adjustflag) {
        this.adjustflag = adjustflag;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getTradestatus() {
        return tradestatus;
    }

    public void setTradestatus(String tradestatus) {
        this.tradestatus = tradestatus;
    }

    public String getIsST() {
        return isST;
    }

    public void setIsST(String isST) {
        this.isST = isST;
    }

    public String getPctChg() {
        return pctChg;
    }

    public void setPctChg(String pctChg) {
        this.pctChg = pctChg;
    }

    public String getPeTTM() {
        return peTTM;
    }

    public void setPeTTM(String peTTM) {
        this.peTTM = peTTM;
    }

    public String getPsTTM() {
        return psTTM;
    }

    public void setPsTTM(String psTTM) {
        this.psTTM = psTTM;
    }

    public String getPcfNcfTTM() {
        return pcfNcfTTM;
    }

    public void setPcfNcfTTM(String pcfNcfTTM) {
        this.pcfNcfTTM = pcfNcfTTM;
    }

    public String getPbMRQ() {
        return pbMRQ;
    }

    public void setPbMRQ(String pbMRQ) {
        this.pbMRQ = pbMRQ;
    }

    public int getDateTime() {
        if (dateTime <= 0) {
            try {
                dateTime = (int)(sdf.parse(this.date).getTime()/1000);
            } catch (Exception e) {
                e.printStackTrace();
                dateTime = -1;
            }
        }
        return dateTime;
    }

    public void setDateTime(int dateTime) {
//        if (dateTime <= 0) {
//            try {
//                dateTime = sdf.parse(this.date).getTime();
//            } catch (Exception e) {
//                e.printStackTrace();
//                dateTime = -1L;
//            }
//        }
        this.dateTime = dateTime;
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
