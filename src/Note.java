public class Note {

    public static void main(String[] args) {

        int note = 70;

        // if nota < 70 = reprovado
        // if nota >= 70 = aprovado

        if (note < 70) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        // agora com diferentes graduações
        int note2 = 90;

        // graduação a = 80 b = 70 c = 60
        if (note2 >= 90) {
          System.out.println("Graduation S+");
        } else if (note2 < 80 && note2 >= 80) {
            System.out.println("Graduation A");
        } else if (note2 < 70 && note2 >=70) {
            System.out.println("Graduation B");
        } else if (note2 < 60 && note2 >= 0) {
            System.out.println("Graduation C");
        } else {
            System.out.println("Reprovado");
        }

        int note3 = 90;
        String graduation;

            if (note3 >= 90) {
                graduation = "S+";
            } else if (note3 < 80 && note3 >= 80) {
                graduation = "A";
            } else if (note3 < 70 && note3 >=70) {
                graduation = "B";
            } else if (note3 < 60 && note3 >= 0) {
                graduation = "C";
            } else {
                graduation = null;
            }

            switch (graduation) {
                case "S+":
                    System.out.println("Aprovado com S+");
                case "A":
                case "B":
                        System.out.println("Aprovado");
                case "C":
                    System.out.println("Reprovado");
                default:
                    System.out.println("Não informado");
            }
    }
}
