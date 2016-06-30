package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;

public class HotelDAOImpl extends BaseDAOHibernate implements HotelDAO {
	
	public List<Hotel> findAllHotel(){
		return find(Hotel.class, "from Hotel");
	}

	public void saveHotel(Hotel hotel) {
		save(hotel);
		
	}

	public Hotel findHotelById(Long id) {
		// TODO Auto-generated method stub
		return findById(Hotel.class, id);
	}

	public void deleteHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		delete(hotel);
		
	}

	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		update(hotel);
	}
	
	
	
	
	
}
