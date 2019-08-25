package br.com.alura.forum.config.validacao;

public class ErroFormDto {

	private String campo;
	private String msgErro;

	public ErroFormDto(String campo, String msgErro) {
		super();
		this.campo = campo;
		this.msgErro = msgErro;
	}
	
	public String getCampo() {
		return campo;
	}

	public String getMsgErro() {
		return msgErro;
	}

}
