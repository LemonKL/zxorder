package com.zxin.product.service;


import com.zxin.product.common.DecreaseStockInput;
import com.zxin.product.common.ProductInfoOutput;
import com.zxin.product.dataobject.ProductInfo;
import com.zxin.product.dto.CartDTO;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架 (up)商品
     */
    List<ProductInfo> findUpAll();


    // 改造成多模块之后的改变

//    // 查询商品列表也是后来加的查询订单的
//    List<ProductInfo> findList(List<String> productIdList);
//
//
//    // 后来加的，扣库存的
//    void decreaseStock(List<CartDTO> cartDTOList);


    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
