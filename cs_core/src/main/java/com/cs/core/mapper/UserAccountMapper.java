package com.cs.core.mapper;

import com.cs.core.pojo.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 * 用户账户 Mapper 接口
 * </p>
 *
 * @author cs
 * @since 2022-10-13
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    void updateAccount(@Param("bindCode") String bindCode, @Param("amount") BigDecimal amount, @Param("freezeAmount") BigDecimal freezeAmount);
}
