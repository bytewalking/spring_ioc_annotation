package com.evan.demo3;

import javax.annotation.Resource;

public class ProductService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;

    public void save(){
        System.out.println("ProductService中的save方法执行了...");
        categoryDao.save();
        productDao.save();
    }

//    public CategoryDao getCategoryDao() {
//        return categoryDao;
//    }
//
//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public ProductDao getProductDao() {
//        return productDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }
}
