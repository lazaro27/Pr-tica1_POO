import br.com.questao2.git.EmpregoDaFaculdade;
import br.com.questao3.git.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		EmpregoDaFaculdade estagio = new EmpregoDaFaculdade("Programador", 2030.50, 4);//Quest�o 02
		
		
		System.out.println(estagio.getGastos());//Quest�o 02
		System.out.println(estagio.getInfo());//Quest�o 02
		
		Aluno ze = new Aluno("Jos�", "ADS", "Terceiro", 0001, 30, 29, 60);
		
		System.out.println(ze.avaliarAluno(ze.getNotaAV1() , ze.getNotaAV2()));
		System.out.println(ze.avaliarRecupercao(ze.getNotaAV1(), ze.getNotaAV2(), ze.getNotaAE()));
		
	}

}
