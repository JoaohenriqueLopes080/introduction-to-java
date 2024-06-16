public class Booleano {

    public static void main(String[] args) {
            // booleanos = true or false
            boolean fimDeSemana = true;
            boolean fazendoSol = true;
            boolean vamoAPraia = fimDeSemana && fazendoSol;
            System.out.println(vamoAPraia);

            // tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        String message = fimDeSemana ? "É fim de semana"  : "Não é fim de semana";
        System.out.println(message);

        // : = else / senão



    }
    }

