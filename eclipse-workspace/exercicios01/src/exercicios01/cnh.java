package exercicios01;
import javax.swing.JOptionPane;



public class cnh {



public static void main(String[] args) {



char categoria = JOptionPane.showInputDialog("Digite a categoria que "
+ "voc� deseja saber a descri��o").charAt(0);
switch (categoria) {
case 'a':
System.out.println("a categoria A � para veiculos motorizados de "
+ "duas ou tr�s rodas");
break;
case 'b':
System.out.println("a categoia B � para veiculos de 4 rodas ou "
+ "mais, com peso de at� 3500kg ou 8 passageiros");
break;
case 'c':
System.out.println("a categoria C � para veiculo motorizado "
+ "utilizado em transporte de carga, com peso maior que "
+ "3500kg");
break;
case 'd':
System.out.println("a categoria D � para veiculo motorizado "
+ "utilizado no transporte de passageiros, "
+ "cuja lota��o exceda oito lugares, incluindo o "
+ "motorista");
break;
case 'e':
System.out.println("a categoria E � para veiculos motorizados "
+ "que se enquadra"
+ "nas categorias B, C ou D e cuja unidade acoplada, "
+ "reboque, "
+ "semirreboque, trailer ou articulada tenha 6000kg, "
+ "ou cuja lota��o exceda 8 passageiros");
break;
default:
System.out.println("Categoria invalida");
break;
}
}}