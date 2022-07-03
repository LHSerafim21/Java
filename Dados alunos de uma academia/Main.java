/*/Uma academia mantem registro de seus alunos armazenando nome, idade, peso e
altura. A academia faz um desconto especial para menores de idade, portanto, é necessário
saber distinguir entre um aluno maior e menor. Além disso, a academia também tem
interesse em acompanhar o desempenho de seus alunos, por isso, ela também necessita
conhecer o índice de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2.
Aluno:
nome:String
idade:int
peso:float
altura:float
maior():booelan
IMC():float/*/

public class Main
{
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Luiz Henrique Serafim");
		aluno.setIdade(20);
		aluno.setValores(66.0f,1.83f);
		System.out.println(aluno.getNome());
		System.out.println(aluno.imc());
		aluno.condicao();
		aluno.condicao1();
	}
}
