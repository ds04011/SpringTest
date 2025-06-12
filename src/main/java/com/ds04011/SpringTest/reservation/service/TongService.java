package com.ds04011.SpringTest.reservation.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.reservation.domain.Tong;
import com.ds04011.SpringTest.reservation.repository.TongRepository;

@Service
public class TongService {
	
	@Autowired
	private TongRepository tongRepository;
	
	public List<Tong> getReservationList(){
		return tongRepository.selectAllBooking();
	}
	
	public int addReservation(Tong tong) {
		int count =tongRepository.insertBooking(tong);
		return count;
	}
	
	public int deleteReservation(int id) {
		int count = tongRepository.deleteBooking(id);
		return count;
	}
	
	public Tong checkReservation(String name, String phoneNumber) {
		return tongRepository.selectByNameandPhoneNumber(name, phoneNumber);
	}
	
}
