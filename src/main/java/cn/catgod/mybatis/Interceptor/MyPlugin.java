package cn.catgod.mybatis.Interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by tianhe on 2017/6/27.
 */
@Intercepts({@Signature(type= StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class MyPlugin implements Interceptor{
    Properties props = null;

    public Object intercept(Invocation invocation) throws Throwable {
        System.err.println("before ..........");
        Object obj = invocation.proceed();
        System.err.println("after .............");
        return obj;
    }

    public Object plugin(Object o) {
        System.err.println("调用生成代理对象");
        return Plugin.wrap(o, this);
    }

    public void setProperties(Properties properties) {
        System.err.println(properties.get("dbType"));
        this.props = properties;


    }
}
