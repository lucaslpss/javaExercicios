package exercicios01;
import javax.swing.JOptionPane;



public class habilita�ao {



public static void main(String[] args) {
int usuario = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));


if (usuario >= 18) {
System.out.println("Pode tirar a habilita��o");
} else {
System.out.println("N�o pode tirar a habilita��o");
}
}
}

