package com.vonotte.service.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vonotte.dao.UserDao;
import com.vonotte.dto.user.UserDTO;
import com.vonotte.dto.user.UserPostDTO;
import com.vonotte.model.User;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<UserDTO> findAll() {
		final Iterable<User> findAll = userDao.findAll();
		final List<UserDTO> res = new ArrayList<>();
		findAll.forEach(b -> {
			final UserDTO bDTO = transform(b);
			res.add(bDTO);
		});
		return res;
	}
	
	@Override
	public UserDTO findUserById(Integer id) {		
		return transform(userDao.findOne(id));
	}

	@Override
	public UserDTO create(UserPostDTO u) {
		final User user = transform(u);
		user.setCreatedAt(new Date());
		return transform(userDao.save(user));		
	}

	@Override
	public User transform(UserPostDTO u) {
		return dozer.map(u, User.class);
	}

	@Override
	public UserDTO transform(User u) {
		return dozer.map(u, UserDTO.class);
	}

	
}
