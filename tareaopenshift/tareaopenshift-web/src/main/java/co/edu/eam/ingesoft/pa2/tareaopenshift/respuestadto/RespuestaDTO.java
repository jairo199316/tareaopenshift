package co.edu.eam.ingesoft.pa2.tareaopenshift.respuestadto;

public class RespuestaDTO {

	private Object objeto;
	private String msj;
	private String cod;

	public RespuestaDTO() {
	}

	public RespuestaDTO(Object objeto) {
		super();
		this.objeto = objeto;
		this.msj = "Se ejecuto correctamente";
		cod = "00";
	}

	public RespuestaDTO(Object objeto, String msj, String cod) {
		super();
		this.objeto = objeto;
		this.msj = msj;
		this.cod = cod;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

}
