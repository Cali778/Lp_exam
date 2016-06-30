package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class HotelDAOImplTest extends AbstractUnitTest {
	
	@Autowired
	protected HotelDAO hotelDAO;
	
	
	public void testFindAllHotel(){
		System.out.println("::: "+ hotelDAO.findAllHotel());
	}

}
