package com.mstatic.paper.autoInitDatabase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.*;

@Repository  //继承自@Component,作用于持久层
public class InitDataTables {

    public static final String TABLE_DAYK = "dayK";

    @Value(value = "${spring.datasource.driver-class-name}")
    private String driver;

    @Value(value = "${spring.datasource.url}")
    private String url;

    @Value(value = "${spring.datasource.username}")
    private String userName;

    @Value(value = "${spring.datasource.password}")
    private String password;

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        //连接数据库
        Class.forName(driver);
        //测试url中是否包含useSSL字段，没有则添加设该字段且禁用
        if (url.indexOf("?") == -1) {
            url = url + "?useSSL=false";
        } else if (url.indexOf("useSSL=false") == -1 || url.indexOf("useSSL=true") == -1) {
            url = url + "&useSSL=false";
        }
        Connection conn = DriverManager.getConnection(url, userName, password);
        createDayKTable(conn);
        conn.close();
    }

    /**
     * 创建日k表
     */
    private void createDayKTable(Connection conn) throws SQLException {
        Statement stat = conn.createStatement();
        //获取数据库表名
        ResultSet rs = conn.getMetaData().getTables(null, null, TABLE_DAYK, null);
        // 判断表是否存在，如果存在则什么都不做，否则创建表
        if (rs.next()) {
            return;
        } else {
            // 先判断是否纯在表名，有则先删除表在创建表
//			stat.executeUpdate("DROP TABLE IF EXISTS "+TABLE_DAYK+" ;");

            stat.executeUpdate("CREATE TABLE "+TABLE_DAYK+"("
                    + "date varchar(20) NOT NULL COMMENT '',"
                    + "dateTime bigint DEFAULT 0 COMMENT '',"
                    + "code varchar(20) NOT NULL COMMENT '',"
                    + "open varchar(20)  DEFAULT NULL COMMENT '',"
                    + "high varchar(20) DEFAULT NULL COMMENT '',"
                    + "low varchar(20) DEFAULT NULL COMMENT '',"
                    + "close varchar(20) DEFAULT NULL COMMENT '',"
                    + "preclose varchar(20) DEFAULT NULL COMMENT '',"
                    + "volume varchar(40) DEFAULT NULL COMMENT '',"
                    + "amount varchar(40) DEFAULT NULL COMMENT '',"
                    + "adjustflag varchar(10) DEFAULT NULL COMMENT '',"
                    + "turn varchar(20) DEFAULT NULL COMMENT '',"
                    + "tradestatus  varchar(10) DEFAULT NULL COMMENT '',"
                    + "pctChg varchar(10) DEFAULT NULL COMMENT '',"
                    + "peTTM varchar(10) DEFAULT NULL COMMENT '',"
                    + "psTTM varchar(10) DEFAULT NULL COMMENT '',"
                    + "pcfNcfTTM varchar(10) DEFAULT NULL COMMENT '',"
                    + "pbMRQ varchar(10) DEFAULT NULL COMMENT '',"
                    + "isST varchar(10) DEFAULT NULL COMMENT '',"
                    + "PRIMARY KEY (date,code)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='';"
            );

//            private String date;
//            private String code;
//            private Float open;
//            private Float high;
//            private Float low;
//            private Float close;
//            private Float preclose;
//            private Long volume;
//            private Double amount;
//            private Integer adjustflag;
//            private Float turn;
//            private Float tradestatus;
//            private Float pctChg;
//            private Float peTTM;
//            private Float psTTM;
//            private Float pcfNcfTTM;
//            private Float pbMRQ;
//            private Float isST;

        }
        // 释放资源
        stat.close();
    }

    /**
     * 创建月K
     * @param conn
     */
    private void createMonthKTable(Connection conn){

    }

    /**
     * 创建5日线
     */

    private void createFiveDayKTable(Connection conn){

    }

    /**
     * 周K线
     * @param conn
     */
    private void createWeekKTable(Connection conn){

    }

    /**
     * 创建1分钟K线表
     */
    private void createMinuteKTable(){

    }


    /**
     * 5分钟K线图
     */
    private void create5MinuteKTable(){

    }


    /**
     * 30分钟K线图
     */
    private void create30MinuteKTable(){

    }
}
