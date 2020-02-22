package com.capg.sprint1.dao;
import java.util.*;
import com.capg.sprint.model.RawMaterialOrderDetails;

public class RawMaterialOrderDaoImpl implements RawMaterialOrderDao {//6
public String displayOrder(String supplierId, String deliveryStatus) {
 Map<String,RawMaterialOrderDetails> raws =new HashMap<String, RawMaterialOrderDetails>();//7

RawMaterialOrderDetails order=new RawMaterialOrderDetails("3","sugar","1",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");//8
RawMaterialOrderDetails order1=new RawMaterialOrderDetails("5","salt","2",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"ontheWay","464");//9
RawMaterialOrderDetails order11=new RawMaterialOrderDetails("7","Tea powder","3",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"delivered","434");//10
RawMaterialOrderDetails order12=new RawMaterialOrderDetails("13","coffee powder","4",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"delivered","414");//11
RawMaterialOrderDetails order13=new RawMaterialOrderDetails("9","milk","5",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"delivered","404");//12

raws.put(order.getOrderId(), order);//12
raws.put(order1.getOrderId(), order1);//13
raws.put(order11.getOrderId(), order11);//14
raws.put(order12.getOrderId(), order12);//15
raws.put(order13.getOrderId(), order13);//16

for(String ord:raws.keySet())//17
{
if(raws.get(ord).getSupplierId().equalsIgnoreCase(supplierId) && raws.get(ord).getDeliveryStatus().equalsIgnoreCase(deliveryStatus)) {
System.out.println(raws.get(ord));//18
}
 }
return null;//19
}
}



