package com.toonyoo.reggie.mapper;

import com.toonyoo.reggie.pojo.AddressBook;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(AddressBook row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(AddressBook row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    AddressBook selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(AddressBook row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(AddressBook row);
}