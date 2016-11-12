
package com.tutorial.daomocksample;

/**
 * @author PuneetD
 *
 */
public class Service {
	
	private Dao myDao;

	public Service(Dao myDao) {
		this.myDao = myDao;
	}

	public Entity findById(long id) {
		return myDao.findById(id);
	}


}
