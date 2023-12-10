package com.bolsadeideas.springboot.app.models.dao;

//import java.util.List;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


    //se puede hacer consulta perosnalizadas
/*

public interface IClienteDao {

 //se comenta porque se quito la clase ClienteDaoImpl
    para hacer un CrudRepository
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
*/
}
