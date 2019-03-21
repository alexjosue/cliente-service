package com.intercorp.retail.microservices.clienteservice.clienteservice.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Detalles de cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ApiModelProperty(notes="Nombre del cliente")
	@Column(name="nombre")
	private String nombre;
	
	@NotNull
	@ApiModelProperty(notes="Apellido del cliente")
	@Column(name="apellido")
	private String apellido;
	
	@NotNull
	@ApiModelProperty(notes="Edad del cliente")
	@Column(name="edad")
	private int edad;
	
	@Past
	@ApiModelProperty(notes="Fecha de nacimiento no puede ser mayor a hoy")
	@Column(name="fechanacimiento")
	private Date fechaNacimiento;
	
	@Transient
	@ApiModelProperty(notes="Fecha de posible deceso en base a la esperanza de vida en Peru")
	private Date fechaDeceso;
	
	public Cliente() {
		super();
	}

	public Cliente(Long id, String nombre, String apellido, int edad, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaDeceso() {
		return fechaDeceso;
	}

	public void setFechaDeceso(Date fechaDeceso) {
		this.fechaDeceso = fechaDeceso;
	}
	
}