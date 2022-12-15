package com.lunchmate.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.lunchmate.order.vo.OrderVO;

@Mapper
public interface OrderDAO {
	public List<OrderVO> listMyOrderGoods(OrderVO orderBean) throws DataAccessException;
	
	public OrderVO findMyOrder(String orderId) throws DataAccessException;
	
	public void insertNewOrder(List<OrderVO> myOrderList) throws DataAccessException;
	
	public void removeGoodsFromCart(List<OrderVO> myOrderList)throws DataAccessException;
}