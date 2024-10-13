package com.spring.reactProj.domain;

import org.apache.ibatis.annotations.Mapper;

/**     Mapper Interface 생성
 * @author jsw01
 * @since 2024.10.12
 */
@Mapper
public interface UserMapper {

    // 메소드명은 Mapper.xml에 작성될 쿼리문의 ID
    //User selectUser(User user);
}
