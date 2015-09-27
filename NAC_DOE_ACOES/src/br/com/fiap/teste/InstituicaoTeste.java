package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Instituicao;
import br.com.fiap.dao.InstituicaoDAO;

public class InstituicaoTeste 
{
	public static void main(String[] args) 
	{
		try 
		{
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo"));
			String nome = JOptionPane.showInputDialog("Nome:");
			String email = JOptionPane.showInputDialog("Email:");
			String senha = JOptionPane.showInputDialog("Senha:");
			String telefone = JOptionPane.showInputDialog("Telefone");
			long cnpj = Long.parseLong(JOptionPane.showInputDialog("Cnpj:"));
			String endereco = JOptionPane.showInputDialog("Endere�o:");
			int segmento = Integer.parseInt(JOptionPane.showInputDialog("Segmento(int"));
			Instituicao i = new Instituicao(codigo,nome,email,senha,telefone,cnpj,endereco,segmento);
			
			InstituicaoDAO idao = new InstituicaoDAO();
			if(idao.add(i)==0)
			{
				System.out.println("FOI");
			}
			else 
			{
				System.out.println("ERRO");
			}
			System.out.println("ETAPA concluida");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
