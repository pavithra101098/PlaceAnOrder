package com.capg.sprint1.service;

import com.capg.sprint1.dao.RawMaterialOrderDaoImpl;

public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {//4

public String displayOrder(String supplierId, String deliveryStatus) {
RawMaterialOrderDaoImpl rawMaterialOrderDaoImplObj=new RawMaterialOrderDaoImpl();//5

return rawMaterialOrderDaoImplObj.displayOrder(supplierId, deliveryStatus) ;
}

}
