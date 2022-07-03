/*/Os alunos da disciplina de Programação Orientada a Objetos da FCT/Unesp
desenvolverão dois trabalhos e duas provas ao longo do semestre. Considere que, nesse
caso, a média final é calculada pela média aritmética simples de todas as notas e que o
aluno é aprovado somente se obtiver média maior ou igual a cinco.
O Aluno possui como informação o RA, Nome e as notas – a média é calculada a partir
das notas e não precisa ser armazenada.
Aluno:
RA:String
nome:String
n1:float
n2:float
n3:float
n4:float
media():float
aprovado():boolean/*/

public class Main
{
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Luiz Henrique Serafim");
		aluno.setRa("01020304");
		aluno.setNotas(9,8,7,6);
		System.out.println(aluno.getNome()+"\n"+aluno.getRa());
		System.out.println(aluno.media());
		aluno.condicao();
		aluno.condicao1();
	}
}
