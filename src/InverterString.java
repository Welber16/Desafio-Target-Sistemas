


public class InverterString {

        public static void main(String[] args) {
            String textoOriginal = "Exemplo de string a ser invertida";
            String textoInvertido = "";

            // Percorre a string original de trás para frente
            for (int i = textoOriginal.length() - 1; i >= 0; i--) {
                textoInvertido += textoOriginal.charAt(i);
            }

            System.out.println("Texto original: " + textoOriginal);
            System.out.println("Texto invertido: " + textoInvertido);
        }

}
