package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;


import com.pe.cibertec.prueba.entity.SolicitudEspecial;

public interface SolicitudEspecialService {
	 public abstract List<SolicitudEspecial> listaTodos();

	    public abstract SolicitudEspecial insertaActualizaSolicitudEspecial(SolicitudEspecial obj);

	    public abstract Optional<SolicitudEspecial> buscaSolicitudEspecial(int idSolicitudEspecial);

	    public abstract List<SolicitudEspecial> listaPorEstado(int id_estado);

	    public abstract List<SolicitudEspecial> listaSolicitudesEspecialesActivas();

	    public SolicitudEspecial actualizarSolicitudEspecial(SolicitudEspecial solicitudEspecial);
}
