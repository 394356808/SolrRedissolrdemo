package cn.ssmsr.mapper;

import cn.ssmsr.po.Jd;
import cn.ssmsr.po.JdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdMapper {
    int countByExample(JdExample example);

    int deleteByExample(JdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jd record);

    int insertSelective(Jd record);

    List<Jd> selectByExample(JdExample example);

    Jd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jd record, @Param("example") JdExample example);

    int updateByExample(@Param("record") Jd record, @Param("example") JdExample example);

    int updateByPrimaryKeySelective(Jd record);

    int updateByPrimaryKey(Jd record);
}