package com.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DetallesRepository;
import com.modelo.Detalle;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
public class DetallesServiceJPA implements IDetallesService{

	// Inyectamos una instancia desde nuestro Root ApplicationContext.
    @Autowired
	private DetallesRepository detallesRepo;
		
	@Override
	public void insertar(Detalle detalle) {
		detallesRepo.save(detalle);
	}

	@Override
	public void eliminar(int idDetalle) {

		detallesRepo.deleteById(idDetalle);
	}

}
