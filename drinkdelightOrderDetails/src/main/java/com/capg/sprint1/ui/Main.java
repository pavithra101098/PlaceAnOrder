package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.RawMaterialOrderServiceImpl;

public class Main {
static Scanner in=new Scanner(System.in);
public static void main(String[] args) {
RawMaterialOrderServiceImpl rawMaterialOrderServImplObj = new RawMaterialOrderServiceImpl();//3
System.out.println("Enter Supplier Id");//1
String id=in.nextLine();
System.out.println("Enter Delivery Status");//2
String deliveryStatus=in.nextLine();
rawMaterialOrderServImplObj.displayOrder(id, deliveryStatus);
}
}