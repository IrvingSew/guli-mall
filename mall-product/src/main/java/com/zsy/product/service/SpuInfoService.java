package com.zsy.product.service;

import com.zsy.product.entity.SpuInfoDescEntity;
import com.zsy.product.vo.SpuSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsy.common.utils.PageUtils;
import com.zsy.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zsy
 * @email zsy@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);


}

