import java.util.HashMap;
import java.util.Map;

public class Calculatrice {
    private final Map<String, OperationMathematique> operations;
    
    public Calculatrice() {
        operations = new HashMap<>();
        operations.put("addition", new Addition());
        operations.put("soustraction", new Soustraction());
        operations.put("multiplication", new Multiplication());
        operations.put("division", new Division());
    }
    
    public int additionner(int a, int b) {
        return operations.get("addition").executer(a, b);
    }
    
    public int soustraire(int a, int b) {
        return operations.get("soustraction").executer(a, b);
    }
    
    public int multiplier(int a, int b) {
        return operations.get("multiplication").executer(a, b);
    }
    
    public int diviser(int a, int b) {
        return operations.get("division").executer(a, b);
    }
    
    // Méthode générique pour exécuter n'importe quelle opération
    public int executer(String operation, int a, int b) {
        if (!operations.containsKey(operation)) {
            throw new IllegalArgumentException("Opération non supportée: " + operation);
        }
        return operations.get(operation).executer(a, b);
    }
}