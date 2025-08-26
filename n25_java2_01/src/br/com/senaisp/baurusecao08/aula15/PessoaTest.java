package br.com.senaisp.baurusecao08.aula15;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pe01 = new PessoaFisica();
		Pessoa pe02 = new PessoaJuridica();
		pe01.setNome("Tio Patinhas");
		try {
		pe01.setEndereco("Avenida dos Patos, 666");
		pe01.setDocumento("123.321.222-99");
		} catch (DocumentoException e) {
			System.out.println("O Documento está Inválido");
		} catch (EnderecoException e) {
			System.out.println("O Endereço está Inválido");
		} catch (Exception e) {
			e.printStackTrace();
		}
		pe01.setDataNascimento("09/09/1999");
		
		pe02.setNome("Tio Patinhas 2");
		try {
			pe02.setDocumento("123.321.222-99");
			pe02.setEndereco("Avenida dos Patos, 666");
		} catch (DocumentoException e) {
			System.out.println("O Documento está Inválido");
		} catch (EnderecoException e) {
			System.out.println("O Endereço está Inválido");
		} catch (Exception e) {
			e.printStackTrace();
		}
			pe02.setDataNascimento("09/09/1999");
			
	
		
		System.out.println(pe01);
		System.out.println(pe02);
	} 

}
