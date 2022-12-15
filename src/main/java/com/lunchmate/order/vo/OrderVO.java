package com.lunchmate.order.vo;

import java.util.Date;

import lombok.Data;

@Data
public class OrderVO {
	private int order_seq_num; //주문 일련번호(여러 개의 상품을 동시에 주문 할 때, 주문번호 하나를 동일하게 갖는 주문자의 개별 주문 상품을 구분하는 번호) 
	private String member_id; //회원 아이디
	
	private int order_id; //주문 번호
	private int goods_id; //상품 번호
	private String goods_title;
	private int goods_sales_price; //상품 판매 가격
	private int total_goods_price; //전체 상품 가격
	private int cart_goods_qty; //장바구니에 담긴 제품 수
	private int order_goods_qty; //최종 주문  제품 수
	private String orderer_name;
	private String receiver_name;
	private String receiver_hp1;
	private String receiver_hp2;
	private String receiver_hp3;
	private String receiver_tel1;
	private String receiver_tel2;
	private String receiver_tel3;
	private String delivery_address;
	private String delivery_message;
	private String delivery_method;
	private String gift_wrapping;
	private String pay_method;
	private String card_com_name;
	private String card_pay_month;
	private String pay_orderer_hp_num; //휴대폰 결제 전화번호
	private String pay_order_time;
	private String delivery_state;  //현재 주문 상품 배송 상태
	
	private String final_total_price;
	private int goods_qty;
	private String goods_fileName;
	private String orderer_hp;
}
