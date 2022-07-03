/*/Um banco mantém contas de clientes armazenando o número da conta, o nome do
cliente e o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas,
mas podem sacar somente enquanto a conta possuir saldo positivo.
Conta
numeroConta:String
nome:String
saldo:double
depositar(valor:double)
sacar(valor:double)/*/

public class Main
{
	public static void main(String[] args) {
	
	Cliente cl = Cliente();
	cl.Numero("10111213");
	cl.Nome("Luiz Henrique Serafim");
	System.out.println("Digite 1: Se quiser depositar um valor"+\n+"Digite 2: Se quiser depositar um valor");
	
	}
}
