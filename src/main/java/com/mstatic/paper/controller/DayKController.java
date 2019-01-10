package com.mstatic.paper.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mstatic.paper.domain.DayK;
import com.mstatic.paper.mapper.DayKMapper;
import com.mstatic.paper.resp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DayKController {


    @Autowired
    private DayKMapper dayKMapper;
    private ObjectMapper jsonMapper = new ObjectMapper();

    @RequestMapping("/getDayKDate")
    public Response getDayKForDate(@RequestParam(value = "date", defaultValue = "2019-01-01") String date,
                                   @RequestParam(value = "code", defaultValue = "sz.000001") String code) {
        DayK dk = null;
        try {
            dk = dayKMapper.selectDayKByDate(code, date);
        } catch (Exception e) {
            Response.getDefaultErrResp("查询失败");
        }
        return Response.getDefaultSuccessResp(dk);
    }


    @RequestMapping("/getDayKDateSpan")
    public Response getDayKForDateSpan(@RequestParam(value = "dfrom", defaultValue = "2019-01-01") String dfrom,
                                       @RequestParam(value = "dto", defaultValue = "2019-01-01") String dto,
                                       @RequestParam(value = "code", defaultValue = "sz.000001") String code) {
        List<DayK> dk = dayKMapper.selectDayKByDateTime(code, dfrom, dto);
        return Response.getDefaultSuccessResp(dk);
    }


    @RequestMapping("/insertDayKs")
    public Response insertDayKs(@RequestParam(value = "values", defaultValue = "") String values) {
        System.out.println("insertDayKs------------------" + values);
        if (values == null || values.isEmpty()) {
            return Response.getDefaultErrResp("没有K线数据");
        }
        try {
            List<DayK> lsDayKs = jsonMapper.readValue(values, new TypeReference<List<DayK>>() {
            });
            if (lsDayKs != null && lsDayKs.size() != 0) {
                int res = dayKMapper.insertDayKs(lsDayKs);
                if (res != 0) {
                    return Response.getDefaultSuccessResp("插入成功");
                }
            }
        } catch (DuplicateKeyException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            return Response.getDefaultErrResp("values转换错误");
        }
        return Response.getDefaultErrResp("插入失败");
    }


}
