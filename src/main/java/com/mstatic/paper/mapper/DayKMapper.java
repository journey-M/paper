/**
 * Copyright 2015-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mstatic.paper.mapper;

import com.mstatic.paper.domain.DayK;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Eddú Meléndez
 */
@Mapper
public interface DayKMapper {

//	@Select("select * from city where state = #{code}")
//	List<DayK> findByState(@Param("code") String state, @Param("start") String start, @Param("end") String end);


//	@Insert("insert into city (id, name) values(#{nameId}, #{name})")
//	@SelectKey(statement="call next value for TestSequence", keyProperty="nameId", before=true, resultType=int.class)
//	int insertDayks(Name name);

//	          private String date;
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

//	@Insert("insert into "+InitDataTables.TABLE_DAYK +" (date, code, open, high, low, close, preclose, volume, amount," +
//			"adjustflat, turn, tradestatus, pctChg, peTTM, psTTM, pcfNcfTTM, pbMRQ, pbMRQ, isST ) values #{values}")
//	@SelectKey(statement="call next value for TestSequence", keyProperty="id", before=true, resultType=int.class)
//	int insertDayks(@Param("values") String values);


    /**
     * 插入多条数据
     */

    int insertDayKs(List<DayK> dayks);

    DayK selectDayKByDate(String code, String date);

    List<DayK> selectDayKByDateTime(String code,String dfrom, String dto);


}
