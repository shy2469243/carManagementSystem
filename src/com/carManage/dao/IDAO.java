package com.carManage.dao;

import java.util.List;

interface IDAO<T> {
	boolean update(T t);
	int delete(List<T> t);
	boolean insert(T t);
	List<T> query(T t);
}
