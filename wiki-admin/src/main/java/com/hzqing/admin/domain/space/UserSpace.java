package com.hzqing.admin.domain.space;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户跟空间的关系实体类
 * @author hzqing
 * @date 2019-05-21 14:28
 */
@Data
public class UserSpace {

    private int id;

    private int userId;

    private int spaceId;

    /**
     * 空间成员操作权限 0 浏览者 1 编辑者 2 管理员 3 创建者
     */
    private int privilege;

    private int createBy;

    private LocalDateTime createTime;

}
