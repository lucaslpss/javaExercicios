package exercicios01;



import javax.swing.JOptionPane;



public class exercicio01 {



public static void main(String[] args) {
double altura =
Double.valueOf(JOptionPane.showInputDialog("Digite sua altura em centimetros"));
double peso =
Double.valueOf(JOptionPane.showInputDialog("Digite seu peso em kg"));
double imc = peso / (altura*altura);

if (imc < 17) {
System.out.println("Muito abaixo do peso");}
if (imc >= 17 && imc < 18.50) {
System.out.println("Abaixo do peso");}
if (imc >= 18.50 && imc < 24.99) {
System.out.println("Peso normal");}
if (imc >= 25 && imc < 29.99){
System.out.println("Acima do peso");}
if (imc >= 30 && imc < 34.99) {
System.out.println("Obesidade 1");}
if (imc >= 35 && imc < 39.99) {
System.out.println("Obesidade 2 (severa)");}
if (imc > 40) {
System.out.println("Obesidade 3 (morbida)");}
}
}
