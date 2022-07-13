package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Member;

import java.util.List;

/**
 * @author 陈靖
 * @date 2022/7/12
 * @describe
 */
public interface MemberDao {
    Integer findMemberCountBeforeDate(String date);
    List<Member> findAll();
    Page<Member> selectByCondition(String queryString);
    void add(Member member);
    void deleteById(Integer id);
    Member findById(Integer id);
    Member findByTelephone(String telephone);
    void edit(Member member);
    Integer findMemberCountByDate(String date);
    Integer findMemberCountAfterDate(String date);
    Integer findMemberTotalCount();
}
