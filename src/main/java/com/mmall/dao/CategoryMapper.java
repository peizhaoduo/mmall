package com.mmall.dao;

import com.mmall.pojo.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}