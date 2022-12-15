package com.lunchmate.order.vo;

import java.util.Date;

import lombok.Data;

@Data
public class OrderVO {
	private int order_seq_num; //�ֹ� �Ϸù�ȣ(���� ���� ��ǰ�� ���ÿ� �ֹ� �� ��, �ֹ���ȣ �ϳ��� �����ϰ� ���� �ֹ����� ���� �ֹ� ��ǰ�� �����ϴ� ��ȣ) 
	private String member_id; //ȸ�� ���̵�
	
	private int order_id; //�ֹ� ��ȣ
	private int goods_id; //��ǰ ��ȣ
	private String goods_title;
	private int goods_sales_price; //��ǰ �Ǹ� ����
	private int total_goods_price; //��ü ��ǰ ����
	private int cart_goods_qty; //��ٱ��Ͽ� ��� ��ǰ ��
	private int order_goods_qty; //���� �ֹ�  ��ǰ ��
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
	private String pay_orderer_hp_num; //�޴��� ���� ��ȭ��ȣ
	private String pay_order_time;
	private String delivery_state;  //���� �ֹ� ��ǰ ��� ����
	
	private String final_total_price;
	private int goods_qty;
	private String goods_fileName;
	private String orderer_hp;
}
