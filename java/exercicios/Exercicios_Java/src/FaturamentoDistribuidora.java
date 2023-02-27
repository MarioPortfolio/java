import java.util.HashMap;
import java.util.Map;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
    	
        // Cria um mapa com os valores de faturamento de cada estado
    	
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calcula o faturamento total
        
        double faturamentoTotal = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        // Imprime o percentual de representação de cada estado
        
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamentoEstado = entry.getValue();
            double percentualRepresentacao = (faturamentoEstado / faturamentoTotal) * 100;
            System.out.printf("%s - %.2f%%\n", estado, percentualRepresentacao);
        }
    }
}