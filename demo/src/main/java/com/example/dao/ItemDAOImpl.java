package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vo.ItemVO;

@Service
@Transactional
public class ItemDAOImpl implements ItemDAO{

	@Autowired
	private SqlSessionFactory sqlFactory = null;
	
	@Override
	public List<ItemVO> selectItemList() {
		return sqlFactory.openSession().selectList("Item.selectList");
	}

	@Override
	public ItemVO selectItemOne(int no) {
		return sqlFactory.openSession().selectOne("Item.selectOne", no);
	}

	@Override
	public List<ItemVO> selectItemSearch(String txt) {
		// TODO Auto-generated method stub
		return sqlFactory.openSession().selectList("Item.selectItemSearch", txt);
	}

	@Override
	public int insertItemBatch(List<ItemVO> list) {
		// TODO Auto-generated method stub
		return sqlFactory.openSession().insert("Item.insertItemBatch", list);
	}

	@Override
	public int deleteItemBatch(int[] no) {
		// TODO Auto-generated method stub
		return sqlFactory.openSession().delete("Item.deleteItemBatch", no);
	}

	@Override
	public List<ItemVO> selectItemWhere(int[] itemno) {
		// TODO Auto-generated method stub
		return sqlFactory.openSession().selectList("Item.selectItemWhere", itemno);
	}

	@Override
	public int updateItemBatch(List<ItemVO> list) {
		// TODO Auto-generated method stub
		return sqlFactory.openSession().update("Item.updateItemBatch", list);
	}

	@Override
	public int deleteItemOne(int no) {
		return sqlFactory.openSession().delete("Item.deleteItemOne", no);
	}
}