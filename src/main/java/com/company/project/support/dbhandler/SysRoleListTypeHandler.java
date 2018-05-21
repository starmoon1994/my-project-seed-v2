package com.company.project.support.dbhandler;//package com.company.project.support.db;
//
//import com.alibaba.fastjson.JSON;
//import com.company.project.model.SysRole;
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.TypeHandler;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * List<String> in java to text in sql
// * List<String> work better with FastJson
// * Created by hxy on 2018/4/10.
// */
//public class SysRoleListTypeHandler implements TypeHandler<List<SysRole>> {
//
//    @Override
//    public void setParameter(PreparedStatement ps, int i, List<SysRole> parameter, JdbcType jdbcType) throws SQLException {
//        if (parameter != null && parameter.size() > 0) {
//            String json = JSON.toJSONString(parameter);
//            ps.setString(i, json);
//        } else {
//            ps.setNull(i, Types.VARCHAR);
//        }
//    }
//
//    @Override
//    public List<SysRole> getResult(ResultSet rs, String columnName) throws SQLException {
//        String columnValue = rs.getString(columnName);
//        if (columnValue != null) {
//            return JSON.parseArray(columnValue, SysRole.class);
//        }
//
//        return new ArrayList<SysRole>(1);
//    }
//
//    @Override
//    public List<SysRole> getResult(ResultSet rs, int columnIndex) throws SQLException {
//        String columnValue = rs.getString(columnIndex);
//        if (columnValue != null) {
//            return JSON.parseArray(columnValue, SysRole.class);
//        }
//        return new ArrayList<SysRole>(1);
//    }
//
//    @Override
//    public List<SysRole> getResult(CallableStatement cs, int columnIndex) throws SQLException {
//        String columnValue = cs.getString(columnIndex);
//        if (columnValue != null) {
//            return JSON.parseArray(columnValue, SysRole.class);
//        }
//        return new ArrayList<SysRole>(1);
//    }
//}
