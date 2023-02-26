import java.text.DecimalFormat;

public class Distribuidora {
    public static void main(String[] args) {
        // Faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Total do faturamento mensal
        double total = sp + rj + mg + es + outros;

        // Percentual de representação de cada estado
        double percentualSp = (sp / total) * 100;
        double percentualRj = (rj / total) * 100;
        double percentualMg = (mg / total) * 100;
        double percentualEs = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        // Formatando os percentuais para exibir duas casas decimais
        DecimalFormat df = new DecimalFormat("#0.00");

        // Exibindo os resultados
        System.out.println("Percentual de representação do faturamento mensal por estado:");
        System.out.println("SP: " + df.format(percentualSp) + "%");
        System.out.println("RJ: " + df.format(percentualRj) + "%");
        System.out.println("MG: " + df.format(percentualMg) + "%");
        System.out.println("ES: " + df.format(percentualEs) + "%");
        System.out.println("Outros: " + df.format(percentualOutros) + "%");
    }
}