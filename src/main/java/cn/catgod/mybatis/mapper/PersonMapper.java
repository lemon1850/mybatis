package cn.catgod.mybatis.mapper;

import cn.catgod.mybatis.model.Person;

import java.util.Map;

/**
 * Created by tianhe on 2017/6/25.
 */
public interface PersonMapper {
     Person selectPerson(Integer i);
     Map selectPersonMap(Integer i);
}
