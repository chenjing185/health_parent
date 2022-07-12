package com.itheima.service;

import java.util.List;

/**
 * @author 陈靖
 * @date 2022/7/12
 * @describe
 */
public interface MemberService {
    List<Integer> findMemberCountByMonth(List<String> month);
}
