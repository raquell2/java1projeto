public class montavetor {
    public static void main(String[] args) {
        int vet[] = new int[5];

        vet[0] = 5;
        vet[1] = 6;
        vet[2] = 7;
        vet[3] = 8;
        vet[4] = 9;

        for(int i = 0; i < vet.length; i++){
            System.out.println("Vetor na posicao [" + i +"] = " +vet[i]);
        }

        double mat[][] = {{1.5, 1.2}, {3.6, 4.9}, {2.4, 8.1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("M[" +i+ "] [" +j+ "]: " + mat[i][j]);
            }
        }

        String[] vetor = new String[]{"Raquel", "Claudio", "Endrik"};
        System.out.println("Os nomes informados foram: ");
        for(int cont = 0; cont < vetor.length; cont++)
        {
            System.out.println(vetor[cont]);
        }
    }
}
