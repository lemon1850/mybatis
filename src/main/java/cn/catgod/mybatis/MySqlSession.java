package cn.catgod.mybatis;

import cn.catgod.mybatis.mapper.PersonMapper;
import cn.catgod.mybatis.model.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Map;

/**
 * Created by tianhe on 2017/6/25.
 */
public class MySqlSession {
    public static void main(String[] args) throws IOException{
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =ssfb.build(Resources.getResourceAsStream("mybatis_config.xml"));
//        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        Person map = (Person)sqlSession.selectOne("PersonMapper.selectPerson", 2);
        Map map = (Map)sqlSession.selectOne("cn.catgod.mybatis.PersonMapper.selectPersonMap", 2);
//       PersonMapper  personMapper = sqlSession.getMapper(PersonMapper.class);
//       Person person = personMapper.selectPerson(2);
//        System.out.println(person);
//        System.out.println(map);


    }
}
