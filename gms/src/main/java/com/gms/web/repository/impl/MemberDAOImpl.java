package com.gms.web.repository.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
@Repository /*Service는 DAO의 역할을함*/ 
public class MemberDAOImpl implements MemberDAO{

	@Override
	public void add(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

}
