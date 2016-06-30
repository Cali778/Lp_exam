package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;

public interface HotelDAO {
	
	
	List<Hotel> findAllHotel();
	
	void saveHotel(Hotel hotel);
	
	Hotel findHotelById(Long id);
	
	void deleteHotel(Hotel hotel);
	
	void updateHotel(Hotel hotel);

}
