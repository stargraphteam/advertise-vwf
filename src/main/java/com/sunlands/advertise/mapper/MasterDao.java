package com.sunlands.advertise.mapper;

import com.sunlands.advertise.dto.IllegalTextInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 *
 */
@Mapper
public interface MasterDao {
    @Select({"select count(*) from t_hm_black_word"})
    Integer count();

    @Select({"select text_id as textId, text_content as textContent from t_illegal_text" +
            " where hash_code is null"})
    List<IllegalTextInfo> listIllegalText();

    @Select({"select text_id as textId, text_content as textContent, " +
            " hash_code as hashCode from t_illegal_text" +
            " where hash_code is not null"})
    List<IllegalTextInfo> listIllegalTextWithHashCode();

    @Select({"select text_id as textId, text_content as textContent, " +
            " hash_code as hashCode from t_illegal_text"})
    List<IllegalTextInfo> listAllIllegalText();

    @Update({"update t_illegal_text set hash_code = #{hashCode} where text_id = #{textId}"})
    void updateTextHashCode(@Param("textId") Long textId, @Param("hashCode") String hashCode);
}
